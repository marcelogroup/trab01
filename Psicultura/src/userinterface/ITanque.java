/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JOptionPane;
import conexao.SelectTable;
import java.util.ArrayList;
import nucleopsicultura.Peixe;

/**
 *
 * @author 20151bsi0436
 */
public class ITanque {
    private String sensor_temp;
    private String sensor_oxi;
    private String sensor_ph;
    private String nomePeixe;    
    private Peixe fish;
    
    
    public ITanque(){
        ArrayList lista_de_peixes;
        this.sensor_temp        = (JOptionPane.showInputDialog("informe a temperatura\n"));
        this.sensor_oxi         = (JOptionPane.showInputDialog("informe a % oxigenio\n"));
        this.sensor_ph          = (JOptionPane.showInputDialog("informe o ph \n"));
        this.nomePeixe          = JOptionPane.showInputDialog("Qual especie de peixe estara no tanque\n");
        SelectTable selecionar  = new SelectTable();
        lista_de_peixes = selecionar.selectPeixe("Select * from peixe where nomecientifico= '"+nomePeixe+"';");
        
        
        fish=new Peixe(String.valueOf(lista_de_peixes.get(1)),String.valueOf( lista_de_peixes.get(2)), 
                        String.valueOf(lista_de_peixes.get(3)), String.valueOf(lista_de_peixes.get(4)), 
                        String.valueOf(lista_de_peixes.get(5)), String.valueOf(lista_de_peixes.get(6)), 
                        String.valueOf(lista_de_peixes.get(7)), String.valueOf(lista_de_peixes.get(8)));
        fish.setId(String.valueOf(lista_de_peixes.get(0)));
        System.out.println(fish);
        
        
    }
    public String getSensorTemp() {
        return sensor_temp;
    }
    public String getSensorOxi() {
        return sensor_oxi;
    }
    public String getSensorPh() {
        return sensor_ph;
    }
    public Peixe getPeixe() {
        return fish;
    }
}
