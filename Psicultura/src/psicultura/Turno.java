
package psicultura;


public class Turno {
    String descricao;//chamado erronhamente de horario
    public Turno(){
        
    } 
    public void setManha(){
        this.descricao="manha";
    }
    public void setTarde(){
        this.descricao="tarde";
    }
    public void setNoite(){
        this.descricao="noite";
    }
    public String getTurno(){
        return this.descricao;
    }

   
    
}
