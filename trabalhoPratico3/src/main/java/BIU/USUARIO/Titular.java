package BIU.USUARIO;

public class Titular implements Parceiro {
    private String nome;
    private String morada;
    private String e_mail;
    private String telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void ver(){
        System.out.println(nome+" "+e_mail+" "+telefone+" "+morada);
    }

    @Override
    public Transaccoes getTransacao() {
        return getTransacao();
    }

    @Override
    public void promover(Estatuto novoestatudo) {

    }

    @Override
    public int calcularpontos() {
        return 0;
    }

    @Override
    public Estatuto despromover(Estatuto novoestatudo) {
        return null;
    }
}
