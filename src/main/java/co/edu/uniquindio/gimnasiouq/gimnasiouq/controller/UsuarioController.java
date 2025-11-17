package co.edu.uniquindio.gimnasiouq.gimnasiouq.controller;

import co.edu.uniquindio.gimnasiouq.gimnasiouq.factory.ModelFactory;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.Usuario;

public class UsuarioController {
    public boolean agregarUsuario(Usuario usuario) {
        if (usuario == null) return false;
        return ModelFactory.getInstance().agregarUsuario(usuario);
    }

    public boolean actualizarUsuario(String identificacionOriginal, Usuario usuario) {
        if (identificacionOriginal == null || identificacionOriginal.isEmpty() || usuario == null) return false;
        return ModelFactory.getInstance().actualizarUsuario(identificacionOriginal, usuario);
    }

    public boolean eliminarUsuario(String identificacion) {
        if (identificacion == null || identificacion.isEmpty()) return false;
        return ModelFactory.getInstance().eliminarUsuario(identificacion);
    }
}
