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
    public int id_tanque;
      public Funcionario(String nome,String cpf,String identidade, String endereco, String turno, String contato, String id_funcionarios, String rua,String cep,String bairro,String cidade,String telefone,int id_tanque){
        // atributos de pessoa 
        super.nome = nome;
        super.cpf  = cpf;
        super.identidade = identidade;
        super.turno =turno;
        super.id_funcionario=id_funcionarios;  
        // atributos da classe Contato
        super.rua=rua;
        super.cep=cep;
        super.bairro=bairro;
        super.cidade=cidade;
        super.telefone=telefone;
        this.id_tanque=id_tanque;
    } 
        
}

