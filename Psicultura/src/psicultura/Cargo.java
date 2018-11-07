package psicultura;

public class Cargo {
    String nomeCargo;


    public String getCargo(){
        return this.nomeCargo;
    }
    public void setEstagiario(){
        this.nomeCargo="estagiario";
    }
    public void setGerente(){
        this.nomeCargo="gerente";
    }
    public void setFuncionario(){
        this.nomeCargo="funcionario";
    }
    
}