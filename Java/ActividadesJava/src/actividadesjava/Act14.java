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
public class Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       double euros, transformado;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros");
        euros = lector.nextFloat();
        lector.nextLine();
        System.out.println("Ingrese la moneda a la que quiere transformar");
        moneda = lector.nextLine();
        transformado = pasarEuroA(euros, moneda);
        System.out.println("El total es de: "+ transformado + " "+moneda);
        
    }
   public static double pasarEuroA(double euros, String moneda){
       double total;
       switch (moneda) {
           case "libra":
               total = euros * 0.86;
               return total;
           case "dolar":
               total = euros * 1.28;
               return total;
           case "yen":
               total = euros * 129.85;
               return total;
           default:
               throw new AssertionError();
       }
   }
}
