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
public class Act16 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
    numero y si se encuentra repetido
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el largo del vector: ");
        int largoVector = lector.nextInt();
        
        int vector[] = new int [largoVector];
        for (int i = 0; i < vector.length; i++) {
            int numero = (int) (Math.random() * 10);
            vector[i] = numero;
        }
        int contador = 0;
        System.out.println("Que valor queres buscar??");
        int valorAbuscar = lector.nextInt();
        for (int i = 0; i < vector.length; i++) {
            
            if (valorAbuscar == vector[i]){
                contador++;
            }

        }
        System.out.println("Se encontraron "+ contador +" coincidencias");

    }
    
}
