package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class RecepcionistaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnAsignarMembresia;

    @FXML
    private Button btnBuscar;

    @FXML
    private ComboBox<String> cmbDuracion;

    @FXML
    private ComboBox<String> cmbTipoMembresia;

    @FXML
    private ComboBox<String> cmbTipoUsuario;

    @FXML
    private Label txtApellido;

    @FXML
    private Label txtAsignacionMembresia;

    @FXML
    private Label txtCorreo;

    @FXML
    private Label txtDuracion;

    @FXML
    private Label txtEdad;

    @FXML
    private Label txtId;

    @FXML
    private Label txtNombre;

    @FXML
    private Label txtTelefono;

    @FXML
    private Label txtTipoMembresia;

    @FXML
    void OnActionAgregarUsuario(ActionEvent event) {

    }

    @FXML
    void OnActionAsignarMembresia(ActionEvent event) {

    }

    @FXML
    void OnActionBuscar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        cmbTipoMembresia.getItems().addAll("Basica", "Premium", "VIP");
        cmbTipoMembresia.setValue("Seleccionar");
        cmbDuracion.getItems().addAll("Mensual", "Trimestral", "Anual");
        cmbDuracion.setValue("Seleccionar");
        cmbTipoUsuario.getItems().addAll("Estudiante", "Trabajador", "Externo");
        cmbTipoUsuario.setValue("Seleccionar");
    }

}

