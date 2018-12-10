
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DeleteTable {
SelectTable select= new SelectTable();
public synchronized void  deletePeixe() {
        Connection c = null;
        Statement stmt = null;
        String query="";
        String idPeixe;
        ArrayList lista=new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            String nomePeixe=JOptionPane.showInputDialog("Entre com o nome do peixe que deseja deletar\n");
            System.out.println(nomePeixe);
            lista=select.selectPeixe("Select * from peixe where nomecientifico='"+nomePeixe+"';");
            idPeixe=String.valueOf(lista.get(0));
            lista=select.selectId("Select * from Tanque where fk_peixe_idPeixe="+idPeixe+";");
            stmt = c.createStatement();   
            for(int i=0;i<lista.size();i++){
                System.out.println(String.valueOf(lista.get(i)));
                String tanqueUp="UPDATE TANQUE SET idtanque="+String.valueOf(lista.get(i))+",temperatura="+0+",ph="+0+",oxigenio="+0+",fk_peixe_idpeixe="+0+ " where idtanque="+String.valueOf(lista.get(i))+";";
                
                stmt.executeUpdate(tanqueUp);
            } 
            query="Delete from Peixe where idpeixe="+idPeixe+";";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("Peixe deletado do banco de dados");
    }
public synchronized void  deleteTanque() {
        Connection c = null;
        Statement stmt = null;
        String query="";
        String idTanque;
        ArrayList lista=new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            idTanque=JOptionPane.showInputDialog("Entre com o id do tanque que deseja deletar\n");
            lista=select.selectId("Select * from Funcionario where fk_tanque_idTanque="+idTanque+";");
            stmt = c.createStatement();  
            for(int i=0;i<lista.size();i++){
                System.out.println(String.valueOf(lista.get(i)));
                String funcUp="UPDATE Funcionario SET fk_tanque_idTanque="+0+" where idtanque="+String.valueOf(lista.get(i))+";";
                stmt.executeUpdate(funcUp);
            } 
            query="Delete from Tanque where idTanque="+idTanque+";";                
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("tanque apagado");
    }
public synchronized void  deleteFunc() {
        Connection c = null;
        Statement stmt = null;
        String query="";
        String cpf;
        String idFunc;
        ArrayList lista=new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            cpf=JOptionPane.showInputDialog("Entre com o cpf do funcionario que deseja deletar\n");
            lista=select.selectFunc("Select * from Funcionario where cpf='"+cpf+"';");
            idFunc=String.valueOf(lista.get(0));
            stmt = c.createStatement(); 
            query="Delete from Endereco where fk_funcionario_idfuncionario="+idFunc+";";
            stmt.executeUpdate(query);
            query="Delete from Contato where fk_funcionario_idfuncionario="+idFunc+";";
            stmt.executeUpdate(query);
            query="Delete from Funcionario where idfuncionario="+idFunc+";";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("funcionario removido");
    }
public synchronized void  deleteEndereco() {
        Connection c = null;
        Statement stmt = null;
        String query="";
        String cpf;
        String idFunc;
        ArrayList lista=new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            cpf=JOptionPane.showInputDialog("Entre com o cpf do funcionario que deseja deletar o endereco\n");
            lista=select.selectFunc("Select * from Funcionario where cpf='"+cpf+"';");
            idFunc=String.valueOf(lista.get(0));
            stmt = c.createStatement(); 
            query="Delete from Endereco where fk_funcionario_idfuncionario="+idFunc+";";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("Endereco removido");
    }
public synchronized void  deleteContato() {
        Connection c = null;
        Statement stmt = null;
        String query="";
        String dado;
        String idFunc;
        ArrayList lista=new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
            System.out.println("Base de dados aberta");
            dado=JOptionPane.showInputDialog("Entre com o contato do funcionario que deseja deletar\n");
            lista=select.selectContato("Select * from contato where dado='"+dado+"';");
            idFunc=String.valueOf(lista.get(0));
            stmt = c.createStatement(); 
            query="Delete from Contato where fk_funcionario_idfuncionario="+idFunc+";";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println("contato removido");
    }




}
