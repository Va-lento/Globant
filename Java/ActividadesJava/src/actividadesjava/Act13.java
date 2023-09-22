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
public class Act13 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*". 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
    lo siguiente:
    
    ****
    *  *
    *  *
    ****
    
    */
    public static void main(String[] args) {
        System.out.print("Por favor ingrese el tamaño del cuadrado : ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (n >= 0 && n <= 50) {
            //Linea superior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            //centro de la forma
            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //Linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Error. La dimension del cuadrado debe ser como maximo de 50");
        }
    }
    
}
