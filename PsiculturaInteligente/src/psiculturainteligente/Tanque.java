/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiculturainteligente;

/**
 *
 * @author André
 */
class Tanque {
    private int id;
    private double capacidade;
    private int idPeixe;
    private int idFuncionario;
    
    public Tanque(String id, String capacidade){
        this.id=Integer.parseInt(id);
        this.capacidade=Double.parseDouble(capacidade);
    }
    public void setPeixe(int id,int idPeixe){
        if(id==this.id){
            this.idPeixe=idPeixe;
        }
    }
    public void setFuncionario(int id,int idFunc){
        if(id==this.id){
            this.idFuncionario=idFunc;
        }
    }
    public void listarTanque(int id){
        if(id==this.id){
            System.out.println("Tanque Numero "+this.id);
            System.out.println("Possui capacidade de "+this.capacidade+"L");
            System.out.println("Comporta o peixe de id:"+this.idPeixe);
            System.out.println("Funcionario responsavel: ID "+this.idFuncionario);
        }
    }
}
