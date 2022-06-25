package BIU.USUARIO;

import BIU.VIAGEM.Viagemilha;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Lote{

    private  int codigo;
    private  int totalLugares;
    private  int LugaresDisponiveis;
    private double preco;
    private Viagemilha bilhetes;

    public Lote(int codigo,int TotalLugares,double preco,String localpartida, String localchegada, LocalDate dataPartida,LocalDate dataChegada) throws IOException {
        setCodigo(codigo);
        setTotalLugares(TotalLugares);
        setPreco(preco);
        setLugaresDisponiveis(TotalLugares);
        criarbilhetes(localpartida,localchegada,dataPartida,dataChegada);
    }
    public int getCodigo() {return codigo;}

    private void setCodigo(int codigo) {this.codigo = codigo;}

    public int getTotalLugares() {return this.totalLugares;}

    private void setTotalLugares(int totalLugares) {this.totalLugares = totalLugares;}

    public int getLugaresDisponiveis() {return this.LugaresDisponiveis;}

    private void setLugaresDisponiveis(int lugaresDisponiveis) {this.LugaresDisponiveis = lugaresDisponiveis;}

    public double getPreco() {return this.preco;}

    private void setPreco(double preco) {this.preco = preco;}
    private void criarbilhetes(String localpartida, String localchegada, LocalDate dataPartida,LocalDate dataChegada) throws IOException {
        bilhetes=new Viagemilha(localpartida,localchegada,dataPartida,dataChegada,getPreco());
        guardarBilhete(this.bilhetes);
    }
    private void guardarBilhete(Viagemilha bilhete) throws IOException {
        String infoViagem=bilhete.getLocalPartida()+"/"+bilhete.getLocalChegada()+"/"+bilhete.getDataPartida()+
                "/"+bilhete.getDataChegada()+"/"+bilhete.getCodigo()+"/"+
                bilhete.getPreco()+"/"+bilhete.getEstado()+"/"+this.getTotalLugares();
        String nome=bilhete.getLocalPartida()+"-"+bilhete.getLocalChegada();
        FileWriter guardar=new FileWriter("src/main/java/BIU/viagens/"+nome+".txt");
        guardar.write(infoViagem);
        guardar.close();
    }
}
