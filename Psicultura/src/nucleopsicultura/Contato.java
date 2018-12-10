/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nucleopsicultura;


public class Contato {
    private String dado;
    private TipoContato tipo=new TipoContato();
    private String dono;

    
    public Contato(String d,String t,String cpf){
        this.dado=d;
        if(t.equals("telefone")){
            tipo.setTelefone();
        }else{
            if(t.equals("email")){
                tipo.setEmail();
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
