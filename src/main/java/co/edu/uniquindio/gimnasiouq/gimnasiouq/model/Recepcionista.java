package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.time.LocalDate;

public class Recepcionista extends Empleado{
    private String password;
    public Recepcionista(String nombre, int identificacion, int telefono, String password) {
        super(nombre, identificacion, telefono);
        this.password=password;
    }
    public Recepcionista(){}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public void registrarUsuario(String nombre, String apellido, String identificacion, int edad, String telefono, String correo, String tipo) {
        switch(tipo){
            case "Estudiante" :
                Estudiante estudiante = new Estudiante(nombre,apellido,identificacion,edad, telefono,correo);
                GimnasioUQ.getInstance().registrarUsuario(estudiante);
            case "Trabajador" :
                Trabajador trabajador = new Trabajador(nombre,apellido,identificacion,edad, telefono,correo);
                GimnasioUQ.getInstance().registrarUsuario(trabajador);
            case "Externo":
                Externo externo = new Externo(nombre,apellido,identificacion,edad, telefono,correo);
                GimnasioUQ.getInstance().registrarExterno(externo);
        }
    }

    public void asignarMembresia(Usuario usuario, TipoMembresia duracion, Membresia membresia) {
        GimnasioUQ.getInstance().asignarMembresia(usuario, duracion, membresia);
    }

}
