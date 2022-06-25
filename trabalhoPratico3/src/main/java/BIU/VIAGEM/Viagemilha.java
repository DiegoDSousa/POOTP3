package BIU.VIAGEM;

import javafx.scene.chart.PieChart;

import java.time.LocalDate;

public class Viagemilha extends Viagem {
    private String localPartida;
    private String localChegada;
    private LocalDate dataPartida;
    private LocalDate dataChegada;

    public void cancelarViagem(){
        super.setEstado("cancelado");
    };

    public void setLocalPartida(String LocalPartida){this.localPartida=LocalPartida;}
    public void setLocalChegada(String LocalChegada){this.localChegada=LocalChegada;}
    public void setDataPartida(LocalDate dataPartida) {this.dataPartida = dataPartida;}
    public void setDataChegada(LocalDate dataChegada) {this.dataChegada = dataChegada;}



    public String getLocalPartida() {return localPartida;}
    public String getLocalChegada() {return localChegada;}
    public LocalDate getDataPartida() {return dataPartida;}
    public LocalDate getDataChegada() {return dataChegada;}
    public double getpreco(){return super.getPreco();}
    public String getcodigo(){return super.getCodigo();}
    public String getestado(){return super.getEstado();}

    public Viagemilha(String localpartida, String localchegada, LocalDate dataPartida,LocalDate dataChegada,double valor){
        setLocalChegada(localchegada);
        setLocalPartida(localpartida);
        setDataPartida(dataPartida);
        setDataChegada(dataChegada);
        super.setpreco(valor);
        super.setEstado("Disponivel");
        super.setCodigo("codig0");
    }

}
