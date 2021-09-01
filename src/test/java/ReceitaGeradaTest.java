import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaGeradaTest {

    Usuario premiumduo = new PremiumDuo();
    Usuario premiumindividual = new PremiumIndividual();
    Usuario premiumuniversitario = new PremiumUniversitario();
    List<Usuario> lista = new ArrayList<Usuario>();
    ReceitaGerada receitaGerada = new ReceitaGerada();

    @Test
    void calcularReceitaGeral() {
        premiumduo.setValor(34);
        premiumduo.setNumDispositivos(2);
        premiumindividual.setValor(36);
        premiumuniversitario.setValor(20);

        lista.add(premiumduo);
        lista.add(premiumindividual);
        lista.add(premiumuniversitario);

        assertEquals(106.0f,receitaGerada.calcularReceitaGeral(lista));
    }
}