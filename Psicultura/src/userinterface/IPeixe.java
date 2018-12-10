package userinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author 20151bsi0436
 */
public class IPeixe {
    private String temp_max;
    private String temp_min;
    private String ph_max;
    private String ph_min;
    private String porcetagem_oxi_max;
    private String porcetagem_oxi_min;
    private String nome_especie;
    private String tipo_agua;
    
    
    
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
    
   
       
       
     public String getTempMax() {
        return temp_max;
    }

    public void setTempMax(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getTempMin() {
        return temp_min;
    }
   
    public void setTempMin(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getPhMax() {
        return ph_max;
    }

    public void setPhMax(String ph_max) {
        this.ph_max = ph_max;
    }

    public String getPhMin() {
        return ph_min;
    }

    public void setPhMin(String ph_min) {
        this.ph_min = ph_min;
    }

    public String getPorcetagemOxiMax() {
        return porcetagem_oxi_max;
    }

    public void setPorcetagemOxiMax(String porcetagem_oxi_max) {
        this.porcetagem_oxi_max = porcetagem_oxi_max;
    }

    public String getPorcetagemOxiMin() {
        return porcetagem_oxi_min;
    }

    public void setPorcetagemOxiMin(String porcetagem_oxi_min) {
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
