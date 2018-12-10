/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;


public class Contato {
    String dado;
    TipoContato tipo=new TipoContato();
    String dono;
    /**
     * 
     * @param d dado
     * @param t tipo do dado
     */
    public Contato(String d,String t,String cpf){
        this.dado=d;
        if(t.equals("telefone")){
            tipo.set_Telefone();
        }else{
            if(t.equals("email")){
                tipo.set_email();
            }
        }
        this.dono=cpf;
    }
    public String getCPFDono(){
        return dono;
    }
    public String getDado(){
        return dado;
    }
    public TipoContato getTipo(){
        return tipo;
    }
}
