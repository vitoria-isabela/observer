package vitoria;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Leitor> leitores = new ArrayList<>();
    private String ultimoArtigoPublicado;

    public void adicionarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    public void removerLeitor(Leitor leitor) {
        leitores.remove(leitor);
    }

    public String publicarArtigo(String titulo) {
        ultimoArtigoPublicado = titulo;
        return notificarLeitores();
    }

    private String notificarLeitores() {
        StringBuilder notificacoes = new StringBuilder();
        for (Leitor leitor : leitores) {
            notificacoes.append(leitor.notificarNovoArtigo(ultimoArtigoPublicado)).append("\n");
        }
        return notificacoes.toString().trim();
    }
}