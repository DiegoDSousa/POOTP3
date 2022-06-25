package BIU.USUARIO;

import java.io.IOException;
import java.time.LocalDate;

public class TVenda extends Transaccoes{
    private int prazoPagamento ;
    private LocalDate dataPagamento;

    public TVenda() throws IOException {
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
