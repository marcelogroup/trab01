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
 * @author 20151bsi0436
 */
public class SelectTable {

   
    public synchronized ArrayList selectTable(String comando) {
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
         
            while (rs.next()) {
                //falha de segmentação
                
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
    
    

    public synchronized ArrayList selectTableString(String comando){
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
            
            while (rs.next()) {
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
    public synchronized String selectId(String comando){
        String id="";
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
         
            while (rs.next()) {
                id = rs.getString("id");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Operation done successfully select");
        return id;
    }
    public synchronized ArrayList selectPeixe(String comando) {
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
         
            while (rs.next()) {
                
                listResult.add(rs.getString(1));
                
                listResult.add(rs.getString(2));
               
                listResult.add(rs.getString(3));
                
                listResult.add(rs.getString(4));
               
                listResult.add(rs.getString(5));
                
                listResult.add(rs.getString(6));
                
                listResult.add(rs.getString(7));
                
                listResult.add(rs.getString(8));
                
                listResult.add(rs.getString(9));
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
    public synchronized ArrayList selectTanque(String comando) {
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
         
            while (rs.next()) {
                
                listResult.add(rs.getString(1));
                
                listResult.add(rs.getString(2));
                
                listResult.add(rs.getString(3));
               
                listResult.add(rs.getString(4));
                
                listResult.add(rs.getString(5));
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
    public synchronized ArrayList selectFunc(String comando) {
        ArrayList listResult = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
         
            while (rs.next()) {
                
                listResult.add(rs.getString(1));
                
                listResult.add(rs.getString(2));
               
                listResult.add(rs.getString(3));
                
                listResult.add(rs.getString(4));
               
                listResult.add(rs.getString(5));
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
                