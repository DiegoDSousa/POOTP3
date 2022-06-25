package com.example.trabalhopratico3;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.List;

public class LoginController {
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void login(ActionEvent event) throws IOException {
        String conteudo = "";
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/com/example/trabalhopratico3/dados/"+toString(this.username.getText())+".txt"));
        conteudo= arquivo.readLine();
        arquivo.close();
        System.out.println(this.password.getText());
        if((conteudo.split("-")[1]).equals(this.password.getText())){
            System.out.println("Login efetuado com sucesso");
            Parent root= FXMLLoader.load(getClass().getResource("main-view.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Main");
            stage.show();
        }else{
            System.out.println("password incorreta");
        }


    }

    private String toString(String text) {
        return text;
    }


    @FXML
    public void cadastrar(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("cadastrar-view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("CADASTRO");
        stage.show();
    }

}
