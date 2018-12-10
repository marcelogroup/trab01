/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import nucleopsicultura.*;


/**
 * converter objeto em query
 * 
 * 
 */
public class CriaQuery {
    private String query;
    private SelectTable selectTable;
    private ArrayList lista;
    
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
        nome ="'"+fish.getNomeEspecie()+"'";
        agua ="'"+fish.getTipoAgua()+"'";     
        temp_max =String.valueOf(fish.getTempMax());            
        temp_min =String.valueOf(fish.getTempMin());        
        ph_max   =String.valueOf(fish.getPhMax()); 
        ph_min   =String.valueOf(fish.getPhMin());       
        porcetagem_oxi_max  =String.valueOf(fish.getPorcetagemOxiMax());    
        porcetagem_oxi_min  =String.valueOf(fish.getPorcetagemOxiMin());         
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
        String temp = String.valueOf(tanque.getSensorTemp());              
        String ph   = String.valueOf(tanque.getSensorPh());  
        String oxigenio = String.valueOf(tanque.getSensorOxi());  
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
    
       // Peixe peixenovo = new Peixe(nome_especie,tipo_agua,ph_max, ph_min, temp_max , temp_min, porcetagem_oxi_max , porcetagem_oxi_min );
            
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
    public String updateEndereco(){
        String query_retorno="";
        String nome = JOptionPane.showInputDialog("informe o nome do funcionario que você deseja alterar.");
        selectTable = new SelectTable();
        String query_pesquisa="select * from funcionario where nome='"+nome+"';";
        lista=selectTable.selectFunc(query_pesquisa);
        lista = selectTable.selectEndereco("select * from endereco where fk_funcionario_idfuncionario ="+lista.get(0)+";");
        String idEndereco =   String.valueOf(lista.get(0));
        String fk       =   String.valueOf(lista.get(6));
        String cidade = JOptionPane.showInputDialog("NOVO informe a cidade");
        String bairro = JOptionPane.showInputDialog("NOVO informe a bairro");
        String logradouro = JOptionPane.showInputDialog("NOVO informe a lorgadouro");
        String complemento = JOptionPane.showInputDialog("NOVO informe a complemento");
        String cep = JOptionPane.showInputDialog("NOVO informe a cep");        
        query_retorno="update endereco set idendereco="+idEndereco+",cidade='"+ cidade +"',bairro='"+bairro+"',logradouro= '"+logradouro+"' ,complemento='"+complemento+"',cep="+cep+",fk_funcionario_idfuncionario="+fk+" where idfuncionario="+fk+";";
        return query_retorno;
    }
    public String updateContato(){
        String query_retorno="";
        String nome = JOptionPane.showInputDialog("informe o nome do funcionario que você deseja alterar.");
        selectTable = new SelectTable();
        String query_pesquisa="select * from funcionario where nome='"+nome+"';";
        lista=selectTable.selectFunc(query_pesquisa);
        lista = selectTable.selectContato("select * from contato where fk_funcionario_idfuncionario ="+lista.get(0)+";");
        String idContato =   String.valueOf(lista.get(0));
        String fk       =   String.valueOf(lista.get(2));
        String dado = JOptionPane.showInputDialog("NOVO informe o contato");
        String tipo = JOptionPane.showInputDialog("NOVO informe o tipo do contato");
        String idTipo="";
        if (tipo.equals("email")){
            idTipo="1";
        }else if (tipo.equals("telefone")){
            idTipo="2";
        }
        query_retorno="update contato set idContato="+idContato+",dado='"+ dado +"',fk_tipoContato_idTipo="+idTipo+",fk_funcionario_idfuncionario="+fk+" where idfuncionario="+fk+";";
        return query_retorno;
    }
}

