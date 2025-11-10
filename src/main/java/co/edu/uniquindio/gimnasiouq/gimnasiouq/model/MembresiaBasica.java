package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

public class MembresiaBasica extends Membresia{
    @Override
    public String mostrarAcceso() {
        return "El usuario posee acceso general a las máquinas";
    }
}
