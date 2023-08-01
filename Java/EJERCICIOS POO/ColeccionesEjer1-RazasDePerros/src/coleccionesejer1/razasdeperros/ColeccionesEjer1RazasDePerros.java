/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer1.razasdeperros;

import java.util.ArrayList;
import java.util.Iterator;
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
        // definiciones globales
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int decision;
       
        // Agregar razas
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
        
        // Eliminar raza
        System.out.println("Desea eliminar una raza?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int elmRazaSN = scan.nextInt();
        scan.nextLine();   
        if (elmRazaSN == 1){
             int op2;
            do{
                System.out.println("Que raza quiere eliminar");
                String razaAeliminar = scan.nextLine();
                
                Iterator<String> it = razasPerros.iterator();
                
                while(it.hasNext()){
                    if(it.next().equalsIgnoreCase(razaAeliminar))
                        it.remove();
                    if(!it.next().equalsIgnoreCase(razaAeliminar))
                        System.out.println("Raza no encontrada");
                    break;
                }
                
                razasPerros.forEach((e)->System.out.println(e));
                System.out.println("¿Desea eliminar otra raza?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.println("");
                op2 = scan.nextInt();
                scan.nextLine();
                if (op2==2){
                    razasPerros.forEach((e)->System.out.println(e));
                }
            }while(op2==1);
        }
        
        
        
        
        
        
    }
    
}