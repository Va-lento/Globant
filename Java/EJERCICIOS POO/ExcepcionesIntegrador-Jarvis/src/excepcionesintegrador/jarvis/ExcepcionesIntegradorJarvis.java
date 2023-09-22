/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package excepcionesintegrador.jarvis;

import Entities.Armadura;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ExcepcionesIntegradorJarvis {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura armadura = new Armadura();
        armadura.crearArmadura();
        Scanner scan = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("------------------");
            System.out.println("¿Que desea hacer Sr. Stark?");
            System.out.println("------------------");
            System.out.println("1. Verificar el estado de la armadura");
            System.out.println("2. Caminar");
            System.out.println("3. Correr");
            System.out.println("4. Propulsarse");
            System.out.println("5. Volar");
            System.out.println("6. Disparar");
            System.out.println("7. ");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    armadura.mostrarEstado();
                    break;
                case 2:
                    armadura.caminar();
                    break;
                case 3:
                    armadura.correr();
                    break;
                case 4:
                    armadura.propulsarse();
                    break;
                case 5:
                    armadura.volar();
                    break;
                case 6:
                    armadura.disparar();
                    break;
                case 7:
                    
                    break;
            }
            
        } while (opt!=10);
        
        
        
        
        
        
        
    }
    
}
