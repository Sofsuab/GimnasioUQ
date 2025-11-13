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
    private Administrador Administrador;
    private ArrayList<Entrenador> listaEntrenadores;
    private Recepcionista Recepcionista;

    public GimnasioUQ() {}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public ArrayList<MembresiaBasica> getListaMembresiaBasica() {return listaMembresiaBasica;}
    public ArrayList<MembresiaPremium> getListaMembresiaPremium() {return listaMembresiaPremium;}
    public ArrayList<MembresiaVip> getListaMembresiaVip() {return listaMembresiaVip;}
    public ArrayList<Estudiante> getListaEstudiantes() {return listaEstudiantes;}
    public ArrayList<Trabajador> getListaTrabajadores() {return listaTrabajadores;}
    public ArrayList<Externo> getListaExternos() {return listaExternos;}
    public ArrayList<Clase> getListaClases() {return listaClases;}
    public ArrayList<ReservaClase> getListaReservasClases() {return listaReservasClases;}
    public ArrayList<Entrenador> getListaEntrenadores() {return listaEntrenadores;}
    public Administrador getAdministrador() {return Administrador;}
    public void setAdministrador(Administrador administrador) {Administrador = administrador;}
    public Recepcionista getRecepcionista() {return Recepcionista;}
    public void setRecepcionista(Recepcionista recepcionista) {Recepcionista = recepcionista;}


    public static GimnasioUQ getInstance() {
        if (instance == null) {
            instance = new GimnasioUQ();
        }
        return instance;
    }
    public static void setInstance(GimnasioUQ instance) {GimnasioUQ.instance = instance;}





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
    }

}


