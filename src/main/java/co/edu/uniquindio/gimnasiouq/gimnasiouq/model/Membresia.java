package co.edu.uniquindio.gimnasiouq.gimnasiouq.model;

import java.time.LocalDate;

public class Membresia {
    private TipoMembresia tipoMembresia;
    private double costo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean estado;

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }
    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public boolean isEstado() {
        return estado;
    }
}
