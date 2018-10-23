
package psicultura;

import java.sql.*;


public class Main {

  
    public static void main(String[] args) {
     /*   try{
        Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }*/
    
        //Postgres con = new Postgres();
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
/*
        int codigoOperacao;
        Tanque tanque= new Tanque(29.7f,0.0077f,7.045f,1);
        //
       // DBConexao conexao = null;
      //  conexao.getInstance();
        System.out.println("novo tanque criado "+tanque.id_tanque);
        EspeciePeixe peixe= new EspeciePeixe("tilapia","doce", 40.5f, 15.9f, 7.99f, 6.89f, 0.0100f, 0.0010f);
        //
        System.out.println("nova especie adicionada "+peixe.nome_especie);
        if(tanque.estaVazio()){
            System.out.println("tanque esta vazio");
        }
        else{
            System.out.println("tanque ja tem um especie");
        }
        tanque.addPeixe(peixe);
        //
        System.out.println("especie "+peixe.nome_especie+" adicionada ao tanque"+tanque.id_tanque);
        Gerente gerente = new Gerente("Jose","14730683714","matutino","Serra","Laranjeiras","rua carajás","33","20106080",true,"02730631033","jose@gmail.com");
        ///
        System.out.println("gerente de nome "+gerente.nome + " cadastrado");
        
        Funcionario func= new Funcionario("Homero", "30659823654","matutino","Serra","Serra dourada VI", "Av. jose manoel", "52","20392090",false,tanque,"02733394433","Homerojuca@gmail.com");
        //
        System.out.println("funcionario de nome "+func.nome + " cadastrado");*/