/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer1.razasdeperros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ColeccionesEjer1RazasDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int decision = 0;
       
        do {
            System.out.println("Ingrese una raza de perro");
            String raza = scan.nextLine();
            razasPerros.add(raza);
            System.out.println("¿Desea agregar otra raza?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            decision = scan.nextInt();
            scan.nextLine();
            if (decision == 2){
                for (String aux : razasPerros) {
                    System.out.println(aux);
                }
            }
        }while(decision !=2);
        
        
        
        
        
        
        
    }
    
}
