package BIU;

import BIU.USUARIO.Titular;

abstract public class BIU {
    private static int codigo;
    private String data;
    private String dataValidade;
    private double saldo;
    private String chaveValicacao;
    Titular portador=new Titular();

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

    public void setchaveValidacao(){
        String[] nome=portador.getNome().split(" ");
        String Nome=nome[0];
        String Apelido=nome[1];
        this.chaveValicacao=criarChaveConfirmacao(Nome,Apelido);

    }
    private String criarChaveConfirmacao(String primeiroNome, String segundoNome){
        String chave=devider(primeiroNome)+devider(segundoNome)+this.data+this.codigo;
        return chave;
    }
    private String devider(String conteudo){
        String nomere=" ";
        char[] intermediario = new char[5];

        if (conteudo.length() <= 5) {
            nomere=conteudo;
        } else {
            conteudo.getChars((conteudo.length()-5), conteudo.length(), intermediario, 0);
            nomere = new StringBuilder(String.valueOf(intermediario)).reverse().toString();
        }
        return upperCaseFirst(nomere);
    }
    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }





}
