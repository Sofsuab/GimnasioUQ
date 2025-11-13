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
}
