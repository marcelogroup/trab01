
package nucleopsicultura;


public abstract class Pessoa {
   String id;
   String   nome;
   String   cpf;
   String   senha;
   Endereco moradia;
   Cargo    cargo;
   Turno    turno_de_trabalho;
   
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
  //Tanque tanque;
}