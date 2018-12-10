package nucleopsicultura;

import javax.swing.JOptionPane;

public class Peixe {
    float temp_max;
    float temp_min;
    float ph_max;
    float ph_min;
    float porcetagem_oxi_max;
    float porcetagem_oxi_min;
    String nome_especie;
    String tipo_agua;
    String idPeixe;
  
    public Peixe(String nome, String agua, String temp_max, String temp_min, String ph_max, String ph_min,String porcetagem_oxi_max, String porcetagem_oxi_min){
        this.nome_especie       =   nome;
        this.tipo_agua          =   agua;
        this.ph_max             =   Float.parseFloat(ph_max);
        this.ph_min             =   Float.parseFloat(ph_min);
        this.temp_max           =   Float.parseFloat(temp_max);
        this.temp_min           =   Float.parseFloat(temp_min);
        this.porcetagem_oxi_max =   Float.parseFloat( porcetagem_oxi_max);
        this.porcetagem_oxi_min =   Float.parseFloat( porcetagem_oxi_min);
    }

   
    
    
    /*getter e setter*/
    public String getId(){
        return idPeixe;
    }
    public void setId(String id){
        this.idPeixe=id;
    }
    public float getTempMax() {
        return temp_max;
    }

    public void setTempMax(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTempMin() {
        return temp_min;
    }
   
    public void setTempMin(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getPh_max() {
        return ph_max;
    }

    public void setPhMax(float ph_max) {
        this.ph_max = ph_max;
    }

    public float getPhMin() {
        return ph_min;
    }

    public void setPh_min(float ph_min) {
        this.ph_min = ph_min;
    }

    public float getPorcetagem_oxi_max() {
        return porcetagem_oxi_max;
    }

    public void setPorcetagem_oxi_max(float porcetagem_oxi_max) {
        this.porcetagem_oxi_max = porcetagem_oxi_max;
    }

    public float getPorcetagem_oxi_min() {
        return porcetagem_oxi_min;
    }

    public void setPorcetagem_oxi_min(float porcetagem_oxi_min) {
        this.porcetagem_oxi_min = porcetagem_oxi_min;
    }

    public String getNomeEspecie() {
        return nome_especie;
    }

    public void setNomeEspecie(String nome_especie) {
        this.nome_especie = nome_especie;
    }

    public String getTipoAgua() {
        return tipo_agua;
    }

    public void setTipoAgua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }
    
}
