/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4.formasgeometricas.Entities;

/**
 *
 * @author Valentin
 */
public class Circulo implements calcularFormas {

    double radio;
    

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        //double pi = 3.14;
        double area = pi * (radio * radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        //double pi = 3.14;
        double diametro = radio*2;
        double perimetro = pi * diametro;
        return perimetro;
    }
    
}
