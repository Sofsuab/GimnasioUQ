package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.util.ArrayList;

public class GimnasioUQ {
    private String nombre;
    private MembresiaBasica membresiaBasica;
    private MembresiaPremium membresiaPremium;
    private MembresiaVip membresiaVip;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Externo> listaExternos;
    private ArrayList<Clase> listaClases;
    private ArrayList<ReservaClase> listaReservasClases;
    private ArrayList<Administrador> listaAdministradores;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Recepcionista> listaRecepcionistas;

    public GimnasioUQ() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MembresiaBasica getMembresiaBasica() {
        return membresiaBasica;
    }

    public void setMembresiaBasica(MembresiaBasica membresiaBasica) {
        this.membresiaBasica = membresiaBasica;
    }

    public MembresiaPremium getMembresiaPremium() {
        return membresiaPremium;
    }

    public void setMembresiaPremium(MembresiaPremium membresiaPremium) {
        this.membresiaPremium = membresiaPremium;
    }

    public MembresiaVip getMembresiaVip() {
        return membresiaVip;
    }

    public void setMembresiaVip(MembresiaVip membresiaVip) {
        this.membresiaVip = membresiaVip;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public ArrayList<Externo> getListaExternos() {
        return listaExternos;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public ArrayList<ReservaClase> getListaReservasClases() {
        return listaReservasClases;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public ArrayList<Recepcionista> getListaRecepcionistas() {
        return listaRecepcionistas;
    }
}

