package vitoria;

public class Leitor {
    private String nome;
    private String ultimaNotificacao;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public String notificarNovoArtigo(String titulo) {
        ultimaNotificacao = nome + " foi notificado sobre o novo artigo: " + titulo;
        return ultimaNotificacao;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}