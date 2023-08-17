/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlactividad;

import Entities.Baraja;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class UMLactividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        int opt = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente Carta");
            System.out.println("3. Total Cartas");
            System.out.println("4. Dar Cartas");
            System.out.println("5. Cartas Monton");
            System.out.println("6. Mostrar Baraja");
            System.out.println("7. Salir");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    baraja.darCartas();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
            }
        }while(opt!=7);
                
        
        
        
    }
    
}
