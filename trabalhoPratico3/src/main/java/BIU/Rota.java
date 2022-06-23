package BIU;

import java.util.ArrayList;
import java.util.List;

public class Rota {
    private HashMap<String,String> ilhas=new HashMap<String,String>();

    public Rota(HashMap<String, String> ilhas) {
        this.ilhas = ilhas;
    }

    public void addRota(String Lpartida,String Destino){
        this.ilhas.put(Lpartida,Destino);
    }
}
