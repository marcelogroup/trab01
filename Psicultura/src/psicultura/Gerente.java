package psicultura;

import javax.swing.JOptionPane;

public class Gerente extends Pessoa {

    /**
     *
     * @param nome
     * @param cpf
     * @param turno
     * @param senha
     * @param moradia
     */
    public Gerente(){
        this.nome=JOptionPane.showInputDialog("entre com nome do gerente\n");
        this.cpf=JOptionPane.showInputDialog("entre com cpf do gerente\n");
        this.cargo.nomeCargo="gerente";
        this.turno_de_trabalho.descricao=JOptionPane.showInputDialog("entre com turno do gerente\n");
        this.moradia.setLorgadouro(JOptionPane.showInputDialog("entre com a rua do gerente\n"));
        this.moradia.setComplemento(JOptionPane.showInputDialog("entre com o numero da casa do gerente\n"));
        this.moradia.setBairro(JOptionPane.showInputDialog("entre com o bairro do gerente\n"));
        this.moradia.setCidade(JOptionPane.showInputDialog("entre com a cidade do gerente\n"));
        this.moradia.setCep(JOptionPane.showInputDialog("entre com o CEP do gerente\n"));  
        
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
   