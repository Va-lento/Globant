
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentino
 */
public class CondicionalesEncuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique del 1 al 5 estrellas!");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            
            switch (opinion){
                case 1: 
                    System.out.println("Tu puntuacion fue: 1");
                    break;
                case 2: 
                    System.out.println("Tu puntuacion fue: 2");
                    break;
                case 3: 
                    System.out.println("Tu puntuacion fue: 3");
                    break;
                case 4: 
                    System.out.println("Tu puntuacion fue: 4");
                    break;
                case 5:
                    System.out.println("Tu puntuacion fue: 5");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("Opinion negativa???");
            
        } else if (opinion == 0) {
            System.out.println("0??");
        } else{
            System.out.println("Se te fue de la mano compa");
        }
        System.out.println("Chau compa");
    }
    
}
