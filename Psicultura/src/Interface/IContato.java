/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author 20151BSI0436
 */
public class IContato {
    String dado;
    String tipo;
    IFuncionario func;
    
    public IContato(){
        this.dado=JOptionPane.showInputDialog("Entre com o contato\n");
        this.tipo=JOptionPane.showInputDialog("Entre com o tipo do contato\n");
        
    }
}
