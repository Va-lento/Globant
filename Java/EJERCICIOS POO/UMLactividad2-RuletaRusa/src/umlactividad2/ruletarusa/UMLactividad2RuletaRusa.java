/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlactividad2.ruletarusa;

import Entities.Revolver;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class UMLactividad2RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Revolver revolver = new Revolver();
        Scanner scan = new Scanner(System.in);
        int opt = 0;
        do{
            System.out.println("MENU");
            System.out.println("-------------");
            System.out.println("1. Cargar revolver");
            System.out.println("2. DISPARAR");
            System.out.println("3. Ver Revolver");
            System.out.println("4. Salir");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    revolver.cargarRevolver();
                    break;
                case 2:
                    revolver.disparar();
                    break;
                case 3:
                    revolver.verRevolver();
                    break;
                    
            }
        } while(opt!=4);
        
        
        
    }
    
}
