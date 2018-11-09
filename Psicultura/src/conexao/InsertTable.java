/*NEED COFFEE*/
package conexao;

//import com.sun.org.apache.bcel.internal.generic.Select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import psicultura.Endereco;
import psicultura.Peixe;
import psicultura.Funcionario;
import psicultura.Tanque;
import conexao.SelectTable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * banco = "jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv"
 * user = "pvunmqpv"
 * password = "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA"
 * as funções insertFuncionario,insertTanque são publicas
 */
public class InsertTable {

    String banco;
    String user;
    String password;
   /**
    * construtor here
    * @param banco
    * @param user
    * @param password 
    */
    public InsertTable(String banco,String user,String password){
        this.setBanco(banco);
        this.setUser(user);
        this.setPassword(password);
    }

    /**
     * macro rotinas
     * primeiro inserir o tanquedps a pessoas
     * AdicionarFuncionario() precisa de um funcionario completo
     * @param fun
     */
    
    public void AdicionarTanque(Tanque t){
        InsertPeixe(t.getPeixe());
        try {
            InsertTanque(t);
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void AdicionarFuncionario(Funcionario fun){
        
            // fazer verificação de valores  do endereço e funcionario 
        //primerio inserir funcionario    
        InsertFuncionario(fun);
        try {
            //Insere o endereco
            InsertEndereco(fun);
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void InsertFuncionario(Funcionario fun) {
        Connection c = null;
        Statement stmt = null;
        /*monstando a query */
        //idfuncionario	nome	cpf	fk_tanque_idtanque	fk_turno_idturno	fk_cargo_idcargo
        String query="INSERT INTO funcionarios( idfuncionario,nome,cpf,fk_tanque_idtanque,fk_turno_idturno,fk_cargo_idcargo) values";
        String id, nome ,cpf, fk_idtanque, fk_idturno,fk_idcargo;
        nome        = fun.getNome();
        cpf         = fun.getCpf();
        fk_idtanque = String.valueOf(fun.getTanque_do_func().getId_tanque());
        fk_idturno  = fun.getTurno_de_trabalho().getIdTurno(fun.getTurno_de_trabalho());
        fk_idcargo  = fun.getCargo().getIdcargo(fun.getCargo());
        
        nome="'"+nome+"'";
        cpf="'"+cpf+"'";
        query=query+"("+nome+","+cpf+","+fk_idtanque+","+fk_idturno+","+fk_idcargo+");";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password );
            c.createStatement();
            stmt.executeUpdate(query); 
            stmt.close();
            c.close();
         }catch(Exception e){
             System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
         }
         System.out.println("insercão de funcionario feita");
    }
    private void InsertEndereco(Funcionario fun) throws SQLException{
        Connection c = null;
        Statement stmt = null;
        String query="INSERT INTO endereco(idfun, cidade, bairro, logradouro, complemento, cep, fk_funcionario_idfuncionario) values ";
        String idfun, cidade, bairro, logradouro, complemento, cep, fk_idfuncionario;
        /**/
        idfun           = getIdFuncionario(fun);
        cidade          = "'"+fun.getMoradia().getCidade()+"'";
        bairro          = "'"+fun.getMoradia().getBairro()+"'";
        logradouro      = "'"+fun.getMoradia().getLorgadouro()+"'";
        complemento     = "'"+fun.getMoradia().getComplemento()+"'";
        cep             = "'"+fun.getMoradia().getCep()+"'";  
        fk_idfuncionario= idfun;
        query=query+"("+idfun+","+cidade+","+bairro+","+logradouro+","+complemento+","+cep+","+fk_idfuncionario+");";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password );
            c.createStatement();
            stmt.executeUpdate(query); 
            stmt.close();
            c.close();
         }catch(Exception e){
             System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
         }
    }
    private String getIdFuncionario(Funcionario fun) throws SQLException{
        String result=null;
        String cpf=fun.getCpf();
        SelectTable s = new SelectTable();
        ArrayList reusltado_query;
        reusltado_query = s.selectTable("SELECT id FROM funcionario where cpf='"+cpf+"';");
        ResultSet rs =(ResultSet) reusltado_query.get(0);
        result=rs.getString(1);
        
        
        return result;
    }
    
    
    
    private void InsertTanque(Tanque t) throws SQLException{
        Connection c = null;
        Statement stmt = null;
        String query="INSERT INTO tanque(idtanque,temperatura,ph,oxigenio,fk_peixe_idpeixe)values";
        String id,temp,ph,oxi,fk_idpeixe;
        id   = String.valueOf(t.getId_tanque());
        temp = String.valueOf(t.getSensor_temp());
        oxi  = String.valueOf(t.getSensor_oxi());
        ph   = String.valueOf(t.getSensor_ph());
        fk_idpeixe = getIdPeixe(t.getPeixe());
        query=query+"("+id+","+temp+","+ph+","+oxi+","+fk_idpeixe+");";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password );
            c.createStatement();
            stmt.executeQuery(query); 
            stmt.close();
            c.close();
         }catch(Exception e){
             System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
         }
        
    }
    private void InsertPeixe(Peixe fish){
        Connection c    =   null;
        Statement stmt  =   null;
        String query="INSERT INTO  peixe (IdPeixe,NomeCientifico,TipoAgua,TempMin,TempMax,PhMin,PhMax,OxMin,OxMax) values";
        String idPeixe,nomeCientifico,tipoAgua,tempMin,tempMax,phMin,phMax,oxMin,oxMax;
        idPeixe=PegaId(fish);
        nomeCientifico = fish.getNome_especie();
        tipoAgua = fish.getTipo_agua();
        tempMin = String.valueOf(fish.getTemp_min());
        tempMax = String.valueOf(fish.getTemp_max());
        phMin  = String.valueOf(fish.getPh_min());
        phMax = String.valueOf(fish.getPh_max());
        oxMin = String.valueOf(fish.getPorcetagem_oxi_min());
        oxMax = String.valueOf(fish.getPorcetagem_oxi_max());
        query=query+"("+idPeixe+","+nomeCientifico+","+tipoAgua+","+tempMin+","+tempMax+","+phMin+","+phMax+","+oxMin+","+oxMax+");";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password );
            c.createStatement();
            stmt.executeQuery(query); 
            stmt.close();
            c.close();
         }catch(Exception e){
             System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
         }
        System.out.println("peixe inserido");
    }
    /**
     *pegar indice
     * pega o ID do peixe a ser criado
     */   
    private String PegaId(Peixe fish){
        String id="";
        ArrayList result;
        SelectTable select= new SelectTable();
        String nomecientifico=fish.getNome_especie();
        result = select.selectTable("select * from peixe;");          
        if (result.isEmpty()){
            id="1";
        }else{
            id=String.valueOf(result.size()+1);
        }       
        
        return id;
    }
    
    
    
    private String getIdPeixe(Peixe fish) throws SQLException{
        String fk="";
        ArrayList result;
        SelectTable select= new SelectTable();
        String nomecientifico=fish.getNome_especie();
        result = select.selectTable("select idpeixe from peixe where nomecientifico='+"+nomecientifico+"';");
        ResultSet rs = (ResultSet) result.get(0);
        fk =rs.getString(1);
        return fk;
    }
    
 
 /**
  * getter and setter
  * @return 
  */   
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
     