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
public class Act9 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
    que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
    investigar la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        char primerLetra;
        frase = lector.nextLine();
        primerLetra = frase.toUpperCase().charAt(0);
        if (primerLetra == 'A'){
            System.out.println("CORRECTO");
        } else{ 
            System.out.println("INCORRECTO");
        }
        System.out.println(frase.charAt(0));
    }
    
}
