


import conexao.InsertTable;
import conexao.SelectTable;
import java.sql.*;
import psicultura.EspeciePeixe;
import psicultura.Funcionario;
import psicultura.Gerente;
import psicultura.Tanque;

public class Main {

    public static void main(String[] args) {
        
        /*CreateTable create = new CreateTable();
        create.createTable();*/
        
       // SelectTable select = new SelectTable();
       // select.selectTable("SELECT * FROM funcionario;");
        
        /*inserir  um obejto  uma funcionario*/   
      Funcionario fun1 = new Funcionario("josé esmaraldo","1212","1","viana","azulino","rua carlos victor", "numero 12","29106080", true,null,"zees@gmail.com","33394433"); 
      Funcionario fun2 = new Funcionario("marcelo mendes","1717","1","Serra","laranjeiras","rua caixa", "numero 24","29106180", true,null,"marcelopm@gmail.com","98539226"); 
      Tanque tan1 = new Tanque( 34.5f,12.5f,7.1f,3);

      
      InsertTable insert_func=new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
      insert_func.insertFuncionario(fun1);
      //insert_func.insertFuncionario(fun2);
  
       
    }
}

