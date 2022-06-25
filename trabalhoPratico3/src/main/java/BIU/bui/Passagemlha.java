package BIU.bui;

import BIU.VIAGEM.Viagemilha;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface Passagemlha {
    ArrayList procurar(LocalDate datapartida, String localPartida, LocalDate dataChegada, String localChegada, Boolean soldout) throws IOException;

    Viagemilha comprarViagem();

    Viagemilha comprarViagem(LocalDate datapartida, String localPartida, LocalDate dataChegada, String localChegada, int numerobilhetes) throws IOException;
}
