package BIU.VIAGEM;

import java.util.Timer;

public class Paragem {
    private String nomeLocalidade;
    private String sentido;
    private Timer horaEstimada;

    public java.lang.String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public void setNomeLocalidade(java.lang.String nomeLocalidade) {
        this.nomeLocalidade = nomeLocalidade;
    }

    public java.lang.String getSentido() {
        return sentido;
    }

    public void setSentido(java.lang.String sentido) {
        this.sentido = sentido;
    }

    public Timer getHoraEstimada() {
        return horaEstimada;
    }

    public void setHoraEstimada(Timer horaEstimada) {
        this.horaEstimada = horaEstimada;
    }
}
