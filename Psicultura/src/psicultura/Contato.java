/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;

/**@author marcelo
 *
 * 
 */
public class Contato {
    String dado;
    TipoContato tipo;
    /**
     * 
     * @param d dado
     * @param t tipo do dado
     */
    public Contato(String d,String t){
        this.dado=d;
        if(t.equals("telefone")){
            tipo.set_Telefone();
        }else{
            if(t.equals("email")){
                tipo.set_email();
            }
        }
    }
}
