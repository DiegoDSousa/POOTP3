package BIU.bui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Rota {
    private HashMap<String,String> ilhas=new HashMap<String,String>();
    private String partida;
    private String destino;

    public void addRota(String partida,String destino){
        ilhas.put(this.partida,this.destino);
    }
    public Rota(HashMap<String, String> ilhas) {
        this.ilhas = ilhas;
    }


}
