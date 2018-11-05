/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 20171BSI0081
 */
public class SelectTable {
    public synchronized ArrayList selectTable(String comando) {
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            //c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabIntegrado","postgres", "serra");   
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
            //System.out.println("--------------");
            //System.out.println(rs);
            while (rs.next()) {
                //System.out.print("Column 1 returned ");
                //System.out.println(rs.getString(2));
                //System.out.print("Column 2 returned ");
                //System.out.println(rs.getString(3));
                listResult.add(rs);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Operation done successfully select");
        return listResult;
    }
}
