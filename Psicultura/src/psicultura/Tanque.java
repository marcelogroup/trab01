
package psicultura;

public class Tanque {
    public float sensor_temp;
    public float sensor_oxi;
    public float sensor_ph;
    public int id_tanque;
    public EspeciePeixe peixe;
    
    
    public Tanque(float temp,float oxi,float ph,int id_tanque){
        this.sensor_temp=temp;
        this.sensor_oxi=oxi;
        this.sensor_ph=ph;
        this.id_tanque=id_tanque;
       
    }
    public void criarAddPeixe(String nome, String agua, float temp_max, float temp_min, float ph_max, float ph_min,float porcetagem_oxi_max, float porcetagem_oxi_min){      
      this.peixe= new EspeciePeixe( nome,agua, temp_max,  temp_min, ph_max,  ph_min, porcetagem_oxi_max, porcetagem_oxi_min);
    }
    public void addPeixe(EspeciePeixe peixe){
        this.peixe=peixe;
    }      
    public boolean estaVBazio(){
        if(this.peixe==null){
            return true;
        }
        return false;
    }
}
