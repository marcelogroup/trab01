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
   
    public synchronized void InsertPeixe(Peixe fish){
        Connection c=null;
        Statement stmt=null;
        String nomecientifico="'"+fish.getNome_especie()+"'";
        String query_1="select * from peixe where nomecientifico="+nomecientifico +";";
        boolean tem_o_peixe=false;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user, password);           
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query_1);
            tem_o_peixe=rs.next();
            System.out.println(tem_o_peixe);
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        //gerar id
        String query_2="select * from peixe;";
        String id="";
        int tam=0;
        boolean esta_vazio=true;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user, password);           
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query_2);
            while(rs.next()){
                tam++;
                esta_vazio=false;
            }
            System.out.println("banco esta vaxio ?"+esta_vazio+"\ntamanho do banco : "+tam);
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
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
            try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(banco,user, password);           
            stmt = c.createStatement();
            stmt.executeUpdate(query_3);
            }catch(Exception e){
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            
        }
    }
}
     