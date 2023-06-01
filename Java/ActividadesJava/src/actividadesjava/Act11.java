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
public class Act11 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:
    ...........................................
    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
    ...........................................
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
    seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
    del programa, caso contrario se vuelve a mostrar el menú.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, resultado, resp;
        resultado = 0;
        System.out.println("Ingrese dos numeros!");
        System.out.println("1er numero");
        num1 = lector.nextInt();
        System.out.println("2do numero");
        num2 = lector.nextInt();
        System.out.println("Muy bien, ahora elija que quiere hacer con esos dos valores!");
        System.out.println("...........................................");
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("...........................................");
        System.out.println("Elija un opcion");
        resp = lector.nextInt();
        do {  
            System.out.println("Elija un opcion");
            resp = lector.nextInt();
            switch (resp) {
                case 1:
                    resultado = num1+num2;
                    break;
                case 2:
                    resultado = num1-num2;
                    break;
                case 3:
                    resultado = num1*num2;
                    break;
                case 4:
                    resultado = num1/num2;
                    break;
                case 5:
                    System.out.println("Esta seguro?");
                    System.out.println("1. Si  //  2. No");
                    resp = lector.nextInt();
                    if (resp==1){
                        resp=5;
                        break;
                         
                    } else {
                        break;
                    }
                default:
                    System.out.println("OPCION INVALIDA");;
            }
      
        } while (resp!=5);
        System.out.println("Su resultado es de: "+ resultado);
    }
    
}
