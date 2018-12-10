
package nucleopsicultura;

/**
  *classe que define o endereço do funcionario
 * @author marcelo
 */
public class Endereco {
    String cep;
    String cidade;
    String bairro;
    String lorgadouro;
    String complemento;
    
    public Endereco(String cep,String cidade, String bairro, String lorgadouro,String complemento){
        this.setCep(cep);
        this.setCidade(cidade);
        this.setBairro(bairro);
        this.setComplemento(complemento);
        this.setLorgadouro(lorgadouro);
    }
    

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLorgadouro() {
        return lorgadouro;
    }

    public void setLorgadouro(String lorgadouro) {
        this.lorgadouro = lorgadouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
