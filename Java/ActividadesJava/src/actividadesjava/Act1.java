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
public class Act1 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna:
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
    El programa deberá después mostrar el resultado de la suma
    */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma de los numeros es: " + (num1+num2));
    }
    
}
