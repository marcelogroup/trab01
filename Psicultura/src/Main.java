


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
               
        
      
        int codigoOperacao;
        Tanque tanque= new Tanque(29.7f,0.0077f,7.045f,1);
        //
        System.out.println("novo tanque criado "+tanque.getId_tanque() );
        EspeciePeixe peixe= new EspeciePeixe("tilapia","doce", 40.5f, 15.9f, 7.99f, 6.89f, 0.0100f, 0.0010f);
        //
        System.out.println("nova especie adicionada "+peixe.getNome_especie());
        if(tanque.estaVazio()){
            System.out.println("tanque esta vazio");
        }
        else{
            System.out.println("tanque ja tem um especie");
        }
        tanque.addPeixe(peixe);
        //
        System.out.println("especie "+peixe.getNome_especie()+" adicionada ao tanque"+tanque.getId_tanque());
        Gerente gerente = new Gerente("Jose","14730683714","matutino","Serra","Laranjeiras","rua carajás","33","20106080",true,"02730631033","jose@gmail.com");
        ///
        System.out.println("gerente de nome "+gerente.getNome() + " cadastrado");
        
        Funcionario func= new Funcionario("Homero", "30659823654","matutino","Serra","Serra dourada VI", "Av. jose manoel", "52","20392090",false,tanque,"02733394433","Homerojuca@gmail.com");
        //
        System.out.println("funcionario de nome "+func.getNome() + " cadastrado");
       
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