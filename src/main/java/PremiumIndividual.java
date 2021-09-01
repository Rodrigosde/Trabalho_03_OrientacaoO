public class PremiumIndividual extends Usuario{

    public String identificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote(){
        return this.getValor();
    }
}
