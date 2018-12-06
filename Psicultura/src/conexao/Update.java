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

/**
 *
 * @author 20151BSI0436
 */
public class Update {
    String banco;
    String user;
    String password;

    public Update(String banco,String user,String password){
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
    
    public synchronized void updatePeixe(String comando){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");         
            c = DriverManager.getConnection(this.banco,this.user,this.password);   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            stmt.executeUpdate(comando);
            //rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("peixe atualizado");
    }
    public synchronized void updateTanque(String comando){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");         
            c = DriverManager.getConnection(this.banco,this.user,this.password);   
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            stmt.executeUpdate(comando);
            //rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("peixe atualizado");
    }
    
    
    
    
}
