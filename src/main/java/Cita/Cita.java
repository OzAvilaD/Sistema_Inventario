/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cita;

/**
 *
 * @author tracs
 */
public class Cita {
    String Nombre;
    String Fecha;
    String Motivo;
    String Descripcion;

    public Cita(String Nombre, String Fecha, String Motivo, String Descripcion) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Motivo = Motivo;
        this.Descripcion = Descripcion;
    }

    public Cita() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
