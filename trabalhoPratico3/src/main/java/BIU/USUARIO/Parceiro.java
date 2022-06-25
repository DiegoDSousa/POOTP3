package BIU.USUARIO;

public interface Parceiro {
    Transaccoes tranzacoes[] = new Transaccoes[0];
    Estatuto estatuto = null;
    int pontos = 0;
    Transaccoes getTransacao();
    int calcularpontos();
    void promover(Estatuto novoestatudo);
    Estatuto despromover(Estatuto novoestatudo);
}
