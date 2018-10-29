/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConexao {
    private static Connection instance = null;
    private DBConexao(){}
    public static synchronized Connection getInstance() {
        if (instance == null) {
            try {
                Connection c = null;
                Class.forName("org.postgresql.jdbc");
//                c = DriverManager.getConnection("jdbc:postgres://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
//                c.setAutoCommit(true);
//                instance = c;
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return instance;
    }
}
/*
public static synchronized Connection getInstance() {
        if (instance == null) {
            try {
                Connection c = null;
                
                 String USUARIO = "root";
                 String SENHA = "";
                 String URL = "jdbc:mysql://127.0.0.1:3306/lp";
                 String DRIVER = "com.mysql.jdbc.Driver";
                
                //Class.forName("org.sqlite.JDBC");
                //c = DriverManager.getConnection("jdbc:sqlite:veiculo.db");
                c =  DriverManager.getConnection(URL, USUARIO, SENHA);
                c.setAutoCommit(true);
                
                instance = c;
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return instance;
*/