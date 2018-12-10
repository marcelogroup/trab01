package nucleopsicultura;

import java.util.Date;

/**
 * 
 * @author marcelo
 */ 
public class HistoricoMedicao { 
    public Date data_medicao; 
    public Tanque tanque;
    public float ph;
    public float oxi;
    public float temp;
            
     
    public void historico(Tanque tanque,Date data_medicao){
        this.data_medicao=data_medicao;
        this.oxi=tanque.getSensorOxi();
        this.temp=tanque. getSensorTemp();
        this.ph=tanque.getSensorPh();
    }
}
