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
public class Act6 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Crear un programa que dado un numero determine si es par o impar
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroIng;
        System.out.println("Ingrese un numero para saber si es par o no");
        numeroIng = lector.nextInt();
        if (numeroIng%2 == 0){
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("Su numero es IMPAR");
        }
                
    }
    
}
