import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayListTest {

    @Test
    void deveAdicionarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        playList.adicionarMusica(musicas);

        assertTrue(musicas.verificarPlayList(playList));
        assertTrue(playList.verificarMusica(musicas));
    }

    @Test
    void deveApagarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        playList.adicionarMusica(musicas);
        playList.apagarMusica(musicas);

        assertFalse(musicas.verificarPlayList(playList));
        assertFalse(playList.verificarMusica(musicas));
    }

    @Test
    void deveRetornarExcecaoAdicionarMusicaNulo() {
        try {
            PlayList playList = new PlayList("Classicas");
            playList.adicionarMusica(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Musica deve ser informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoApagarMusicaNulo() {
        try {
            PlayList playList = new PlayList("Classicas");
            playList.apagarMusica(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Musica deve ser informada", e.getMessage());
        }
    }

}