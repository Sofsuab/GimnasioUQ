package co.edu.uniquindio.gimnasiouq.gimnasiouq.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloViewController {
    @FXML
    private Label welcomeText;




    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("hola a todos!");
    }
}
