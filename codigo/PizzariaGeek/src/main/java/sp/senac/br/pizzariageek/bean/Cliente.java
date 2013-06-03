package sp.senac.br.pizzariageek.bean;

public class Cliente {

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String value) {
        this.nome = value;
    }
    private String telefone;

    private String getTelefone() {
        return this.telefone;
    }

    private void setTelefone(final String value) {
        this.telefone = value;
    }
    private String endereco;

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(final String value) {
        this.endereco = value;
    }
    private String complemento;

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(final String value) {
        this.complemento = value;
    }
    private String referencia;

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(final String value) {
        this.referencia = value;
    }
}