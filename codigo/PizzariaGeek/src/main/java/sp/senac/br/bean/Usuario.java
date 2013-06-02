package sp.senac.br.bean;

public class Usuario {

    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String value) {
        this.email = value;
    }
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String value) {
        this.nome = value;
    }
    private String apelido;

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(final String value) {
        this.apelido = value;
    }
    private String senha;

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(final String value) {
        this.senha = value;
    }
    private boolean expirado;

    public boolean isExpirado() {
        return this.expirado;
    }

    public void setExpirado(final boolean value) {
        this.expirado = value;
    }
}