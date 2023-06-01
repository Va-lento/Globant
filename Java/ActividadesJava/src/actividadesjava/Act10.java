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
public class Act10 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int limite, suma, numIng;
        System.out.println("Ingrese el valor que determine el limite de la suma");
        limite = lector.nextInt();
        suma = 0;
        do {            
            System.out.println("Ingrese un valor para sumar: ");
            numIng = lector.nextInt();
            suma = suma + numIng;
            if (suma>limite){
                suma = suma - numIng;
                System.out.println("Ese numero excede la suma, le conviene ingresar: "+ (limite-suma)+" o menos");
            }
        } while (suma<limite);
        System.out.println("Limite cumplido!");
    }
    
    
}
