
package userinterface;

import conexao.SelectTable;
import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Relatorio {
    private ArrayList relatorio;
    private SelectTable select = new SelectTable();
    
    public void relatorioUm(){      
        String query="Select idtanque,nomecientifico,tipoagua from tanque inner join peixe on(tanque.fk_peixe_idpeixe=peixe.idpeixe) ;";
        relatorio = select.selectTableRelatorioUm(query);
        String saida="";
        for (int i=0 ; i<relatorio.size() ; i++){
                    saida = saida +(String) relatorio.get(i)+"\n";
        }
        //subistituir pro joptionpane
        System.out.println("relatorio 1\n"+saida);
    }
    public void relatorioDois(){
        String query  ="select * from tanque inner join peixe on(tanque.fk_peixe_idpeixe=peixe.idpeixe);";
        relatorio=select.selectTableRelatorioDois(query);
        System.out.println("relatorio 2");
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
    }   
    public void relatorioTres(){
        String query = "SELECT nome as funcionario,idtanque as tanque FROM  funcionario inner join tanque on(tanque.idtanque=funcionario.fk_tanque_idtanque) where idtanque!=0;";
        relatorio=select.selectTableRelatorioTres(query);
        System.out.println("relatorio 3");
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
    }
    public void relatorioQuatro(){
        String query ="SELECT nome,cpf,idtanque, medicao.temperatura,medicao.ph,medicao.oxigenio,nomecientifico,tipoagua,hora,data FROM  funcionario inner join tanque on(tanque.idtanque=funcionario.fk_tanque_idtanque) inner join peixe on (tanque.fk_peixe_idpeixe=peixe.idpeixe) inner join medicao on (medicao.fk_tanque_idtanque=tanque.idtanque) where (fk_turno_idturno=1) order by(hora,data);";
        relatorio=select.selectTableRelatorioQuatro(query);
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
        
    }
    public void relatorioCinco(){
        String query ="SELECT nome,cpf,cidade,bairro,logradouro,cep,dado as telefone FROM  funcionario inner join endereco on (endereco.fk_funcionario_idfuncionario=funcionario.idfuncionario) inner join contato on (contato.fk_funcionario_idfuncionario=funcionario.idfuncionario) where fk_tipocontato_idtipo=2;";
        relatorio=select.selectTableRelatorioCinco(query);
        for(int i=0;i<relatorio.size();i++){            
            System.out.println(relatorio.get(i));
        }
    }

}
