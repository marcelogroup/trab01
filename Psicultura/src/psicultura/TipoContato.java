
package psicultura;

public class TipoContato {
    String tipo;
    String id;
    public String getTipo(){
        return this.tipo;
    }
    public String getId(){
        return this.id;
    }
    public void set_Telefone(){
        this.tipo="telefone";
        this.id="2";
    }
    public void set_email(){
        this.tipo="email";
        this.id="1";
    }
    
}
