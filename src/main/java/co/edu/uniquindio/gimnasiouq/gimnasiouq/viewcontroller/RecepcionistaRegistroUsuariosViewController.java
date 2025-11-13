package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class RecepcionistaRegistroUsuariosViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnActualizar;

    @FXML
    private ComboBox<String> cmbTipoUsuario;

    @FXML
    private Label txtApellido;

    @FXML
    private Label txtCorreo;

    @FXML
    private Label txtEdad;

    @FXML
    private Label txtId;

    @FXML
    private Label txtNombre;

    @FXML
    private Label txtTelefono;

    @FXML
    void OnActionAgregarUsuario(ActionEvent event) {

    }

    @FXML
    void OnActionEliminar(ActionEvent event) {

    }

    @FXML
    void OnActionActualizar(ActionEvent event) {

    }


    @FXML
    void initialize() {
        cmbTipoUsuario.getItems().addAll("Estudiante", "Trabajador", "Externo");
        cmbTipoUsuario.setValue("Seleccionar");

    }

}

