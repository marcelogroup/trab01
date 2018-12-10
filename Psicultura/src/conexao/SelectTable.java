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
    
    
    /* marcelo */
    public synchronized ArrayList selectTableRelatorioUm  (String comando){
        ArrayList listResult = new ArrayList();    
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("RElatorio um inciando");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
           
            while (rs.next()) {
                String saida= new String();
                saida = rs.getString(1)+","+rs.getString(2)+","+rs.getString(3);                
                listResult.add(saida);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        //System.out.println(listResult.get(2));
        
        return listResult;
    }
    public synchronized ArrayList selectTableRelatorioDois(String comando){
        ArrayList listResult = new ArrayList();    
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("RElatorio um inciando");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
           
            while (rs.next()) {
                String saida= new String();
                // numero de colunas é de 14
                    //System.out.println(rs.getFloat(3));
                    saida =  rs.getString(1)+", "+rs.getFloat(2) +", "+rs.getFloat(3) +", "+rs.getFloat(4)+", "+rs.getString(5)+", ";
                    saida =  saida + rs.getString(6)+", "+rs.getString(7)+", "+rs.getString(8)+", "+rs.getString(9)+", "+rs.getString(10)+", ";
                    saida =  saida + rs.getString(11)+", "+rs.getString(12)+", "+rs.getString(13)+", "+rs.getString(14);
                // saida = rs.getString(1)+","+rs.getString(2)+","+rs.getString(3);                
                listResult.add(saida);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        //System.out.println(listResult);
        
        return listResult;
    }
    public synchronized ArrayList selectTableRelatorioTres(String comando){
        ArrayList listResult = new ArrayList();    
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("RElatorio um inciando");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
           
            while (rs.next()) {
                String saida= new String();               
                saida =  rs.getString(1)+", "+rs.getString(2); 
                              
                listResult.add(saida);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        //System.out.println(listResult);
        
        return listResult;
    }
    public synchronized ArrayList selectTableRelatorioQuatro(String comando){
        ArrayList listResult = new ArrayList();    
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("RElatorio um inciando");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
           
            while (rs.next()) {
                String saida= new String();               
                saida =  rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", " + rs.getFloat(4)+", "+rs.getFloat(5)+", "+rs.getFloat(6)+", "+rs.getString(7)+", "+rs.getString(8)+", "+rs.getString(9)+", "+rs.getString(10) ; 
                              
                listResult.add(saida);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        //System.out.println(listResult);
        
        return listResult;
    }
    public synchronized ArrayList selectTableRelatorioCinco(String comando){
        ArrayList listResult = new ArrayList();    
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
         
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            //System.out.println("RElatorio um inciando");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
           
            while (rs.next()) {
                String saida= new String();               
                saida =  rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(5)+", "+rs.getString(4)+", "+rs.getString(3)+", "+rs.getString(6)+", "+rs.getString(7); 
                              
                listResult.add(saida);
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        //System.out.println(listResult);
        
        return listResult;
    }
    
    /* altivo*/
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
    public synchronized ArrayList selectId(String comando){
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
                System.out.println(rs.getString(1));
                listResult.add(rs.getString(1));
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Operation done successfully select");
        return listResult;
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
                listResult.add(rs.getString(6));
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
    public synchronized ArrayList selectEndereco(String comando) {
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
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("select endereco");
        return listResult;
    }
    public synchronized ArrayList selectContato(String comando) {
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
            }
            //System.out.println("--------------");
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("select endereco");
        return listResult;
    }

}
                