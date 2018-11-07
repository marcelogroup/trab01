/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;

/**
 * 
 * @author marcelo
 */
public class Funcionario extends Pessoa{
    public Tanque tanque_do_func;
    
    public Funcionario(Tanque tanque,String nome,String cpf,Turno turno,String senha,Endereco moradia,Cargo cargo){
        this.setTanque_do_func(tanque);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTurno_de_trabalho(turno);
        this.setSenha(senha);
        this.setCargo(cargo);
        this.setMoradia(moradia);        
        
    } 

    public Tanque getTanque_do_func() {
        return tanque_do_func;
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

    public String getCpf() {
        return cpf;
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

    public Endereco getMoradia() {
        return moradia;
    }

    public void setMoradia(Endereco moradia) {
        this.moradia = moradia;
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

