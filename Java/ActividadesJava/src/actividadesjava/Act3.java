/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesjava;

import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
        System.out.println("Ingrese una frase");
       frase = leer.nextLine();
       frase = frase.toUpperCase();
        System.out.println("En mayusculas: "+frase);
       frase = frase.toLowerCase();
        System.out.println("En minusculas: "+frase);
          
    }
    
}
