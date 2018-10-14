package psicultura;
public class EspeciePeixe {
    public float temp_max;
    public float temp_min;
    public float ph_max;
    public float ph_min;
    public float porcetagem_oxi_max;
    public float porcetagem_oxi_min;
    public String nome_especie;
    public String tipo_agua;
    
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
}
