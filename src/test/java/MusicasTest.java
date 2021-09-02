import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicasTest {

    @Test
    void deveAdicionarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        musicas.adicionarPlayList(playList);

        assertTrue(musicas.verificarPlayList(playList));
        assertTrue(playList.verificarMusica(musicas));
    }

    @Test
    void deveApagarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        musicas.adicionarPlayList(playList);
        musicas.apagarPlayList(playList);

        assertFalse(musicas.verificarPlayList(playList));
        assertFalse(playList.verificarMusica(musicas));
    }

    @Test
    void deveRetornarExcecaoAdicionarPlayListNula() {
        try {
            Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
            musicas.adicionarPlayList(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("PlayList deve ser informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoApagarPlayListNula() {
        try {
            Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
            musicas.apagarPlayList(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("PlayList deve ser informada", e.getMessage());
        }
    }

}