/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4.formasgeometricas;

import herencia4.formasgeometricas.Entities.Circulo;
import herencia4.formasgeometricas.Entities.Rectangulo;

/**
 *
 * @author Valentin
 */
public class Herencia4FormasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circula = new Circulo(4);
        Rectangulo rectangulo = new Rectangulo(2, 6);
        System.out.println("CIRCULO");
        System.out.println(circula.calcularArea());
        System.out.println(circula.calcularPerimetro());
        System.out.println("-----------------");
        System.out.println("RECTANGULO");
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

    }
    
}
