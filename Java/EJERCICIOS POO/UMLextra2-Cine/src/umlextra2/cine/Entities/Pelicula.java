/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlextra2.cine.Entities;

/**
 *
 * @author Valentin
 */
public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
