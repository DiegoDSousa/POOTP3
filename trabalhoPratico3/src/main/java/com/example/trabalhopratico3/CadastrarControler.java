package com.example.trabalhopratico3;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class CadastrarControler {
    private Stage stage;
    private Scene scene;

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

        if(confirmarPassword(this.password.getText(),this.password_confirm.getText())){
            if(verificar()){
                String info=username.getText()+";"+email.getText()+";"+password.getText();
                FileWriter guardar=new FileWriter("src/main/java/com/example/trabalhopratico3/dados/"+this.username.getText()+".txt");
                guardar.write(""+this.username.getText()+"-"+this.password.getText()+"-"+
                        this.email.getText()+"-" + getcodigo()
                );
                guardar.close();
                System.out.println("Cadastrado com sucesso");
                clean(0);
            }else{
                System.out.println("Preencha todos os campos");
            }

        }else{
            System.out.println("passwords diferentes");
            clean(1);
        }


    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("login_view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("LOGIN");
        stage.show();
    }

    private  boolean confirmarPassword(String password,String passwordconfirm){
        if(password.equals(passwordconfirm)){return true;}
        return false;
    }
    private void clean(int valor){
        if(valor==1){
            this.password_confirm.clear();
            this.password.clear();
        }else{
            this.username.clear();
            this.email.clear();
            this.password_confirm.clear();
            this.password.clear();
        }

    }
    private int getcodigo() throws IOException {
        BufferedReader arquivo =new BufferedReader(new FileReader("src/main/java/BIU/Resources/codigos"));
        int codigo= Integer.parseInt(arquivo.readLine());
        FileWriter ficheiro=new FileWriter("src/main/java/BIU/Resources/codigos");
        PrintWriter guardar=new PrintWriter(ficheiro);
        guardar.print(codigo+1);
        guardar.close();
        return (codigo+1);
    }
    private boolean verificar(){
        if((this.username.getText()=="") || (this.password.getText()=="")||(this.email.getText()=="")||(this.password_confirm.getText()=="")){
            clean(0);
            return false;
        }
        return true;
    }
}
