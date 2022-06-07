package BIU;

abstract public class BIU {
    private static int codigo;
    private String data;
    private String dataValidade;
    private double saldo;
    private String chaveValicacao;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public static int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getChaveValicacao() {
        return chaveValicacao;
    }





}
