package co.edu.uniquindio.gimnasiouq.gimnasiouq.controller;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.factory.*;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.Usuario;

public class RecepcionistaController {
    ModelFactory modelFactory;
    public RecepcionistaController() {
        modelFactory = ModelFactory.getInstance();
    }

    public Usuario buscarUsuarioPorIdentificacion(String identificacion) {
        return modelFactory.buscarUsuarioPorIdentificacion(identificacion);
    }

    public Usuario agregarUsuario(String nombre, String apellido, String correo, String edad, String id, String telefono) {
        return modelFactory.agregarUsuario(nombre,apellido, correo, edad, id, telefono);
    }
}
