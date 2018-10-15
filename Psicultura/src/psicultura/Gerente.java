package psicultura;

public class Gerente extends Pessoa {
    public Gerente(String nome, String cpf, String turno, String cidade, String bairro, String lorgadouro, String complemento, String cep, boolean permissao,String email,String telefone){
        // atributos de pessoa 
        super.nome=nome;
        super.cpf=cpf;
        super.turno=turno;
        super.cidade=cidade;  
        super.bairro=bairro;
        super.lorgadouro=lorgadouro;
        super.complemento=complemento;
        super.cep=cep;
        super.permissao=permissao;
        super.listadecontatos=new String[2];
        super.listadecontatos[0] = email;
        super.listadecontatos[1] = telefone;
    } 
}
   // //