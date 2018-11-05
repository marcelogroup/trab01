/*NEED COFFEE*/
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import psicultura.Funcionario;
import psicultura.Tanque;
/**
 * banco = "jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv"
 * user = "pvunmqpv"
 * password = "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA"
 * @author 20151bsi0436
 */
public class InsertTable {
    String banco;
    String user;
    String password;
   
    public InsertTable(String banco,String user,String password){
        this.setBanco(banco);
        this.setUser(user);
        this.setPassword(password);
    }
    
    public void insertTable(String tabela,String[]campos , String[] valores){       
        Connection c = null;
        Statement stmt = null;
        String campos_str=lista_to_string(campos);
        String valores_str=lista_to_string(valores);
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password ); 
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();
            String sql = ("insert into"+tabela+"("+campos_str+")"+"VALUES"+valores_str );
            stmt.executeQuery(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("Table created successfully");
        
    }
    
    
   private String lista_to_string(String[] lista){
       String result="";
       for (int i=0 ; i<lista.length ; i++ ){
           result=result+", "+lista[1];           
       }
       
       return result;
   } 
    
   /**
      * devem ser feitos 3 inserts  para inserir um objeto funcinario dentro do banco
      * @param f 
      * aqui abrimos o objeto funcionario e transformamos em string de comando SQL
      */   
   public void insertFuncionario(Funcionario f){
        Connection c = null;
        Statement stmt_1 = null;
        Statement stmt_2 = null;
        Statement stmt_3 = null;
        ArrayList dados ;
        String comando_insFun;
        int tam;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password ); 
            System.out.println("Base de dados aberta");
            stmt_1 = c.createStatement();
            stmt_2 = c.createStatement();
            stmt_3 = c.createStatement();
            /**
             * preparar dados do objeto funcionario para inserssão
             * dados( idfuncionario , nome, cpf, fk_tanque_idtanque, fk_turno_idturno, fk_cargo_idcargo)
             */
            
            String idfuncionario; 
            String nome;
            String cpf;
            String idtanque;
            String idturno;
            String idcargo="2";
            
            SelectTable select = new SelectTable();
            dados           = select.selectTable("SELECT * FROM funcionario;");
            tam             = dados.size()+1;            
            idfuncionario   = String.valueOf(tam);
            nome            = f.getNome();
            cpf             = f.getCpf();                       
            //pegando tanque
            if(f.tanque_do_func==null){
                idtanque    = "null";
            }else{
                idtanque    = String.valueOf(f.tanque_do_func.getId_tanque());
            }
        
            idturno =f.getTurno();
            comando_insFun = idfuncionario+",'"+nome +"', '"+ cpf +"',"+ idtanque+","+ idturno+","+ idcargo ;
            comando_insFun = "insert into funcionario (idfuncionario , nome, cpf, fk_tanque_idtanque, fk_turno_idturno, fk_cargo_idcargo) values ("+comando_insFun+");" ;
            /**
             * inserindo na tabela contato
             * tipo contato 2 telefone ,1 email
             * valores da tabela contato (idcontato, dado, fk_tipocontato_idtipo, fk_funcionario_idfuncionario)
             * insert email
             * insert telefone
             */
            ArrayList  tabela_contato = select.selectTable("SELECT * FROM contato;");
            String idcontato1         = String.valueOf(tabela_contato.size()+1);
            String idcontato2         = String.valueOf(tabela_contato.size()+2);
            String[] contatos         = f.pega_contatos(f);
            String email              = contatos[0];
            String telefone           = contatos[1];
            String fk_tipocontato_idtipo;
            String fk_funcionario_idfuncionario=String.valueOf(tam) ;
            String ins_cont1 = idcontato1 + ",'" + email      + "' ,1 ,"+fk_funcionario_idfuncionario;
            String ins_cont2 = idcontato2 + ",'" + telefone   + "' ,2 ,"+fk_funcionario_idfuncionario;
            
            ins_cont1 = "insert into contato(idcontato,dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario) values("+ins_cont1+");";
            ins_cont2 = "insert into contato(idcontato,dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario) values("+ins_cont2+");";
 
            stmt_1.executeUpdate(comando_insFun);               
            stmt_2.executeUpdate(ins_cont1);    
            stmt_3.executeUpdate(ins_cont2);

            stmt_1.close();
            stmt_2.close();
            stmt_3.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
        }
        System.out.println("insert successfully");
        
    }
  /**
   * criar script dce insert contato sepearar do 
   */
   
   /**
    * insere um objeto tanque dentro do banco de dados 
    * (idtanque,temperatura,ph,oxigenio,fk_peixe_idpeixe)
    * @param t 
    */  
   public void insertTanque(Tanque t){
       Connection c = null;
       Statement stm = null;
       try{
           Class.forName("org.postgresql.Driver");
           c = DriverManager.getConnection(banco,user,password ); 
           System.out.println("Base de dados aberta");
           /**
            * criar variaveis para aabrir o tipo tanque 
            */
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
           if(t.getPeixe()==null){
               fk_peixe = "null";
           } else{
               fk_peixe = "2";//dourado RESOLVER TIPAGEM
           }
           
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
    * getter e setter
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
