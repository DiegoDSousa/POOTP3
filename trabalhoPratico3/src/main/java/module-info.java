module com.example.trabalhopratico3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabalhopratico3 to javafx.fxml;
    exports com.example.trabalhopratico3;
}