/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiculturainteligente;

import javax.swing.JOptionPane;

/**
 *
 * @author André
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String idPeixe, idTanque, idFunc;
        String capacTanque, tempMax, tempMin;
        String oxiPeixe,phPeixe;
        String nomePeixe, nomeFunc;
        String resposta;
        Peixe novoPeixe;
        Funcionario novoFunc;
        Tanque novoTanque;
        int idPeixeI, idTanqueI,idFuncI;
        resposta=JOptionPane.showInputDialog("Deseja adicionar um peixe (s=sim,n=nao)?");
        while(resposta.equalsIgnoreCase("s")){
            idPeixe=JOptionPane.showInputDialog("Entre com a id do peixe:");
            nomePeixe=JOptionPane.showInputDialog("Entre com o nome do peixe:");
            tempMin=JOptionPane.showInputDialog("Entre com a temperatura minima recomendada:");
            tempMax=JOptionPane.showInputDialog("Entre com a temperatura maxima recomendada:");
            phPeixe=JOptionPane.showInputDialog("Entre com o PH recomendado:");
            oxiPeixe=JOptionPane.showInputDialog("Entre com a quantidade de oxigenio recomendado:");
            novoPeixe= new Peixe(idPeixe,nomePeixe,tempMin,tempMax,phPeixe,oxiPeixe);
            idTanque=JOptionPane.showInputDialog("Entre com a id do tanque:");
            idPeixeI=Integer.parseInt(idPeixe);
            idTanqueI=Integer.parseInt(idTanque);
            novoPeixe.setTanque(idPeixeI, idTanqueI);
            resposta=JOptionPane.showInputDialog("Deseja adicionar um peixe (s=sim,n=nao)?");
        }
        
        resposta=JOptionPane.showInputDialog("Deseja adicionar um funcionario (s=sim,n=nao)?");
        while(resposta.equalsIgnoreCase("s")){
            idFunc=JOptionPane.showInputDialog("Entre com a id do Funcionario:");
            nomeFunc=JOptionPane.showInputDialog("Entre com o nome do Funcionario:");
            novoFunc= new Funcionario(idFunc,nomeFunc);
            idTanque=JOptionPane.showInputDialog("Entre com a id do tanque que ele eh responsavel:");
            idTanqueI=Integer.parseInt(idTanque);
            idFuncI=Integer.parseInt(idFunc);
            novoFunc.setTanque(idFuncI,idTanqueI);
            resposta=JOptionPane.showInputDialog("Deseja adicionar um funcionario (s=sim,n=nao)?");
        }
        resposta=JOptionPane.showInputDialog("Deseja adicionar um Tanque (s=sim,n=nao)?");
        while(resposta.equalsIgnoreCase("s")){
            idTanque=JOptionPane.showInputDialog("Entre com a id do Tanque:");
            capacTanque=JOptionPane.showInputDialog("Entre com a Capacidade do Tanque:");
            novoTanque=new Tanque(idTanque,capacTanque);
            idTanqueI=Integer.parseInt(idTanque);
            idFunc=JOptionPane.showInputDialog("Entre com a id do Funcionario responsavel:");
            idFuncI=Integer.parseInt(idFunc);
            idPeixe=JOptionPane.showInputDialog("Entre com a id do peixe que ele guarda:");
            idPeixeI=Integer.parseInt(idPeixe);
            novoTanque.setFuncionario(idTanqueI, idFuncI);
            novoTanque.setPeixe(idTanqueI, idPeixeI);
            resposta=JOptionPane.showInputDialog("Deseja adicionar um Tanque (s=sim,n=nao)?");
        }
    }
    
}
