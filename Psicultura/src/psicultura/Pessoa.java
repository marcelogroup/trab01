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
public abstract class Pessoa {
   String nome;
   String cpf;
   String turno;
   //lista de contatos
   String [] listadecontatos ;
   String cidade;  
   String bairro;
   String lorgadouro;
   String complemento;
   String cep;
   boolean permissao;

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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getListadecontatos() {
        return listadecontatos;
    }

    public void setListadecontatos(String[] listadecontatos) {
        this.listadecontatos = listadecontatos;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLorgadouro() {
        return lorgadouro;
    }

    public void setLorgadouro(String lorgadouro) {
        this.lorgadouro = lorgadouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }
   
   
   
   
   
}
