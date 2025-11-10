

package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresar;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private Label lblBienvenida;

    @FXML
    private Label txtContrasenia;

    @FXML
    private Label txtUsuario;

    @FXML
    private Label txtUsuario1;

    @FXML
    void initialize() {
        cmbRol.getItems().addAll("Administrador", "Recepcionista");
        cmbRol.setValue("Seleccionar");
    }

}









