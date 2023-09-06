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
public class Cine {
    
    private Pelicula peliculaEnPantalla;
    
    private int espectadores;
    private int entrada;

    public Cine(Pelicula peliculaEnPantalla, int espectadores, int entrada) {
        this.peliculaEnPantalla = peliculaEnPantalla;
        this.espectadores = espectadores;
        this.entrada = entrada;
    }

    public Cine() {
    }

    public Pelicula getPeliculaEnPantalla() {
        return peliculaEnPantalla;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setPeliculaEnPantalla(Pelicula peliculaEnPantalla) {
        this.peliculaEnPantalla = peliculaEnPantalla;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    
    
    
}
