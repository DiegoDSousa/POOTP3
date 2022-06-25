package BIU.bui;

import BIU.VIAGEM.Viagemilha;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BIUilhas extends BIU implements Passagemlha {


    public BIUilhas(String nome, String Email, String morada, String numero, LocalDate data) throws IOException {
        super.addTitular(nome,numero,Email,morada,data);
        FileWriter guardar=new FileWriter("src/main/java/BIU/biuDados/titulares/ilhas/"+super.getnometitular()+"_id:"+super.getcodigo()+".txt");
        guardar.write(""+super.getnometitular()+"/"+super.getmoradatitular()+"/"+super.getemailtitular()+
                "/"+super.getTelefonetitular()+"/" + super.getData()+"/"+super.getDataValidade()+
                "/"+super.getcodigo()+"/"+super.getChaveValicacao()+"/"+super.getSaldo()
        );
        guardar.close();
    }

    @Override
    public ArrayList<Viagemilha> procurar(LocalDate datapartida, String localPartida, LocalDate dataChegada, String localChegada, Boolean soldout) throws IOException {
        String conteudo="";
        ArrayList<Viagemilha>viagens = null;
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/BIU/viagens"+localPartida+"-"+localChegada+".txt"));
        conteudo= arquivo.readLine();
        arquivo.close();
        if(conteudo.split("/")[2].equals(datapartida) && (conteudo.split("/")[3].equals(dataChegada))) {
            viagens.add(new Viagemilha(localPartida,localChegada,datapartida,dataChegada,Double.parseDouble(conteudo.split("/")[5])));
        return viagens;
        }

        return viagens;
    }

    @Override
    public Viagemilha comprarViagem() {
        return null;
    }

    @Override
    public Viagemilha comprarViagem(LocalDate datapartida, String localPartida, LocalDate dataChegada, String localChegada, int numerobilhetes) throws IOException {

        double custo;
        int numero;
        String conteudo="";
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/BIU/viagens/"+localPartida+"-"+localChegada+".txt"));
        conteudo= arquivo.readLine();
        arquivo.close();

        if(conteudo.split("/")[2].equals(datapartida.toString()) && (conteudo.split("/")[3].equals(dataChegada.toString()))) {
            custo= Double.parseDouble(conteudo.split("/")[5])*numerobilhetes;
            if(super.getSaldo()<custo){
                System.out.println("Erro, Saldo insuficiente!!!");
            }else{
                numero= Integer.parseInt(conteudo.split("/")[7])-numerobilhetes;
                String info=conteudo.split("/")[0]+"/"+conteudo.split("/")[1]+
                        "/"+conteudo.split("/")[2]+"/"+conteudo.split("/")[3]+
                        "/"+conteudo.split("/")[4]+"/"+conteudo.split("/")[5]+
                        "/"+conteudo.split("/")[6]+"/"+numero;
                FileWriter guardar=new FileWriter("src/main/java/BIU/viagens/"+localPartida+"-"+localChegada+".txt");
                guardar.write(info);
                guardar.close();
                super.setSaldo(super.getSaldo()-custo);
            }
            return new Viagemilha(localPartida,localChegada,datapartida,dataChegada,Double.parseDouble(conteudo.split("/")[5]));
        }

        return null;
    }
}
