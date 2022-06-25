package BIU.VIAGEM;

import javafx.scene.chart.PieChart;

import java.time.LocalDate;

public class Viagemilha extends Viagem {
    private String localPartida;
    private LocalDate dataPartida;
    private String localChegada;
    private LocalDate dataChegada;

    public void cancelarViagem(){
        super.setEstado(){}

    };
    public void setLocalPartida(String LocalPartida){this.localPartida=LocalPartida;}
    public void setLocalChegada(String LocalChegada){this.localChegada=LocalChegada;}

}
