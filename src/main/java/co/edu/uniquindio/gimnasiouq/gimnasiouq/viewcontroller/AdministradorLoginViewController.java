

package co.edu.uniquindio.gimnasiouq.gimnasiouq.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdministradorLoginViewController {

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
    private PasswordField txtContrasenia;

    @FXML
    private TextField txtUsuario;




    @FXML
    void initialize() {
        cmbRol.getItems().addAll("Administrador", "Recepcionista");
        cmbRol.setValue("Seleccionar");

    }

    @FXML
    void OnActionOnLogin(ActionEvent event)  {
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        String rol = cmbRol.getValue();


        if (rol == null) {
            System.out.println("Seleccione un rol.");
            return;
        }

        try {
            if (rol.equals("Administrador") && usuario.equals("admin") && contrasenia.equals("1234")) {
                cambiarVentana(event, "/co/edu/uniquindio/gimnasiouq/gimnasiouq/Administrador.fxml");
            } else if (rol.equals("Recepcionista") && usuario.equals("recep") && contrasenia.equals("4321")) {
           ;  cambiarVentana(event, "/co/edu/uniquindio/gimnasiouq/gimnasiouq/Recepcionista.fxml");

            } else {
                mostrarMensaje("Error","Credenciales incorrectas","Por favor, verifique su usuario, contraseña y rol.", Alert.AlertType.ERROR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void cambiarVentana(ActionEvent event, String fxmlRuta) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlRuta));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();

    }

}









