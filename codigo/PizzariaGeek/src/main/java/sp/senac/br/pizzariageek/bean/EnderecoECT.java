package sp.senac.br.pizzariageek.bean;

public class EnderecoECT {

    private String cep;

    public String getCep() {
        return this.cep;
    }

    public void setCep(final String value) {
        this.cep = value;
    }
    private String logradouro;

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(final String value) {
        this.logradouro = value;
    }
    private String numero;

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(final String value) {
        this.numero = value;
    }
    private String complemento;

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(final String value) {
        this.complemento = value;
    }
    private String bairro;

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(final String value) {
        this.bairro = value;
    }
}