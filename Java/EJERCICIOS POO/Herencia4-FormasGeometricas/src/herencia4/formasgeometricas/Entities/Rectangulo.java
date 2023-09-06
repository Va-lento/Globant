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
public class Rectangulo implements calcularFormas {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }
    

    @Override
    public double calcularPerimetro() {
        double perimetro = (base+altura)*2;
        return perimetro; 
    }
        
    
}
