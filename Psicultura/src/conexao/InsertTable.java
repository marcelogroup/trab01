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

    public InsertTable(String banco,String user,String password){
        this.setBanco(banco);
        this.setUser(user);
        this.setPassword(password);
    }
    
    public String getBanco() {
        return banco;
    }

    private void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUser() {
        return user;
    }

    private void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
   

    public synchronized void InsertPeixe    (Peixe fish){
        Connection c = null;
        Statement stmt=null;
        try{
           
            String nomecientifico="'"+fish.getNome_especie()+"'";
            String query_1="select * from peixe where nomecientifico="+nomecientifico +";";
            boolean tem_o_peixe=false;
            String query_2="select * from peixe;";
            String id="";
            int tam=0;
            boolean esta_vazio=true;
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user, password);           
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query_1);
            tem_o_peixe=rs.next();
            System.out.println(tem_o_peixe);
            
            //stmt = c.createStatement();
            ResultSet rsv2 = stmt.executeQuery(query_2);
            while(rsv2.next()){
                tam++;
                esta_vazio=false;
            }
            System.out.println("banco esta vaxio ?"+esta_vazio+"\ntamanho do banco : "+tam);
             tam++;
            if(tem_o_peixe){
                System.out.println("faça nada");
            }else{

                if(esta_vazio){
                    System.out.println("id deve receber 1");
                    id="1";
                }else{
                    System.out.println("id deve receber "+tam);
                    id=String.valueOf(tam);
                }
                System.out.println("inserir objeto");
                String tipoagua="'"+fish.getTipo_agua()+"'";
                String query_3="INSERT INTO peixe (idpeixe,nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax)values";
                String tempmin=String.valueOf(fish.getTemp_min());
                String tempmax=String.valueOf(fish.getTemp_max());
                String phmin=String.valueOf(fish.getPh_min());
                String phmax=String.valueOf(fish.getPh_max());
                String oxmin=String.valueOf(fish.getPorcetagem_oxi_min());
                String oxmax=String.valueOf(fish.getPorcetagem_oxi_max());
                query_3=query_3+"("+id+","+nomecientifico+","+tipoagua+","+tempmin+","+tempmax+","+phmin+","+phmax+","+oxmin+","+oxmax+");";
                //stmt = c.createStatement();
                try {
                    stmt.executeUpdate(query_3);
                } catch (SQLException ex) {
                    Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
                }
        
  
            }
        }   catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public synchronized void InsertTanque   (Tanque t){
        //pegar chave estrangeira    
        //converter objeto em comando
        Connection c =null;
        try{
        
        Statement stmt=null;
        String idtanque  = String.valueOf(t.getId_tanque());
        String sensor_ox = String.valueOf(t.getSensor_oxi());
        String sensor_ph = String.valueOf(t.getSensor_ph());
        String sensor_temp = String.valueOf(t.getSensor_temp());
        String fk_peixe;
        String nomecientifico="'"+String.valueOf(t.getPeixe().getNome_especie())+"'";
        Class.forName("org.postgresql.Driver");
        c = DriverManager.getConnection(banco,user, password);           
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("select * from peixe where nomecientifico="+nomecientifico+";");
        rs.next();
        fk_peixe=rs.getString(1);
        String query="INSERT INTO tanque (temperatura,ph,oxigenio,FK_Peixe_IdPeixe)values("+sensor_temp+","+sensor_ph+","+sensor_ox+","+fk_peixe+");";
        System.out.println(query);
        stmt.executeUpdate(query);
        stmt.close();
        
                
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    } 
    public synchronized void AdicionarTanque(Tanque t){
        InsertPeixe(t.getPeixe());
        InsertTanque(t);
        /*try{
            Thread.sleep(10000);
            InsertTanque(t);
        }catch(Exception e){
            System.out.println("Deu erro!");
        }*/
    }
    public void InsertFuncionario(Funcionario fun){
        String comando="insert into funcionario(nome , cpf , fk_tanque_idtanque , fk_turno_idturno , fk_cargo_idcargo)values";
        String nome="'"+fun.getNome()+"'";
        String cpf="'"+fun.getCpf()+"'";
        String idtanque=String.valueOf(fun.getTanque_do_func().getId_tanque());
        String turno = fun.getTurno_de_trabalho().getIdTurno( fun.getTurno_de_trabalho() );
        String cargo =fun.getCargo().getIdcargo(fun.getCargo());
        comando=comando+"("+nome+","+cpf+","+idtanque+","+turno+","+cargo+");";
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user, password); 
            stmt = c.createStatement();
            stmt.executeUpdate(comando);
            System.out.println("insercao realizada");
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
     