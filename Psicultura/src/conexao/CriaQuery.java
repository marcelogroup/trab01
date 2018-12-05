/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

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
        query="insert into endereco (cidade,bairro,logradouro,complemento,cep,fk_funcionario_idfuncionario)values";
        Endereco endereco= func.getMoradia();
        String rua= endereco.getLorgadouro();
        String complemento=endereco.getComplemento();
        String bairro=endereco.getBairro();
        String cidade=endereco.getCidade();
        String cep= endereco.getCep();
        String id=String.valueOf(selectTable.selectFunc("Select id from Funcionario where cpf="+func.getCpf()+";").get(0));
        query=query+"('"+cidade+"','"+bairro+"','"+rua+"','"+complemento+"','"+cep+","+id+"');";
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
        String query="insert into contato(dado,fk_TipoContato_idTipo,fk_funcionario_idfuncionario) values";
        String dado= contato.getDado();
        String tipo= contato.getTipo().getId();
        String dono=String.valueOf(selectTable.selectFunc("Select id from Funcionario where cpf="+contato.getCPFDono()+";").get(0));
        query=query+"("+dado+","+tipo+","+dono+");";
        System.out.println(query);
        return query;
    }
}

