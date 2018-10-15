package psicultura;

public class Gerente extends Pessoa {
    public Gerente(String nome,String cpf,String identidade, String turno, String id_funcionarios, String rua,String cep,String bairro,String cidade,String telefone){
        // atributos de pessoa 
        super.nome = nome;
        super.cpf  = cpf;
        super.identidade = identidade;
        super.turno = turno;
        super.id_funcionario=id_funcionarios;  
        // atributos da classe Contato
        super.rua=rua;
        super.cep=cep;
        super.bairro=bairro;
        super.cidade=cidade;
        super.telefone=telefone;
        
    } 
}
