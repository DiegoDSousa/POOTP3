package com.example.trabalhopratico3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BIUController {
    private Stage stage;
    private Scene scene;

    @FXML
    public void login(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("login_view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("LOGIN");
        stage.show();
    }
    @FXML
    public void cadastrar(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("cadastrar-view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("CADASTRO");
        stage.show();
    }

    
}