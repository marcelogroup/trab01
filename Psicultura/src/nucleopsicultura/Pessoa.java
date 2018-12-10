
package nucleopsicultura;


public abstract class Pessoa {
   public  String id;
   public String nome;
   public String cpf;
   public String senha;
   public Endereco moradia;
   public Cargo cargo;
   public Turno turno_de_trabalho;
   
   public Endereco getMoradia() {
        return moradia;
    }

    public void setMoradia(Endereco moradia) {
        this.moradia = moradia;
    }
    public String getCpf() {
        return cpf;
    }
    public String getId(){
        return id;
    }
  
}