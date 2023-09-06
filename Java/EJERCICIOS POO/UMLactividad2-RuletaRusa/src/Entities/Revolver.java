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
public class Revolver {
    private int posActual;
    private int posBala; 
    private boolean cargado = false;

    public int getPosActual() {
        return posActual;
    }

    public int getPosBala() {
        return posBala;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    public boolean isCargado() {
        return cargado;
    }

    public Revolver() {
        posActual = 0;
    }

    public Revolver(int posActual, int posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }
    
    public void cargarRevolver(){
        Random random = new Random();
        posBala = random.nextInt(6);
        setCargado(true); 
    }
    
    public void disparar(){
        if(posActual == posBala){
            System.out.println("BAM! moriste");
        }if(posActual>6){
            System.out.println("Recargue para la siguiente ronda");
        } 
        if(posActual!=posBala){
            setPosActual(posActual+1);
            System.out.println("TIC, no salio la bala");
            
        }
    }
    
    public void verRevolver(){
        System.out.println("Posicion de la bala: "+(posBala+1));
        System.out.println("Posicion Actual: "+ (posActual+1));
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posBala=" + posBala + ", cargado=" + cargado + '}';
    }
    
        
    
}
