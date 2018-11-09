package psicultura;

public class Gerente extends Pessoa {

    /**
     *
     * @param nome
     * @param cpf
     * @param turno
     * @param senha
     * @param moradia
     */
    public Gerente(String nome,String cpf,Turno turno,String senha,Endereco moradia){
       // this.cargo.setGerente();
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTurno_de_trabalho(turno);
        this.setSenha(senha);
        this.AtualizarEndereco(moradia);        
        
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
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

    private void setTurno_de_trabalho(Turno turno_de_trabalho) {
        this.turno_de_trabalho = turno_de_trabalho;
    }
   
}
   