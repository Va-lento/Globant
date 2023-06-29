/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class EjerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro elHilustrado = new Libro("9780062079978", "El Hombre Ilustrado", "Ray Bradbury", 256);
        System.out.println(elHilustrado);
        Libro libro1 = new Libro();
        libro1.setTitulo(leer.nextLine());
        System.out.println(libro1.getTitulo());
        
    }
    
}
