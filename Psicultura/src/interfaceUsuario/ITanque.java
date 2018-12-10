/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUsuario;

import javax.swing.JOptionPane;
import conexao.SelectTable;
import java.util.ArrayList;
import psicultura.Peixe;

/**
 *
 * @author 20151bsi0436
 */
public class ITanque {
    String sensor_temp;
    String sensor_oxi;
    String sensor_ph;
    String nomePeixe;
    ArrayList lista_de_peixes;
    Peixe fish;
    
    
    public ITanque(){
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
    public String getSensor_temp() {
        return sensor_temp;
    }
    public String getSensor_oxi() {
        return sensor_oxi;
    }
    public String getSensor_ph() {
        return sensor_ph;
    }
    public Peixe getPeixe() {
        return fish;
    }
}
