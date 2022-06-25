package BIU.VIAGEM;

public class Viagem {
    private String estado;
    private double preco;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public double getPreco() {
        return preco;
    }


    public void setCodigo(String Codigo){this.codigo=Codigo;}
    public void setEstado(String Estado){this.estado=Estado;}
    public void setpreco(double valor){this.preco=valor;}

}
