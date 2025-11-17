
package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class GimnasioUQ {

    private static GimnasioUQ instance;


    private String nombre;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Membresia> listaMembresias;
    private ArrayList<Clase> listaClases;
    private ArrayList<ReservaClase> listaReservasClases;
    private ArrayList<Empleado> listaEmpleados;

    public GimnasioUQ() {
        this.nombre = "Gimnasio UQ";
        this.listaUsuarios = new ArrayList<>();
        this.listaMembresias = new ArrayList<>();
        this.listaClases = new ArrayList<>();
        this.listaReservasClases = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();

    }

    public static GimnasioUQ getInstance() {
        return instance;
    }

    public static void setInstance(GimnasioUQ instance) {
        GimnasioUQ.instance = instance;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Membresia> getListaMembresias() {
        return listaMembresias;
    }

    public void setListaMembresias(ArrayList<Membresia> listaMembresias) {
        this.listaMembresias = listaMembresias;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public ArrayList<ReservaClase> getListaReservasClases() {
        return listaReservasClases;
    }

    public void setListaReservasClases(ArrayList<ReservaClase> listaReservasClases) {
        this.listaReservasClases = listaReservasClases;
    }
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }


}