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
class Funcionario {
    private String nome;
    private int id;
    private int idTanque;
    
    public Funcionario (String id, String nome){
        this.id=Integer.parseInt(id);
        this.nome=nome;
    }
    public void setTanque(int id,int tanque){
        if(id==this.id)
            this.idTanque=tanque;
    }
    public void listarFuncionario(int id){
        if(id==this.id)
            System.out.println("Funcionario "+this.nome+" responsavel pelo tanque numero "+this.idTanque);
    }
    
    public void editarNome(int id,String nome){
        if(id==this.id)
            this.nome=nome;
    }
}
