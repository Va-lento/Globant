/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones;

import Ejercicio1.ArrayPunto1;
import Ejercicio2.DivisionNumero;
import Ejercicio8.Dos;
import Ejercicio8.Tres;
import Ejercicio8.Uno;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ManejoDeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Ejercicio 2 //
//        try{
//            ArrayPunto1 array = new ArrayPunto1();
//            
//        }catch(Exception e){
//            System.out.println("Error! Indice fuera de rango");
//        }

        // Ejercicio 3 //
        
//        try{
//            DivisionNumero divNum = new DivisionNumero();
//            System.out.println("Ingrese el 1er numero");
//            divNum.setNum1(Integer.parseInt(scan.next()));
//            System.out.println("Ingrese el 2do numero");
//            divNum.setNum2(Integer.parseInt(scan.next()));
//            divNum.dividir(); 
//        }catch(Exception e){
//            System.out.println("ERROR! No se puede dividir por 0");
//        }

        // Ejercicio 5 //
        
//        int numAleatorio = (int) (Math.random()*10);
//        System.out.println(numAleatorio);
//        int numUser=0;
//        int intentos=0;
//        while(true){
//            try{
//                System.out.println("Ingrese un numero del 1 al 10");
//                numUser=scan.nextInt();
//                if(numUser!=numAleatorio){
//                    System.out.println("Intente otro");
//                    intentos++;
//                }if((numUser>10) || (numUser<0)){
//                    System.out.println("Numero fuera del rango");
//                    intentos++;
//                }if(numUser==numAleatorio){
//                    System.out.println("Ganaste!!!");
//                    System.out.println("INTENTOS TOTALES: "+intentos);
//                    break;
//                }
//            }catch(Exception e){
//                System.out.println("ERROR, EL VALOR INGRESADO NO ES UN NUMERO!!");
//                intentos++;
//                System.out.println("INTENTOS TOTALES: "+intentos);
//               break;
//            }
//        }
        
        // Ejercicio 8 //
//        //clase 1//
//        Uno uno = new Uno();
//            try {
//                System.out.println (uno.metodo()) ;
//            }catch(Exception e) {
//                System.err.println("Excepcion en metodo() ") ;
//                e.printStackTrace();
//            }
//            
//    
//       // clase 2 //
//       Dos dos = new Dos();
//       try{
//           System.out.println ( dos.metodo ( ) ) ;
//       } catch(Exception e) {
//           System.err.println ( " AExcepcion en metodo ( ) " ) ;
//           e.printStackTrace();
//       }
       
       // clase 3 //
//       Tres tres = new Tres();
//       try{
//           System.out.println( tres.metodo ( ) ) ;
//       } catch(Exception e) {
//           System.err.println("AAExcepcion en metodo ( ) " ) ;
//           e.printStackTrace();
//       }

}
}
