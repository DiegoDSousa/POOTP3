package BIU.bui;

import BIU.USUARIO.Titular;
import BIU.VIAGEM.Viagemilha;

import java.io.*;
import java.time.LocalDate;

abstract public class BIU {
    private static int codigo;
    private LocalDate data;
    private LocalDate dataValidade;
    private double saldo;
    private String chaveValicacao;
    private Titular portador=new Titular();

    public void setSaldo(double saldo) {
        this.saldo= saldo;
    }

    private void setCodigo() throws IOException {
        this.codigo=getid();}

    private int getid() throws IOException {
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/BIU/biuDados/idbiu"));
        int codigo= Integer.parseInt(arquivo.readLine());
        FileWriter ficheiro=new FileWriter("src/main/java/BIU/biuDados/idbiu");
        PrintWriter guardar=new PrintWriter(ficheiro);
        guardar.print(codigo+1);
        guardar.close();
        return (codigo+1);
    }
    public void setData(LocalDate Data){this.data=Data;}

    public static int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
    private void setDataValidade(){this.dataValidade=data.plusYears(1);}

    public double getSaldo() {
        return saldo;
    }

    public String getChaveValicacao() {
        return chaveValicacao;
    }
    public int getcodigo(){return this.codigo;}
    public String getnometitular(){return portador.getNome();}
    public String getTelefonetitular(){return portador.getTelefone();}
    public String getemailtitular(){return portador.getE_mail();}
    public String getmoradatitular(){return portador.getMorada();}

    protected void addTitular(String nome,String numero,String Email,String morada,LocalDate data) throws IOException {
        this.portador.setNome(nome);
        this.portador.setTelefone(numero);
        this.portador.setE_mail(Email);
        this.portador.setMorada(morada);
        setCodigo();
        setData(data);
        setchaveValidacao();
        setDataValidade();
    }


    private void setchaveValidacao(){
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
