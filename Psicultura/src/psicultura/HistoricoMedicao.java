/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;

import java.util.Date;

/**
 *
 * @author marcelo
 */
public class HistoricoMedicao {
    public Date data_medicao;
    public Tanque tanque;
    
    public void historico(Tanque tanque,Date data_medicao){
        this.data_medicao=data_medicao;
        this.tanque=tanque;
    }
}
