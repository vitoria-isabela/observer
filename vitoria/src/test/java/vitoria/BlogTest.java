package vitoria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlogTest {

    @Test
    void Given_Leitor_When_PublicarArtigo_Then_DeveNotificarLeitor() {
        Blog blog = new Blog();
        Leitor leitor = new Leitor("Leitor 1");
        blog.adicionarLeitor(leitor);

        String notificacoes = blog.publicarArtigo("Artigo 1");

        assertEquals("Leitor 1 foi notificado sobre o novo artigo: Artigo 1", notificacoes);
    }

    @Test
    void Given_Leitores_When_PublicarArtigo_Then_DeveNotificarTodosLeitores() {
        Blog blog = new Blog();
        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");
        blog.adicionarLeitor(leitor1);
        blog.adicionarLeitor(leitor2);

        String notificacoes = blog.publicarArtigo("Artigo 2");

        assertEquals("Leitor 1 foi notificado sobre o novo artigo: Artigo 2\nLeitor 2 foi notificado sobre o novo artigo: Artigo 2", notificacoes);
    }
}
