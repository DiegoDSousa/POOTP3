package BIU.bui;

import BIU.USUARIO.Operador;

import java.io.IOException;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) throws IOException {
        BIUcity teste=new BIUcity("William Carvalho","wcarvalho@uta.cv","rberabot","099439940039",LocalDate.of(2022,8,12));

        System.out.println(teste.getChaveValicacao());
        Operador william=new Operador("will4","William Carvalho","mindelo",1);
        william.emitirLote(2,30,800,"Mindelo","Porto",
                LocalDate.of(2022,8,12),LocalDate.of(2022,8,12));
        BIUilhas teste2=new BIUilhas("Diego Sousa","wcarvalho@uta.cv","rberabot","099439940039",LocalDate.of(2022,8,12));
        BIUilhas teste3=new BIUilhas("William CArvalho","wcarvalho@uta.cv","rberabot","099439940039",LocalDate.of(2022,8,12));

        teste3.setSaldo(500000);
        teste2.setSaldo(2000);
        teste2.comprarViagem(LocalDate.of(2022,8,12),"Mindelo",LocalDate.of(2022,8,12),"Porto",2);
        teste3.comprarViagem(LocalDate.of(2022,8,12),"Mindelo",LocalDate.of(2022,8,12),"Porto",8);
        System.out.println(teste2.getSaldo());
        System.out.println(teste3.getSaldo());
    }
}
