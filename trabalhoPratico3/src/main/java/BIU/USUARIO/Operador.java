package BIU.USUARIO;

import java.io.IOException;
import java.time.LocalDate;

public class Operador implements Parceiro {
    private String codigo;
    private String nome;
    private String cede;
    private CategoriaOperador categoria;

    public Operador(String codigo,String nome,String cede,int categoria){
        setCodigo(codigo);setCede(cede);setNome(nome);setCategoriaOperador(categoria);
    }

    public String getCodigo() {return codigo;}

    private void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}

    private void setNome(String nome) {this.nome = nome;}

    public String getCede() {return cede;}

    private void setCede(String morada) {this.cede = morada;}
    private void setCategoriaOperador(int categoria){
        if(categoria==0){this.categoria=CategoriaOperador.Terrestre;}
        else if(categoria==1){this.categoria=CategoriaOperador.Maritimo;}
        else if(categoria==2){this.categoria=CategoriaOperador.Aereo;}
    }
    public void emitirLote(int codigo,int TotalLugares,double preco,String localpartida, String localchegada, LocalDate dataPartida,LocalDate dataChegada) throws IOException {
        Lote lote=new Lote(codigo,TotalLugares,preco,localpartida, localchegada,dataPartida,dataChegada);
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
