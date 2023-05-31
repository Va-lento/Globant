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
public class Act5 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
    Math.sqrt()
    */
    public static void main(String[] args) {
        int numeroIng;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        numeroIng = lector.nextInt();
        System.out.println("El doble del numero es: "+ (numeroIng*2));
        System.out.println("El triple del numero es: "+ (numeroIng*3));
        System.out.println("Su raiz cuadrada es: "+ Math.sqrt(numeroIng));
        
    }
    
}
