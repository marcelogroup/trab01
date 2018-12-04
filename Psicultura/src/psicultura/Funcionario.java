/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;

import javax.swing.JOptionPane;

/**
 * 
 * @author marcelo
 */ 
public class Funcionario extends Pessoa{
    public Tanque tanque_do_func;
    
    public Funcionario(String nome, String cpf, Tanque tanque, Cargo cargo, Endereco endereco){
        this.nome=nome;
        this.cpf=cpf;
        this.tanque_do_func=tanque;
        this.moradia=endereco;
        
        
    }
    public  Funcionario(){
        this.nome   = JOptionPane.showInputDialog("entre com nome do funcionario\n");
        this.cpf    = JOptionPane.showInputDialog("entre com cpf do funcionario\n");
        this.tanque_do_func.setId_tanque(Integer.parseInt(JOptionPane.showInputDialog("entre com o codigo do tanque responsavel\n")));
        this.cargo.nomeCargo=JOptionPane.showInputDialog("entre com cargo do funcionario\n");
        this.turno_de_trabalho.descricao=JOptionPane.showInputDialog("entre com turno do funcionario\n");
        this.moradia.setLorgadouro(JOptionPane.showInputDialog("entre com a rua do funcionario\n"));
        this.moradia.setComplemento(JOptionPane.showInputDialog("entre com o numero da casa do funcionario\n"));
        this.moradia.setBairro(JOptionPane.showInputDialog("entre com o bairro do funcionario\n"));
        this.moradia.setCidade(JOptionPane.showInputDialog("entre com a cidade do funcionario\n"));
        this.moradia.setCep(JOptionPane.showInputDialog("entre com o CEP do funcionario \n"));
        
    }
    

    

    public Tanque getTanque_do_func() {
        return tanque_do_func;
    }
    public int getTanqueId(){
        return tanque_do_func.id_tanque;
    }

    public void setTanque_do_func(Tanque tanque_do_func) {
        this.tanque_do_func = tanque_do_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Turno getTurno_de_trabalho() {
        return turno_de_trabalho;
    }

    public void setTurno_de_trabalho(Turno turno_de_trabalho) {
        this.turno_de_trabalho = turno_de_trabalho;
    }
    public String getIdCargo(){
        return cargo.getIdcargo(cargo);
    }
    public String getIdTurno(){
        return turno_de_trabalho.getIdTurno(turno_de_trabalho);
    }
    /* camada de apresntação*/
    public void AtualizarEndereco(Endereco end){
        this.setMoradia(end);
    }
    public void AtualizarTanque(Tanque t){
        this.setTanque_do_func(t);
    }
    /**
     * pensar nisso  redundante
     * @param cargo 
     */
    public void AtualizarCargo(Cargo cargo){
        this.setCargo(cargo);
    }
}

