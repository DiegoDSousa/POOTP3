package com.example.trabalhopratico3;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class CadastrarControler {
    @FXML
    private TextField username;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private TextField password_confirm;


    @FXML
    public void cadastro() throws IOException {
        String user=username.getText();
        FileWriter guardar=new FileWriter(username.getText()+".txt");
        String info=username.getText()+";"+email.getText()+";"+password.getText();
    }
}
