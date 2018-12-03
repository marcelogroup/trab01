/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author 20151bsi0436
 */
public class IFuncionario {
   String nome;
   String cpf;
   String senha;
   IEndereco endereco; 
   String  cargo;
   String  turno_de_trabalho;
   String idTanque;
   
   public IFuncionario(){
        this.nome   = JOptionPane.showInputDialog("entre com nome do funcionario\n");
        this.cpf    = JOptionPane.showInputDialog("entre com cpf do funcionario\n");
        this.idTanque =(JOptionPane.showInputDialog("entre com o codigo do tanque responsavel\n"));
        this.cargo=JOptionPane.showInputDialog("entre com cargo do funcionario\n");
        this.turno_de_trabalho=JOptionPane.showInputDialog("entre com turno do funcionario\n");
        this.endereco=new IEndereco();
   }
    
}
