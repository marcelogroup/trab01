/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author 20151bsi0436
 */
public class IEndereco {
    private String cep;
    private String cidade;
    private String bairro;
    private String lorgadouro;
    private String complemento;
    
    public IEndereco(){
        this.lorgadouro  = (JOptionPane.showInputDialog("entre com a rua do funcionario.\n"));
        this.complemento = (JOptionPane.showInputDialog("entre com o numero da casa do funcionario.\n"));
        this.bairro      = (JOptionPane.showInputDialog("entre com o bairro do funcionario.\n"));
        this.cidade      = (JOptionPane.showInputDialog("entre com a cidade do funcionario.\n"));
        this.cep         = (JOptionPane.showInputDialog("entre com o CEP do funcionario.\n"));
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLorgadouro() {
        return lorgadouro;
    }
    public String getComplemento() {
        return complemento;
    }
}
