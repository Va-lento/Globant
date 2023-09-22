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
public class Act7 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Crear un programa que pida una frase y si esa frase es igual a “eureka" el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
    Nota: investigar la función equals() en Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        if ("eureka".equals(frase.toLowerCase())){
            System.out.println("Adivinaste!");
        } else{
            System.out.println("Fallaste!");
        }
                
        
    }
    
}
