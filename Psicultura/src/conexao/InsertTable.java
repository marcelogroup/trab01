/*NEED COFFEE*/
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertTable {

    
    public void insertTable(String tabela,String[]campos , String[] valores){
        /**/
        Connection c = null;
        Statement stmt = null;
        String campos_str=lista_to_string(campos);
        String valores_str=lista_to_string(valores);
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabIntegrado", "postgres", "serra");
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
        
    
}
