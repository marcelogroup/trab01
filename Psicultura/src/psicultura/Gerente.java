package psicultura;

public class Gerente extends Pessoa {
    public Gerente(String nome,String cpf,Turno turno,String senha,Endereco moradia){
        this.cargo.setGerente();
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTurno_de_trabalho(turno);
        this.setSenha(senha);
        this.AtualizarEndereco(moradia);        
        
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

    public void AtualizarEndereco(Endereco moradia) {
        this.moradia = moradia;
    }

    public Turno getTurno_de_trabalho() {
        return turno_de_trabalho;
    }

    public void setTurno_de_trabalho(Turno turno_de_trabalho) {
        this.turno_de_trabalho = turno_de_trabalho;
    }
   
}
   