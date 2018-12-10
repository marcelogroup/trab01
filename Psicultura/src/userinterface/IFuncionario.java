/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import conexao.SelectTable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import nucleopsicultura.Peixe;
import nucleopsicultura.Tanque;

/**
 *
 * @author 20151bsi0436
 */
public class IFuncionario {
   private String nome;
   private String cpf; 
   private String  cargo;
   private String  turno_de_trabalho;
   private String idTanque;
   private  Peixe fish;
   private  ArrayList lista_de_tanque;
   private  ArrayList lista_de_peixes;
   private  IEndereco endereco;   
   
   private Tanque tanque;

   public IFuncionario(){
        SelectTable selecionar  = new SelectTable();
        
        this.nome     = JOptionPane.showInputDialog("entre com nome do funcionario\n");
        this.cpf      = JOptionPane.showInputDialog("entre com cpf do funcionario\n");
        this.idTanque =(JOptionPane.showInputDialog("entre com o codigo do tanque responsavel\n"));
        
        lista_de_tanque = selecionar.selectTanque("Select * from tanque where idTanque= "+this.idTanque+";");
        lista_de_peixes = selecionar.selectPeixe("Select * from peixe where idPeixe= "+lista_de_tanque.get(4)+";");
        fish=new Peixe( String.valueOf(lista_de_peixes.get(1)), String.valueOf(lista_de_peixes.get(2)), 
                        String.valueOf(lista_de_peixes.get(3)), String.valueOf(lista_de_peixes.get(4)), 
                        String.valueOf(lista_de_peixes.get(5)), String.valueOf(lista_de_peixes.get(6)), 
                        String.valueOf(lista_de_peixes.get(7)), String.valueOf(lista_de_peixes.get(8)   ));
        fish.setId(String.valueOf(lista_de_peixes.get(0)));
        
        tanque=new Tanque(String.valueOf(lista_de_tanque.get(1)),String.valueOf(lista_de_tanque.get(2)),
                          String.valueOf(lista_de_tanque.get(3)),fish);
        //ok
        tanque.setIdTanque(Integer.parseInt(idTanque));
        this.cargo             = JOptionPane.showInputDialog("entre com cargo do funcionario\n");
        this.turno_de_trabalho = JOptionPane.showInputDialog("entre com turno do funcionario\n");
        this.endereco          = new IEndereco();
   }
    public String getCpf() {
        return cpf;
    }
    public Tanque getTanqueFunc() {
        return tanque;
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public String getTurnoTrabalho() {
        return turno_de_trabalho;
    }
    public IEndereco getEndereco(){
        return endereco;
    }
    
}
