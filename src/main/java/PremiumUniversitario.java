public class PremiumUniversitario extends Usuario{

    public String identificarPessoa() {
        return this.getEmail();
    }

    public float calculaValorPacote(){
        return this.valor*0.8f;
    }
}
