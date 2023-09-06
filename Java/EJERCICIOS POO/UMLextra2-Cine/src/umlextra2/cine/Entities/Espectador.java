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
public class Espectador {
    private String nombre;
    private int edad;
    private int plata;
    private String asiento;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int plata, String asiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.plata = plata;
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPlata() {
        return plata;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
    
            
}
