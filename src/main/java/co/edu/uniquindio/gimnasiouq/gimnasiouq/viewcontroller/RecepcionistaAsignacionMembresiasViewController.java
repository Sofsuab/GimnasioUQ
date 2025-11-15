package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.TipoMembresia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.*;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.controller.RecepcionistaController;
public class RecepcionistaAsignacionMembresiasViewController {
    RecepcionistaController recepcionistaController;
    @FXML
    private Label lblUsuarioEncontrado;

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
    private ComboBox<TipoMembresia> cmbDuracion;

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
    private TextField txtId;

    @FXML
    void OnActionAsignarMembresia(ActionEvent event) {
        //asignarMembresia();
    }



    @FXML
    void OnActionBuscar(ActionEvent event) {
        buscarUsuario();
    }

    private void buscarUsuario() {
        String identificacion = txtId.getText();
        Usuario usuario = recepcionistaController.buscarUsuarioPorIdentificacion(identificacion);
        if (usuario != null) {
            lblUsuarioEncontrado.setText(usuario.getNombre());
        } else {
            mostrarMensaje("Error", "Usuario no encontrado", "No se encontró ningún usuario con la identificación proporcionada.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void initialize() {
        cmbTipoMembresia.getItems().addAll("Basica", "Premium", "VIP");
        cmbTipoMembresia.setValue("Seleccionar");
        cmbDuracion.getItems().addAll(TipoMembresia.MENSUAL, TipoMembresia.TRIMESTRAL, TipoMembresia.ANUAL);
        cmbDuracion.setValue(TipoMembresia.MENSUAL);
        RecepcionistaController recepcionistaController = new RecepcionistaController();

    }


    /*private void asignarMembresia() {
        String identificacion = txtId.getText();
        Usuario usuario = recepcionistaController.buscarUsuarioPorIdentificacion(identificacion);
        String tipoMembresiaStr = cmbTipoMembresia.getValue();
        TipoMembresia duracion = cmbDuracion.getValue();
        Membresia membresia = null;

        String resultado = recepcionistaController.asignarMembresia(usuario, duracion, membresia);
        if (resultado != null) {
            lblUsuarioEncontrado.setText(resultado);
            mostrarMensaje("Asignación Exitosa", "Membresía Asignada", resultado, Alert.AlertType.INFORMATION);
        } else {
            mostrarMensaje("Error", "Asignación Fallida", "No se pudo asignar la membresía. Verifique los datos ingresados.", Alert.AlertType.ERROR);
        }

    }*/

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();

    }
}
