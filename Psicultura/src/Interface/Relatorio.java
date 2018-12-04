/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import conexao.SelectTable;
import java.sql.ResultSet;
import java.util.ArrayList;
import static javax.swing.UIManager.getString;

/**
 *
 * @author marcelo
 */
public class Relatorio {
    ArrayList relatorio;
    public void RelatorioUm(){        
        String query="Select idtanque,nomecientifico,tipoagua from tanque inner join peixe on(tanque.fk_peixe_idpeixe=peixe.idpeixe) ;";
        SelectTable select = new SelectTable();
        relatorio=select.selectTable(query);
        System.out.println(relatorio);
    }
}
