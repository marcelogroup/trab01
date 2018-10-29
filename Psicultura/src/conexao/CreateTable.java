
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTable {

    public synchronized void  createTable() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabIntegrado",
            "postgres", "serra");
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();
            String sql = "CREATE TABLE teste "
                    + "(ID INT PRIMARY KEY  NULL," //AUTOINCREMENT
                        + " QUILOMETRAGEM   INT  NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("Table created successfully");
    }
}
