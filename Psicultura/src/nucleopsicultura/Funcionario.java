package nucleopsicultura;
 
/** 
 * 
 * @author marcelo
 */ 
public class Funcionario extends Pessoa{
    public Tanque tanque_do_func;
     
    public Funcionario(String nome, String cpf, Tanque tanque, Cargo cargo,Turno turno, Endereco endereco){ 
        this.nome               = nome;
        this.cpf                = cpf;
        this.tanque_do_func     = tanque;
        this.moradia            = endereco;
        this.cargo              = cargo;
        this.turno_de_trabalho  = turno;
    }
    
    public Tanque getTanqueFunc() {
        return tanque_do_func;
    }
    public int getTanqueId(){
        return tanque_do_func.getIdTanque();
    }

    public void setTanqueFunc(Tanque tanque_do_func) {
        this.tanque_do_func = tanque_do_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Turno getTurnoTrabalho() {
        return turno_de_trabalho;
    }
/**
 * 
 * @param turno_de_trabalho 
 */
    public void setTurnoTrabalho(Turno turno_de_trabalho) {
        this.turno_de_trabalho = turno_de_trabalho;
    }
    public String getIdCargo(){
        return cargo.getIdcargo(cargo);
    }
    public String getIdTurno(){
        return turno_de_trabalho.getIdTurno(turno_de_trabalho);
    }
    /* camada de apresntação*/
    public void AtualizarEndereco(Endereco end){
        this.setMoradia(end);
    }
    public void AtualizarTanque(Tanque t){
        this.setTanqueFunc(t);
    }
    /**
     * pensar nisso  redundante
     * @param cargo 
     */
    public void AtualizarCargo(Cargo cargo){
        this.setCargo(cargo);
    }
}

