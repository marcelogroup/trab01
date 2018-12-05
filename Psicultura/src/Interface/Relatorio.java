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
    SelectTable select = new SelectTable();
    
    public void RelatorioUm(){      
        String query="Select idtanque,nomecientifico,tipoagua from tanque inner join peixe on(tanque.fk_peixe_idpeixe=peixe.idpeixe) ;";
        relatorio = select.selectTableRelatorioUm(query);
        String saida=new String();
        for (int i=0 ; i<relatorio.size() ; i++){
                    saida = saida +(String) relatorio.get(i)+"\n";
        }
        //subistituir pro joptionpane
        System.out.println("relatorio 1\n"+saida);
    }

    public void RelatorioDois(){
        String query  ="select * from tanque inner join peixe on(tanque.fk_peixe_idpeixe=peixe.idpeixe);";
        relatorio=select.selectTableRelatorioDois(query);
        System.out.println("relatorio 2");
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
    }
    
    public void RelatorioTres(){
        String query = "SELECT nome as funcionario,idtanque as tanque FROM  funcionario inner join tanque on(tanque.idtanque=funcionario.fk_tanque_idtanque) where idtanque!=0;";
        relatorio=select.selectTableRelatorioTres(query);
        System.out.println("relatorio 3");
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
    }

    public void RelatorioQuatro(){
        String query ="";
    }
    public void RelatorioCinco(){
        String query ="";
    }

}
