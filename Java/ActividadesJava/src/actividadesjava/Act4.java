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
public class Act4 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       
        float tempC;
        float tempF;
       
        System.out.println("Ingrese la temperatura en grados Celsius");
        
        tempC = leer.nextFloat();
        tempF = 32 + (9*tempC/5);
        
        System.out.println(tempC+"°C equivalen a " + tempF + "°F");
                
    }
    
}
