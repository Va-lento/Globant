    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Valentin
 */
public class Jugador {
    private int id;
    private boolean muerto = false;

    public void setId(int id) {
        this.id = id;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public int getId() {
        return id;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
    }
    
    
        
}
