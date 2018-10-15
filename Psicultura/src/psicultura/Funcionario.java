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
      public Funcionario(String nome,String cpf,String turno,String cep,String bairro,String cidade,Tanque tanque_do_func){
        // atributos de pessoa 
        super.nome = nome;
        super.cpf  = cpf;
        super.turno =turno;
        super.cep=cep;
        super.bairro=bairro;
        super.cidade=cidade;        
        this.tanque_do_func=tanque_do_func;
    } 

   
        
}

