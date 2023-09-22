/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Random;

/**
 *
 * @author Valentin
 */
public class Parte {
    
    protected int energia = 3333;
    protected boolean daniado = false;
    protected boolean destruido = false;

    public Parte() {
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
    
    /**
     *
     */
    public void calcDanios(){
    Random ran = new Random();
    double random = ran.nextDouble();
    double prob = 0.3;
    if(random<=prob){
        setDaniado(true);
    }
}
    
}
