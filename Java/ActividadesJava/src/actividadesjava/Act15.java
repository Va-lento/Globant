/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesjava;

/**
 *
 * @author Valentin
 */
public class Act15 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
    muestre por pantalla en orden descendente.
    */
    public static void main(String[] args) {
        int[] vectorLoco = new int[100];
        int j = 0;
        for (int i = 100; i > 0; i--) {
            vectorLoco[j] = i;
            j++;    
        }
        for (int i = 0; i < vectorLoco.length; i++) {
            System.out.println(vectorLoco[i]);  
        }
    }
    
}
