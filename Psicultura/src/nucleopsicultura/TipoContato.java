
package nucleopsicultura;

public class TipoContato {
    private String tipo;
    private String id;
   
    public String getTipo(){
        return this.tipo;
    }
    public String getId(){
        return this.id;
    }
    public void setTelefone(){
        this.tipo="telefone";
        this.id="2";
    }
    public void setEmail(){
        this.tipo="email";
        this.id="1";
    }
    
}
