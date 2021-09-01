public abstract class Usuario {

    private String email;
    private String senha;
    private int numDispositivos = 1;
    protected float valor;

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public int getNumDispositivos() {
        return numDispositivos;
    }

    public Usuario setNumDispositivos(int numDispositivos) {
        this.numDispositivos = numDispositivos;
        return this;
    }

    public float getValor() {
        return valor;
    }

    public Usuario setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public abstract float calculaValorPacote();

    public abstract String identificarPessoa();
}
