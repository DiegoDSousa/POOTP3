package BIU.bui;

public class main {
    public static void main(String[] args) {
        BIUcity teste=new BIUcity("William Carvalho","wcarvalho@uta.cv","rberabot","099439940039");
        teste.setData("22-333-4444");
        teste.setCodigo(123);
        teste.setchaveValidacao();
        System.out.println(teste.getChaveValicacao());
    }
}
