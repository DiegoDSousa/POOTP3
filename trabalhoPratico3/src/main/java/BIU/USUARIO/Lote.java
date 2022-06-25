package BIU.USUARIO;

public class Lote{
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTotalLugares() {
        return totalLugares;
    }

    public void setTotalLugares(int totalLugares) {
        this.totalLugares = totalLugares;
    }

    public int getLugaresDisponiveis() {
        return LugaresDisponiveis;
    }

    public void setLugaresDisponiveis(int lugaresDisponiveis) {
        LugaresDisponiveis = lugaresDisponiveis;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private  int codigo;
    private  int totalLugares;
    private  int LugaresDisponiveis;
    private double preco;
}
