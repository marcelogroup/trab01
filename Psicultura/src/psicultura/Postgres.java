package psicultura;
import java.sql.*;
public class Postgres {
    public static void Postgres(){
       try{
        Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
       /* definindo padrões*/
        String url = "jdbc:postgres://stampy.db.elephantsql.com:5432/pvunmqpv";
        String username = "pvunmqpv";
        String password = "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA";
        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM funcionario;");
             while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(3));
            }
            rs.close();
            st.close();
        }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());    
        }
    
    }
           
    
}
