/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Psicultura;

import java.util.Date;

/**
 *
 * @author André
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data= new Date();
        Funcionario novoFunc= new Funcionario("Joao",1010,20141,"Rua alameda rodovia","vespertino","40028922",2,1);
        Gerente novoGen= new Gerente("Pedro",2020,10342,"Avenida rua alameda","vespertino","05002018",1);
        Tanque novoTanque= new Tanque(35f,40f,7f,1,2);
        HistoricoMedicao historico= new HistoricoMedicao(35f,40f,7f,1,2,data);
        
    }
    
}
