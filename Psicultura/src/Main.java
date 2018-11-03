


import conexao.InsertTable;
import conexao.SelectTable;
import java.sql.*;
import psicultura.EspeciePeixe;
import psicultura.Funcionario;
import psicultura.Gerente;
import psicultura.Tanque;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*CreateTable create = new CreateTable();
        create.createTable();*/
        
        SelectTable select = new SelectTable();
        select.selectTable();
        
        EspeciePeixe p1=new EspeciePeixe("sardinha", true, 37, 18, 8.1f, 6.9f,5,2);
        InsertTable insert =new InsertTable();
       // insert.insertTable("peixe", , );
      
  
       
    }
}

 /*codigos de operação
        1 criar tanque 
        2 criar gerente 
        3 criar funcionario 
        4 criar peixe
        5 adcionar peixe ao tanque
        0 sair
        
        String op_str =JOptionPane.showInputDialog(null,"Digite a operacao");
        codigoOperacao = Integer.parseInt(op_str);
        while(codigoOperacao!=0){
            if(codigoOperacao==1){
                //criar tanque
                String id_str =JOptionPane.showInputDialog(null,"O id do tanque");
                Tanque tanque=new Tanque();
            }
            if(codigoOperacao==2){
                //criar gerente
            }
            if(codigoOperacao==3){
                //criar funcionario
            }
            if(codigoOperacao==4){
                
            }  
            
            
            op_str =JOptionPane.showInputDialog(null,"Digite a operacao");
            codigoOperacao = Integer.parseInt(op_str);
        }*/