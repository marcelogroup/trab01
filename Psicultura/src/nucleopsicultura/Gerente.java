package nucleopsicultura;


public class Gerente extends Pessoa {
    public Tanque tanque_do_func;
   
    public Gerente(String nome, String cpf, Tanque tanque, Cargo cargo,Turno turno, Endereco endereco){ 
        this.nome               = nome;
        this.cpf                = cpf;
        this.tanque_do_func     = tanque;
        this.moradia            = endereco;
        this.cargo              = cargo;
        this.turno_de_trabalho  = turno;
        
    } 

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
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

    public void AtualizarEndereco(Endereco moradia) {
        this.moradia = moradia;
    }

    public Turno getTurno_de_trabalho() {
        return turno_de_trabalho;
    }

    private void setTurno_de_trabalho(Turno turno_de_trabalho) {
        this.turno_de_trabalho = turno_de_trabalho;
    }
   public String getIdTurno(){
        return turno_de_trabalho.getIdTurno(turno_de_trabalho);
    }
   public String getIdCargo(){
        return cargo.getIdcargo(cargo);
    }
}
   