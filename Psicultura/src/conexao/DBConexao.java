/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;
import java.sql.Connection;

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

