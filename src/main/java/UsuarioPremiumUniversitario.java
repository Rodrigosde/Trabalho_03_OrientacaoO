public class UsuarioPremiumUniversitario extends Usuario{

    public String identificarPessoa() {
        return this.getEmail();
    }

    public float calculaValorPacote(){
        return this.valor*0.8f;
    }

    public float calculaValorPacote(float desconto) {
        return this.valor *  (desconto/100);
    }
}
