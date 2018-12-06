
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteTable {

public synchronized void  deletePeixe(String query) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();                    
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("Peixe deletado do banco de dados");
    }
public synchronized void  deleteTanque(String query) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();                    
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("tanque apagado");
    }
public synchronized void  deleteFunc(String query) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();                    
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("funcionario removido");
    }




}
