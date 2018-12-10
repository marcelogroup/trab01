package nucleopsicultura;

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
        public void setCargo(String cargo){
        this.nomeCargo=cargo;
    }
    
    public String getIdcargo(Cargo c){
        String result=null;
        if(c.getCargo().equals("estagiario")){
            result="3";
        }
        if(c.getCargo().equals("gerente")){
            result="1";
        }
        if(c.getCargo().equals("funcionario")){
            result="2";
        }
        return result;
    }
}