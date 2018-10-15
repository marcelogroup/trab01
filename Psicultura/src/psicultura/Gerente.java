package psicultura;

public class Gerente extends Pessoa {
    public Gerente(String nome,String cpf,String turno,String cep,String bairro,String cidade){
        // atributos de pessoa 
        super.nome = nome;
        super.cpf  = cpf;        
        super.turno = turno;               
        super.cep=cep;
        super.bairro=bairro;
        super.cidade=cidade;
        
        
    } 
}
