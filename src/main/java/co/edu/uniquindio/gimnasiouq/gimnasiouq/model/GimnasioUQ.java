package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class GimnasioUQ {

    private static GimnasioUQ instance;


    private String nombre;
    private ArrayList<MembresiaBasica> listaMembresiaBasica;
    private ArrayList<MembresiaPremium> listaMembresiaPremium;
    private ArrayList<MembresiaVip> listaMembresiaVip;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Externo> listaExternos;
    private ArrayList<Clase> listaClases;
    private ArrayList<ReservaClase> listaReservasClases;
    private ArrayList<Administrador> listaAdministradores;
    private Administrador administradorLogueado;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Recepcionista> listaRecepcionistas;
    private Recepcionista recepcionistaLogueada;

    public GimnasioUQ() {}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public ArrayList<MembresiaBasica> getListaMembresiaBasica() {return listaMembresiaBasica;}
    public ArrayList<MembresiaPremium> getListaMembresiaPremium() {return listaMembresiaPremium;}
    public ArrayList<MembresiaVip> getListaMembresiaVip() {return listaMembresiaVip;}
    public Administrador getAdministradorLogueado() {return administradorLogueado;}
    public Recepcionista getRecepcionistaLogueada() {return recepcionistaLogueada;}
    public ArrayList<Estudiante> getListaEstudiantes() {return listaEstudiantes;}
    public ArrayList<Trabajador> getListaTrabajadores() {return listaTrabajadores;}
    public ArrayList<Externo> getListaExternos() {return listaExternos;}
    public ArrayList<Clase> getListaClases() {return listaClases;}
    public ArrayList<ReservaClase> getListaReservasClases() {return listaReservasClases;}
    public ArrayList<Administrador> getListaAdministradores() {return listaAdministradores;}
    public ArrayList<Entrenador> getListaEntrenadores() {return listaEntrenadores;}
    public ArrayList<Recepcionista> getListaRecepcionistas() {return listaRecepcionistas;}


    public static GimnasioUQ getInstance() {
        if (instance == null) {
            instance = new GimnasioUQ();
        }
        return instance;
    }

    public Recepcionista recepcionistaLogin(int identificacion, String password){
        Recepcionista recepcionistaSeleccionada= new Recepcionista();
        for (Recepcionista recepcionista : listaRecepcionistas) {
            if (recepcionista.getIdentificacion()==identificacion && recepcionista.getPassword().equals(password)) {
                recepcionistaSeleccionada = recepcionista;
                break;
            }
        }
        return recepcionistaSeleccionada;
    }

    public Administrador administradorLogin(int identificacion, String password){
        Administrador administradorSeleccionado= new Administrador();
        for (Administrador administrador : listaAdministradores) {
            if (administrador.getIdentificacion()==identificacion && administrador.getPassword().equals(password)) {
                administradorSeleccionado = administrador;
                break;
            }
        }
        return administradorSeleccionado;
    }


    public void registrarUsuario(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }
    public void registrarUsuario(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
    }
    public void registrarExterno(Externo externo) {
        listaExternos.add(externo);
    }

    public void asignarMembresia(Usuario usuario, TipoMembresia duracion, Membresia membresia) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFinal = fechaActual.plusDays(1);

        switch (duracion) {
            case ANUAL -> fechaFinal = fechaActual.plusYears(1);
            case MENSUAL -> fechaFinal = fechaActual.plusMonths(1);
            case TRIMESTRAL -> fechaFinal = fechaActual.plusMonths(3);
        }

        // Crear copia de la membresía o usar la misma instancia
        Membresia membresiaAplicada = membresia;
        membresiaAplicada.setFechaInicio(fechaActual);

        double costoDescuento = membresia.getCosto() * 0.20;

        if (usuario instanceof Estudiante estudiante) {
            membresiaAplicada.setCosto(membresiaAplicada.getCosto() - costoDescuento);
            membresiaAplicada.setFechaFin(fechaFinal);
            estudiante.setMembresia(membresiaAplicada);

        } else if (usuario instanceof Trabajador trabajador) {
            switch (duracion) {
                case ANUAL -> fechaFinal = fechaFinal.plusMonths(3);
                case TRIMESTRAL -> fechaFinal = fechaFinal.plusMonths(2);
                case MENSUAL -> fechaFinal = fechaFinal.plusMonths(1);
            }
            membresiaAplicada.setFechaFin(fechaFinal);
            trabajador.setMembresia(membresiaAplicada);

        } else if (usuario instanceof Externo externo) {
            membresiaAplicada.setFechaFin(fechaFinal);
            externo.setMembresia(membresiaAplicada);
        }

        System.out.println("Membresía asignada correctamente a: " + usuario.getNombre());
    }

}


