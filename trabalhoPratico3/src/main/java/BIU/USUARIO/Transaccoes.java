package BIU.USUARIO;

import java.io.*;
import java.time.LocalDate;

public class Transaccoes {
    private LocalDate data;
    private int numero;
    public Transaccoes() throws IOException {
        setData(LocalDate.now());
        setNumero();
    }
    public LocalDate getData() {
        return data;
    }

    private void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero() throws IOException {
        this.numero = gettransacaoid();
    }

    private int gettransacaoid() throws IOException {
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/BIU/Resources/usuarios/transacao"));
        int codigo= Integer.parseInt(arquivo.readLine());
        FileWriter ficheiro=new FileWriter("src/main/java/BIU/Resources/usuarios/transacao");
        PrintWriter guardar=new PrintWriter(ficheiro);
        guardar.print(codigo+1);
        guardar.close();
        return (codigo+1);
    }

}
