/*NEED COFFEE*/
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import psicultura.EspeciePeixe;
import psicultura.Funcionario;
import psicultura.Tanque;

/**
 * banco = "jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv"
 * user = "pvunmqpv"
 * password = "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA"
 * as funções insertFuncionario,insertTanque são publicas
 */
public class InsertTable {

 
    /**
=======
    String banco;
    String user;
    String password;
   
    public InsertTable(String banco,String user,String password){
        this.setBanco(banco);
        this.setUser(user);
        this.setPassword(password);
    }
    
    
   /**
>>>>>>> f8333e94c9450ac36f45f408cfbd855225232fa3
      * devem ser feitos 3 inserts  para inserir um objeto funcinario dentro do banco
      * @param f 
      * aqui abrimos o objeto funcionario e transformamos em string de comando SQL
         
   public void insertFuncionario(Funcionario f){
        Connection c = null;
        Statement stmt_1 = null;
        ArrayList dados ;
        String comando_insFun;
        int tam;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password ); 
            System.out.println("Base de dados aberta");
            stmt_1 = c.createStatement();

            
>>>>>>> f8333e94c9450ac36f45f408cfbd855225232fa3
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
        

    
   private void insertContato(Funcionario f, String fk_id){
       /*
   }
        Connection c  = null;
        Statement stm = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user,password ); 
            SelectTable select = new SelectTable();
            ArrayList  tabela_contato = select.selectTable("SELECT * FROM contato;");
            
            String idcontato1         = String.valueOf(tabela_contato.size()+1);
            String idcontato2         = String.valueOf(tabela_contato.size()+2);
            String[] contatos         = f.pega_contatos(f);
            String email              = contatos[0];
            String telefone           = contatos[1];
            String fk_tipocontato_idtipo;
            String fk_funcionario_idfuncionario=fk_id ;
            String ins_cont1 = idcontato1 + ",'" + email      + "' ,1 ,"+fk_funcionario_idfuncionario;
            String ins_cont2 = idcontato2 + ",'" + telefone   + "' ,2 ,"+fk_funcionario_idfuncionario;
            
            ins_cont1 = "insert into contato(idcontato,dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario) values("+ins_cont1+");";
            ins_cont2 = "insert into contato(idcontato,dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario) values("+ins_cont2+");";
            
        }catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " +  e.getMessage());            
        }
        System.out.println("insert successfully");
   }

   public void insertTanque(Tanque t){
       Connection c = null;
       Statement stm = null;
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
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /**
    * getter e setter
   
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
   
   */

}
