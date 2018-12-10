
package nucleopsicultura;


public class Turno {
    private String descricao;//chamado erronhamente de horario
    
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
    public void setTurno(String turno){
         this.descricao = turno ;
    }
    public String getIdTurno(Turno t){
        String r = null;
        if(t.getTurno().equals("manha") ){
            r="1";
        }
        if(t.getTurno().equals("tarde") ){
            r= "2";
        }
        if(t.getTurno().equals("noite")){
            r ="3";
        }
        return r;
    }
   
    
}
