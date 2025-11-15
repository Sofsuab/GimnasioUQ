
package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class GimnasioUQ {

    private static GimnasioUQ instance;


    private String nombre;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Membresia> listaMembresias;
    private MembresiaBasica membresiaBasica;
    private MembresiaVip membresiaVip;
    private MembresiaPremium membresiaPremium;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Externo> listaExternos;
    private ArrayList<Clase> listaClases;
    private ArrayList<ReservaClase> listaReservasClases;
    private Administrador Administrador;
    private ArrayList<Entrenador> listaEntrenadores;
    private Recepcionista Recepcionista;

    public GimnasioUQ() {
        this.nombre = "Gimnasio UQ";
        this.listaUsuarios = new ArrayList<>();
        this.listaMembresias = new ArrayList<>();
        this.membresiaBasica = new MembresiaBasica(null, 50000, null, null, true);
        this.membresiaPremium = new MembresiaPremium(null, 80000, null, null, true);
        this.membresiaVip = new MembresiaVip(null, 120000, null, null, true);
        this.listaMembresias = new ArrayList<>();
        this.listaEstudiantes = new ArrayList<>();
        this.listaTrabajadores = new ArrayList<>();
        this.listaExternos = new ArrayList<>();
        this.listaClases = new ArrayList<>();
        this.listaReservasClases = new ArrayList<>();
        this.listaEntrenadores = new ArrayList<>();
    }


    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public MembresiaBasica getMembresiaBasica() {return membresiaBasica;}
    public void setMembresiaBasica(MembresiaBasica membresiaBasica) {this.membresiaBasica = membresiaBasica;}
    public MembresiaVip getMembresiaVip() {return membresiaVip;}
    public void setMembresiaVip(MembresiaVip membresiaVip) {this.membresiaVip = membresiaVip;}
    public MembresiaPremium getMembresiaPremium() {return membresiaPremium;}
    public void setMembresiaPremium(MembresiaPremium membresiaPremium) {this.membresiaPremium = membresiaPremium;}

    public ArrayList<Membresia> getListaMembresias() {return listaMembresias;}

    public ArrayList<Usuario> getListaUsuarios() {return listaUsuarios;}
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

    public String asignarMembresia(Usuario usuario, TipoMembresia duracion, Membresia membresia) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFinal = fechaActual.plusDays(1);
        String nombreMembresia = "";
        if (membresia instanceof MembresiaPremium) {
            nombreMembresia = "Membresía Premium";
        } else if (membresia instanceof MembresiaVip) {
            nombreMembresia = "Membresía VIP";
        } else if (membresia instanceof MembresiaBasica) {
            nombreMembresia = "Membresía Básica";
        }

        switch (duracion) {
            case ANUAL -> fechaFinal = fechaActual.plusYears(1);
            case MENSUAL -> fechaFinal = fechaActual.plusMonths(1);
            case TRIMESTRAL -> fechaFinal = fechaActual.plusMonths(3);
        }


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
        } else {
            return "Tipo de usuario no válido para asignar membresía.";
        }
        return "A "+usuario.getNombre()+" se le ha asignado la membresía "+ nombreMembresia+" con duración "+duracion+". \nFecha de inicio: "+membresiaAplicada.getFechaInicio()+" \nFecha de fin: "+membresiaAplicada.getFechaFin()+" \nCosto: $"+membresiaAplicada.getCosto()+"\nLas funciones que tiene esta membresia son: \n"+membresiaAplicada.mostrarAcceso();

    }

    public Usuario encontrarPorId(String id) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(id)) {
                return estudiante;
            }
        }
        for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getIdentificacion().equals(id)) {
                return trabajador;
            }
        }
        for (Externo externo : listaExternos) {
            if (externo.getIdentificacion().equals(id)) {
                return externo;
            }
        }
        return null; // Usuario no encontrado
    }

    public Usuario buscarUsuarioPorIdentificacion(String identificacion) {
        for (Usuario u: listaUsuarios){
            if (u.getIdentificacion().equals(identificacion)){
                return u;
            }
        }
        return null;
    }

    public Usuario agregarUsuario(String nombre, String apellido, String correo, String edad, String id, String telefono) {
        Usuario usuario=new Usuario (nombre, apellido, correo, edad, id, telefono);
        listaUsuarios.add(usuario);
    }
}


