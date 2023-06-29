/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia circulo = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia: ");
        circulo.setRadio(leer.nextInt());
        System.out.println("El area es: " + circulo.calcularArea(circulo.getRadio()));
        System.out.println("El perimetro es: " + circulo.calcularPerimetrio(circulo.getRadio()));
    }
    
}
