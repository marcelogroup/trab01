package nucleopsicultura;

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
        this.setSensorPh(Float.parseFloat(ph));
        this.setSensorOxi(Float.parseFloat(oxi));
        this.setSensorTemp(Float.parseFloat(temp));
        this.AdicionarPeixe(peixe);
    }  
    
    
    /**
     * 
     * getter and setter
     */
    
    
    public float getSensorTemp() {
        return sensor_temp;
    }

    public void setSensorTemp(float sensor_temp) {
        this.sensor_temp = sensor_temp;
    }

    public float getSensorOxi() {
        return sensor_oxi;
    }

    public void setSensorOxi(float sensor_oxi) {
        this.sensor_oxi = sensor_oxi;
    }

    public float getSensorPh() {
        return sensor_ph;
    }

    public void setSensorPh(float sensor_ph) {
        this.sensor_ph = sensor_ph;
    }

    public int getIdTanque() {
        return id_tanque;
    }

    public void setIdTanque(int id_tanque) {
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
