package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

public class MembresiaVip extends Membresia{
    @Override
    public String mostrarAcceso() {
        return "El usuario tiene acceso a todas las clases, acceso a la zona de Spa y acceso a un entrenador personal";
    }
}
