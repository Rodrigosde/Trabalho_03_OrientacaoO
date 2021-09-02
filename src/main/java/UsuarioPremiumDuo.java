public class UsuarioPremiumDuo extends Usuario{

    public String identificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote() {

        return this.getValor() + (this.getNumDispositivos() * 10.0f);
    }
}
