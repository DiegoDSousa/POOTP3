package BIU.bui;

import BIU.USUARIO.Titular;

abstract public class BIU {
    private static int codigo;
    private String data;
    private String dataValidade;
    private double saldo;
    private String chaveValicacao;
    private Titular portador=new Titular();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setCodigo(int codigo1){this.codigo=codigo1;}

    public void setData(String Data){this.data=Data;}

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

    public void ver(){
        portador.ver();
    }

    protected void addTitular(String nome,String numero,String Email,String morada){
        this.portador.setNome(nome);
        this.portador.setTelefone(numero);
        this.portador.setE_mail(Email);
        this.portador.setMorada(morada);
    }

    public void setchaveValidacao(){
        String[] nome=portador.getNome().split(" ");
        String Nome=nome[0];
        String Apelido=nome[1];
        this.chaveValicacao=criarChaveConfirmacao(Nome,Apelido);
    }

    private String criarChaveConfirmacao(String primeiroNome, String segundoNome){
        String chave=codificador(primeiroNome)+codificador(segundoNome)+this.data+ this.codigo;
        return chave;
    }

    private String codificador(String conteudo){
        String codificado=" ";
        char[] intermediario = new char[5];

        if (conteudo.length() <= 5) {
            codificado=conteudo;
        } else {
            conteudo.getChars((conteudo.length()-5), conteudo.length(), intermediario, 0);
            codificado = new StringBuilder(String.valueOf(intermediario)).reverse().toString();
        }
        return upperCaseFirst(codificado);
    }

    private static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }


}
