/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUsuario;

import conexao.SelectTable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import psicultura.Pessoa;

/**
 *
 * @author 20151BSI0436
 */
public class IContato {
    String dado;
    String tipo;
    String cpfDono;
    Pessoa pessoa;
    ArrayList dadosDono;
    
    public IContato(){
        SelectTable selecionar  = new SelectTable();
        this.dado=JOptionPane.showInputDialog("Entre com o contato\n");
        this.tipo=JOptionPane.showInputDialog("Entre com o tipo do contato\n");
        this.cpfDono=JOptionPane.showInputDialog("Entre com o CPF do dono\n");
        
    }
    public String getCPFDono(){
        return cpfDono;
    }
    public String getDado(){
        return dado;
    }
    public String getTipo(){
        return tipo;
    }
}
