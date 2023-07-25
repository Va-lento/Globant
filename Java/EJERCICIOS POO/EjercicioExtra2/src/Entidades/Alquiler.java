/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Valentin
 */
public class Alquiler {
    
    private String peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaDevolucion;
    
    // Constructores
    public Alquiler(){
        
    }

    public Alquiler(String peliculaAlquilada, Date fechaInicio, Date fechaDevolucion) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    // Getters & Setters

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
