package psicultura;
public class EspeciePeixe {
    float temp_max;
    float temp_min;
    float ph_max;
    float ph_min;
    float porcetagem_oxi_max;
    float porcetagem_oxi_min;
    String nome_especie;
    String tipo_agua;
    
    public EspeciePeixe(String nome, String agua, float temp_max, float temp_min, float ph_max, float ph_min,float porcetagem_oxi_max, float porcetagem_oxi_min){
        this.nome_especie=nome;
        this.tipo_agua=agua;
        this.ph_max = ph_max;
        this.ph_max=ph_max;
        this.ph_min=ph_min;
        this.temp_max=temp_max;
        this.temp_min=temp_min;
        this.porcetagem_oxi_max=porcetagem_oxi_max;
        this.porcetagem_oxi_min=porcetagem_oxi_min;
    }
    /*getter e setter*/

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getPh_max() {
        return ph_max;
    }

    public void setPh_max(float ph_max) {
        this.ph_max = ph_max;
    }

    public float getPh_min() {
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

    public String getNome_especie() {
        return nome_especie;
    }

    public void setNome_especie(String nome_especie) {
        this.nome_especie = nome_especie;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }
    
}
