package BIU.bui;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class BIUcity extends BIU implements TituloTransporte{
    private int totalViagens;
    private List listaViagens;
    public void  carregarSaldo(double valor){
        super.setSaldo(valor);
    }

    public BIUcity(String nome, String Email, String morada, String numero, LocalDate data) throws IOException {
        super.addTitular(nome,numero,Email,morada,data);
        FileWriter guardar=new FileWriter("src/main/java/BIU/biuDados/titulares/cidade/"+super.getnometitular()+"_id:"+super.getcodigo()+".txt");
        guardar.write(""+super.getnometitular()+"/"+super.getmoradatitular()+"/"+super.getemailtitular()+
                "/"+super.getTelefonetitular()+"/" + super.getData()+"/"+super.getDataValidade()+
                "/"+super.getcodigo()+"/"+super.getChaveValicacao()+"/"+super.getSaldo()
        );
        guardar.close();
    }
    @Override
    public double pagarViagem() {
        return 0;
    }

    public int getTotalViagens() {
        return totalViagens;
    }

    public void setTotalViagens(int totalViagens) {
        this.totalViagens = totalViagens;
    }

    public List getListaViagens() {
        return listaViagens;
    }

    public void setListaViagens(List listaViagens) {
        this.listaViagens = listaViagens;
    }
}
