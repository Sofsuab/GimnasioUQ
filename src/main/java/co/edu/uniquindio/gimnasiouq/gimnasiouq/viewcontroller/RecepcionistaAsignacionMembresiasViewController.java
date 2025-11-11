package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class RecepcionistaAsignacionMembresiasViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Lupa;

    @FXML
    private Button btnAsignarMembresia;

    @FXML
    private Button btnBuscar;

    @FXML
    private ComboBox<String> cmbDuracion;

    @FXML
    private ComboBox<String> cmbTipoMembresia;

    @FXML
    private Label txtAsignacionMembresia;

    @FXML
    private Label txtDuracion;

    @FXML
    private Label txtIdM;

    @FXML
    private Label txtTipoMembresia;

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

    }

}
