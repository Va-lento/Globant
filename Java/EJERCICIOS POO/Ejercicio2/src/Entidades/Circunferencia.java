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
public class Circunferencia {
    private int radio;
    
    
    public Circunferencia(){
    
}
    public Circunferencia(int radio){
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public static double calcularArea(int radio){
        double area;
        area = (radio*radio) * 3.14;
        return area;
    }
    public static double calcularPerimetrio(int radio){
        double perimetro;
        perimetro = 2*3.14*radio;
        return perimetro;
    }
}

