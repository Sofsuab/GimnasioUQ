package co.edu.uniquindio.gimnasiouq.gimnasiouq.factory;

import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.GimnasioUQ;
import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.Usuario;

public class ModelFactory {
    private static ModelFactory instance;
    private GimnasioUQ gimnasioUQ;

    private ModelFactory() {
        gimnasioUQ = GimnasioUQ.getInstance();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public GimnasioUQ getGimnasioUQ() {
        return gimnasioUQ;
    }

    public Usuario buscarUsuarioPorIdentificacion(String identificacion) {
        return getGimnasioUQ().buscarUsuarioPorIdentificacion(identificacion);
    }

    public Usuario agregarUsuario(String nombre, String apellido, String correo, String edad, String id, String telefono) {
        return getGimnasioUQ().agregarUsuario(nombre, apellido, correo, edad, id, telefono );
    }
}
