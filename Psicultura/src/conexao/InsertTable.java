/*NEED COFFEE*/
package conexao;

import com.sun.org.apache.bcel.internal.generic.Select;
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
    public  void InsertTable(String banco,String user,String password){
        this.setBanco(banco);
        this.setUser(user);
        this.setPassword(password);
    }

    public void InsertFuncionario(Funcionario fun) {
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
    public void InsertEndereco(Funcionario fun) throws SQLException{
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
    
    public void InsertTanque(Tanque t){
        Connection c = null;
        Statement stmt = null;
        String query="INSERT INTO tanque(idtanque,temperatura,ph,oxigenio,fk_peixe_idpeixe)values";
        String id,temp,ph,oxi,fk_idpeixe;
        id   = String.valueOf(t.getId_tanque());
        temp = String.valueOf(t.getSensor_temp());
        oxi  = String.valueOf(t.getSensor_oxi());
        ph   = String.valueOf(t.getSensor_ph());
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
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
           
   

  
       /**
            * criar variaveis para aabrir o tipo tanque 
            
           String insert_tan;
           String temp;
           String oxi;
           String ph;
           String id;
           String fk_peixe;
           temp = String.valueOf(t.getSensor_temp() );
           oxi  = String.valueOf(t.getSensor_oxi()  );
           ph   = String.valueOf(t.getSensor_ph()   );
           id   = String.valueOf(t.getId_tanque()   );
           if(t.getPeixe()== null)
           {
               fk_peixe = "null";
           }
           else
           {
               fk_peixe=insertPeixe_privado(t.getPeixe());
               
           }
       try{
           Class.forName("org.postgresql.Driver");
           c = DriverManager.getConnection(banco,user,password ); 
           System.out.println("Base de dados aberta");  
           stm=c.createStatement();
           insert_tan = "insert into tanque(idtanque, temperatura, ph, oxigenio, fk_peixe_idpeixe)values("+id+","+temp+","+ph+","+oxi+","+fk_peixe+")";
           stm.executeUpdate(insert_tan); 
           stm.close();
           c.close();
           
       }catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
        }
       System.out.println("insert tanque successfully");

   }
/**
    * 
    * @param fish
    * @return  uma strinf com o id fo peixa para a função inserTanque  
   
   private String insertPeixe_privado(EspeciePeixe fish){
        String id_peixe="";
        Connection c = null;
        Statement stmt = null;
        SelectTable select= new SelectTable();
        String nome_peixe=fish.getNome_especie();
        ArrayList resultado = select.selectTable("SELECT * FROM peixe WHERE nomecientifico="+nome_peixe+" ;");
        if(resultado.size()==1)
        {    
            //peixe ja existe no banco
            id_peixe=String.valueOf(resultado.get(1));
        }
        else
        {              
            try{
                resultado = select.selectTable("SELECT * FROM peixe ;");
                id_peixe=String.valueOf((resultado.size()+1));
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection(banco,user,password ); 
                String nome_cientifico,  oxi_max,    oxi_min,    ph_max, ph_min, temp_max,   temp_min, agua ;
                nome_cientifico=fish.getNome_especie();
                oxi_max  =   String.valueOf(fish.getPorcetagem_oxi_max());
                oxi_min  =   String.valueOf(fish.getPorcetagem_oxi_min());
                ph_max   =   String.valueOf(fish.getPh_max());
                ph_min   =   String.valueOf(fish.getPh_min());
                temp_max =   String.valueOf(fish.getTemp_max());
                temp_min =   String.valueOf(fish.getTemp_min());
                agua     =   String.valueOf(fish.getTipo_agua());
                String comando ="insert into peixe (idpeixe,nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax)values("+id_peixe+","+nome_cientifico+","+agua+","+temp_min+","+temp_max+","+ph_min+","+ph_max+","+oxi_min+","+oxi_max+");";
                stmt=c.createStatement();
                stmt.executeUpdate(comando); 
                stmt.close();
                c.close();
            }
            catch (Exception e)
            {
                System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
            }   
            System.out.println("peixe inserido com sucesso!!!");
        }
       return id_peixe;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 */