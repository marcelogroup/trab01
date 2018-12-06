/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import Interface.IPeixe;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import psicultura.*;


/**
 * converter objeto em query
 * 
 * 
 */
public class CriaQuery {
    String query;
    SelectTable selectTable;
    ArrayList lista;
    
    public String peixe(Peixe fish){
        query =" insert into peixe (nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax) values";
        String nome;
        String agua;
        String temp_max;
        String temp_min;
        String ph_max;
        String ph_min;
        String porcetagem_oxi_max;
        String porcetagem_oxi_min;
        nome ="'"+fish.getNome_especie()+"'";
        agua ="'"+fish.getTipo_agua()+"'";     
        temp_max =String.valueOf(fish.getTemp_max());            
        temp_min =String.valueOf(fish.getTemp_min());        
        ph_max   =String.valueOf(fish.getPh_max()); 
        ph_min   =String.valueOf(fish.getPh_min());       
        porcetagem_oxi_max  =String.valueOf(fish.getPorcetagem_oxi_max());    
        porcetagem_oxi_min  =String.valueOf(fish.getPorcetagem_oxi_min());         
        query =query+"("+ nome +","+agua+","+temp_min+","+temp_max+","+ph_min+","+ph_max+","+porcetagem_oxi_min+","+porcetagem_oxi_max+");";
        
        System.out.println(query);
        return query;
    }
    public String funcionario(Funcionario func){
        query = "insert into funcionario(nome,cpf,fk_tanque_idtanque,fk_turno_idturno,fk_cargo_idcargo)values";
        String nome      = func.getNome();
        String cpf       = func.getCpf();
        String fk_tanque = String.valueOf(func.getTanqueId());
        String fk_cargo  = func.getIdCargo();
        String fk_turno  = func.getIdTurno();
        query=query+"('"+nome+"','"+cpf+"',"+fk_tanque+","+fk_turno+","+fk_cargo+");";
        System.out.println(query);
        return query;
    }
    public String gerente(Gerente func){
        query = "insert into funcionario(nome,cpf,fk_tanque_idtanque,fk_turno_idturno,fk_cargo_idcargo)values";
        String nome= func.getNome();
        String cpf= func.getCpf();
        String fk_cargo = func.getIdCargo();
        String fk_turno = func.getIdTurno();
        query=query+"('"+nome+"','"+cpf+"',0,'"+fk_turno+"','"+fk_cargo+"');";
        System.out.println(query);
        return query;
    }
    public String endereco(Pessoa func){
        selectTable  = new SelectTable();
        query="insert into endereco (cidade,bairro,logradouro,complemento,cep,fk_funcionario_idfuncionario)values";
        Endereco endereco= func.getMoradia();
        String rua= endereco.getLorgadouro();
        String complemento=endereco.getComplemento();
        String bairro=endereco.getBairro();
        String cidade=endereco.getCidade();
        String cep= endereco.getCep();
        lista=selectTable.selectFunc("Select idfuncionario from Funcionario where cpf='"+func.getCpf()+"';");
        String id=String.valueOf(lista.get(0));
        query=query+"('"+cidade+"','"+bairro+"','"+rua+"','"+complemento+"','"+cep+"',"+id+");";
        System.out.println(query);
        return query;
    }  
    public String tanque(Tanque tanque){
        String query="insert into tanque(temperatura , ph , oxigenio , fk_peixe_idpeixe)values";
        String temp = String.valueOf(tanque.getSensor_temp());              
        String ph   = String.valueOf(tanque.getSensor_ph());  
        String oxigenio = String.valueOf(tanque.getSensor_oxi());  
        String fk_peixe = String.valueOf(tanque.getPeixe().getId());
        query=query+"("+temp+","+ph+","+oxigenio+","+fk_peixe+");";
        System.out.println(query);
        return query;
    }
    public String contato(Contato contato){
        selectTable  = new SelectTable();
        String query="insert into contato(dado,fk_TipoContato_idTipo,fk_funcionario_idfuncionario) values";
        String dado= contato.getDado();
        String tipo= contato.getTipo().getId();
        lista=selectTable.selectFunc("Select idfuncionario from Funcionario where cpf='"+contato.getCPFDono()+"';");
        String dono=String.valueOf(lista.get(0));
        query=query+"("+dado+","+tipo+","+dono+");";
        System.out.println(query);
        return query;
    }
    
    public String delecaoPeixe(){
        String nome= JOptionPane.showInputDialog("de o nome cientifico da espécie");
        String query = "delete from peixe where nomecientifico='"+ nome +"';";
        return query;
    }
    public String delecaoTanque(){
        String tanque= JOptionPane.showInputDialog("informe o numero do tanque que você vai deletar");
        String query = "delete from tanque where idtanque='"+ tanque +"';";
        return query;
    }
    public String delecaoFuncionario(){
        String nome= JOptionPane.showInputDialog("informe o nome do funcionario que você vai deletar");
        String query = "delete from funcionario where nome='"+ nome +"' ;";
        return query;
    }
    
    
    
    public String updatePeixe(){
        selectTable = new SelectTable();
        String query_retorno="";        
        String id = JOptionPane.showInputDialog("informe o codigo da especie que vc deseja atualizar.");
        String query_pesquisa="select * from peixe where idpeixe="+id+";";
        lista=selectTable.selectPeixe(query_pesquisa);
        System.out.println( lista );
        
        String nome_especie       =  String.valueOf(lista.get(1));
        String tipo_agua          =  String.valueOf(lista.get(2));
        String ph_max             =  String.valueOf(lista.get(4));
        String ph_min             =  String.valueOf(lista.get(3));
        String temp_max           =  String.valueOf(lista.get(6));
        String temp_min           =  String.valueOf(lista.get(5));
        String porcetagem_oxi_max =  String.valueOf(lista.get(8));
        String porcetagem_oxi_min =  String.valueOf(lista.get(7));
        
        Peixe peixe = new Peixe(nome_especie,tipo_agua,ph_max, ph_min, temp_max , temp_min, porcetagem_oxi_max , porcetagem_oxi_min );
              
        nome_especie      = JOptionPane.showInputDialog("Entre com NOVO nome da espécie\n");
        tipo_agua          = JOptionPane.showInputDialog("Entre com NOVO tipo da agua\n doce ou salgada");  
        ph_max             =(JOptionPane.showInputDialog("PH maximo NOVO suportado\n"));
        ph_min             =(JOptionPane.showInputDialog("PH minimo NOVO suportado\n"));
        temp_max           =(JOptionPane.showInputDialog("NOVO temperatura maxima suportada \n"));
        temp_min           =(JOptionPane.showInputDialog("NOVO temperatura minima suportada \n"));
        porcetagem_oxi_max =(JOptionPane.showInputDialog("NOVO oxigenacao maxima suportada\n"));
        porcetagem_oxi_min =(JOptionPane.showInputDialog("NOVO oxigenacao minima suportada\n"));
    
        Peixe peixenovo = new Peixe(nome_especie,tipo_agua,ph_max, ph_min, temp_max , temp_min, porcetagem_oxi_max , porcetagem_oxi_min );
            
        query_retorno="UPDATE peixe set idpeixe="+lista.get(0)+",nomecientifico='"+nome_especie+"',tipoagua='"+tipo_agua+"',tempmin="+temp_min+",tempmax="+temp_max+",phmin="+ph_min+",phmax="+ph_max+",oxmin="+porcetagem_oxi_min+",oxmax="+porcetagem_oxi_max+" where idpeixe="+lista.get(0)+";";
        System.out.println(query_retorno);
        return query_retorno;
    }
    public String updateTanque(){
        String query_retorno="";
        String id = JOptionPane.showInputDialog("informe o numero do tanque que você deseja alterar.");
        
        String ph           =  JOptionPane.showInputDialog("de NOVO ph\n");
        String oxi          =  JOptionPane.showInputDialog("de NOVO % oxigenio");  
        String temp         = (JOptionPane.showInputDialog("de NOVA tempretatura\n"));
        String nome_espe    = (JOptionPane.showInputDialog("informa aespecie do peixe\n"));
        selectTable = new SelectTable();
        String query_pesquisa="select * from peixe where nomecientifico='"+nome_espe+"';";
        lista=selectTable.selectPeixe(query_pesquisa);
        query_retorno ="UPDATE TANQUE SET idtanque="+id+",temperatura="+temp+",ph="+ph+",oxigenio="+oxi+",fk_peixe_idpeixe="+lista.get(0)+ " where idtanque="+id+";";
        System.out.println(query_retorno);
        return query_retorno;
    }
    
    public String updateFuncionario(){
        String query_retorno="";
        String nome = JOptionPane.showInputDialog("informe o nome do funcionario que você deseja alterar.");
        selectTable = new SelectTable();
        String query_pesquisa="select * from funcionario where nome='"+nome+"';";
        lista=selectTable.selectFunc(query_pesquisa);
        String nome_func          = JOptionPane.showInputDialog("NOVO nome.");
        String cpf                = JOptionPane.showInputDialog("NOVO cpf.");
        String tanque_do_func     = JOptionPane.showInputDialog("NOVO  numero do tanque.");
        String cargo              = JOptionPane.showInputDialog("NOVO cargo.");
        String turno_de_trabalho  = JOptionPane.showInputDialog("NOVO turno.");
        Cargo c = new Cargo();
        c.setCargo(cargo);
        cargo=c.getIdcargo(c);
        
        Turno t = new Turno();
        t.setTurno(turno_de_trabalho);
        turno_de_trabalho=t.getIdTurno(t);
        
        query_retorno="update funcionario set idfuncionario="+ lista.get(0) +",nome='"+nome_func+"',cpf='"+cpf+"',fk_tanque_idtanque="+tanque_do_func+",fk_turno_idturno="+turno_de_trabalho+",fk_cargo_idcargo="+cargo+"  where idfuncionario="+ lista.get(0)+";";
        return query_retorno;
    }

}

