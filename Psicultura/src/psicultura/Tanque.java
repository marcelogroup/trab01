

package psicultura;

import java.util.Date;
import javax.swing.JOptionPane;
 
public class Tanque {
    float sensor_temp;
    float sensor_oxi;
    float sensor_ph;
    int id_tanque;
    Peixe peixe; 
    Date momento;
    String idPeixe;
    public Tanque(String temp,String oxi,String ph,Peixe peixe){
        this.setSensor_ph(Float.parseFloat(ph));
        this.setSensor_oxi(Float.parseFloat(oxi));
        this.setSensor_temp(Float.parseFloat(temp));
        this.AdicionarPeixe(peixe);
    }  
    
    
    
    
    /**
     * 
     * getter and setter
     */
    
    
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

    public Peixe getPeixe() {
        return peixe;
    }

    public void AdicionarPeixe(Peixe peixe) {
        this.peixe = peixe;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public String getIdPeixe(){
        return idPeixe;
    }
    
}
