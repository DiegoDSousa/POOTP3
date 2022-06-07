package BIU;

import java.util.List;

public class BIUcity extends BIU implements TituloTransporte{
    private int totalViagens;
    private List listaViagens;
    public void  carregarSaldo(double valor){
        super.setSaldo(valor);
    }

    @Override
    public double pagarViagem() {
        return 0;
    }
    public int getTotalViagens() {
        return totalViagens;
    }

    public void setTotalViagens(int totalViagens) {
        this.totalViagens = totalViagens;
    }

    public List getListaViagens() {
        return listaViagens;
    }

    public void setListaViagens(List listaViagens) {
        this.listaViagens = listaViagens;
    }
}
