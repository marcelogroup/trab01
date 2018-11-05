
package psicultura;

public class Tanque {
    float sensor_temp;
    float sensor_oxi;
    float sensor_ph;
    int id_tanque;
    EspeciePeixe peixe;    
    
    public Tanque(float temp,float oxi,float ph,int id_tanque){
        this.sensor_temp=temp;
        this.sensor_oxi=oxi;
        this.sensor_ph=ph;
        this.id_tanque=id_tanque;
       
    }
    /**
     * 
     * @param nome
     * @param agua boolean true para agua doce, false para agua salgada; 
     * @param temp_max
     * @param temp_min
     * @param ph_max
     * @param ph_min
     * @param porcetagem_oxi_max
     * @param porcetagem_oxi_min 
     */
    public void criarAddPeixe(String nome, boolean agua, float temp_max, float temp_min, float ph_max, float ph_min,float porcetagem_oxi_max, float porcetagem_oxi_min){      
      this.peixe= new EspeciePeixe( nome,agua, temp_max,  temp_min, ph_max,  ph_min, porcetagem_oxi_max, porcetagem_oxi_min);
    }
    public void addPeixe(EspeciePeixe peixe){
        this.peixe=peixe;
    }      
    public boolean estaVazio(){
        if(this.peixe==null){
            return true;
        }
        return false;
    }
    
    /*getter e setter*/

    public float getSensor_temp() {
        return sensor_temp;
    }

    public void setSensor_temp(float sensor_temp) {
        this.sensor_temp = sensor_temp;
    }

    public float getSensor_oxi() {
        return sensor_oxi;
    }

    public void setSensor_oxi(float sensor_oxi) {
        this.sensor_oxi = sensor_oxi;
    }

    public float getSensor_ph() {
        return sensor_ph;
    }

    public void setSensor_ph(float sensor_ph) {
        this.sensor_ph = sensor_ph;
    }

    public int getId_tanque() {
        return id_tanque;
    }

    public void setId_tanque(int id_tanque) {
        this.id_tanque = id_tanque;
    }

    public EspeciePeixe getPeixe() {
        return peixe;
    }

    public void setPeixe(EspeciePeixe peixe) {
        this.peixe = peixe;
    }
    
    
    
}
