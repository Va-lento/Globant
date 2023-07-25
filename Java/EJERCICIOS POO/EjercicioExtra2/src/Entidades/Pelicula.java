/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Entidades;

/**
 *
 * @author Valentin
 */
public class Pelicula {
    private String titulo;
    private int duracion;
    private int anioPeli;
// Constructores
    public Pelicula(String titulo, int duracion, int anioPeli) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anioPeli = anioPeli;
    }
    
    public Pelicula(){
        
    }
//Getters and Setters
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public int getAnioPeli() {
        return anioPeli;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void setAnioPeli(int anioPeli) {
        this.anioPeli = anioPeli;
    }
    
}

