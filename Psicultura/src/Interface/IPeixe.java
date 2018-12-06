package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author 20151bsi0436
 */
public class IPeixe {
    String temp_max;
    String temp_min;
    String ph_max;
    String ph_min;
    String porcetagem_oxi_max;
    String porcetagem_oxi_min;
    String nome_especie;
    String tipo_agua;
    
    
    
    public IPeixe(){
        this.nome_especie       = JOptionPane.showInputDialog("Entre com nome da espécie\n");
        this.tipo_agua          = JOptionPane.showInputDialog("Entre com tipo da agua\n doce ou salgada");  
        this.ph_max             =(JOptionPane.showInputDialog("PH maximo suportado\n"));
        this.ph_min             =(JOptionPane.showInputDialog("PH minimo suportado\n"));
        this.temp_max           =(JOptionPane.showInputDialog("temperatura maxima suportada \n"));
        this.temp_min           =(JOptionPane.showInputDialog("temperatura minima suportada \n"));
        this.porcetagem_oxi_max =(JOptionPane.showInputDialog("oxigenacao maxima suportada\n"));
        this.porcetagem_oxi_min =(JOptionPane.showInputDialog("oxigenacao minima suportada\n"));
    } 
    
   
       
       
     public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getTemp_min() {
        return temp_min;
    }
   
    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getPh_max() {
        return ph_max;
    }

    public void setPh_max(String ph_max) {
        this.ph_max = ph_max;
    }

    public String getPh_min() {
        return ph_min;
    }

    public void setPh_min(String ph_min) {
        this.ph_min = ph_min;
    }

    public String getPorcetagem_oxi_max() {
        return porcetagem_oxi_max;
    }

    public void setPorcetagem_oxi_max(String porcetagem_oxi_max) {
        this.porcetagem_oxi_max = porcetagem_oxi_max;
    }

    public String getPorcetagem_oxi_min() {
        return porcetagem_oxi_min;
    }

    public void setPorcetagem_oxi_min(String porcetagem_oxi_min) {
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
