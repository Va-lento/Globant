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
public class Act12 {

    /**
     * @param args the command line arguments
     */
    /*
    Consigna
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&" marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena;
     
        int contador;
        contador = 0;
        System.out.println("Bienvenido al dispositivo RS232");
          System.out.println("Por favor ingrese una cadena valida, recuerde que debe comenzar con X y terminar con O");
        System.out.println();
        System.out.println("Si desea salir ingrese '&&&&&' ");
        do {            
        cadena = lector.nextLine();
        if ((cadena.length()== 5) && (cadena.substring(0, 1).equalsIgnoreCase("X") && (cadena.substring(4,5).equalsIgnoreCase("O")))){
            contador = contador +1;
            System.out.println("Valor valido! Ingrese otro");
            System.out.println(cadena.charAt(4));
        } else if("&&&&&".equals(cadena)){
            break;
        } 
        else {
            System.out.println("Valor invalido, ingrese otro");
        }
        } while (!"&&&&&".equals(cadena));
        System.out.println("El total de ingresos correctos fue de "+ contador + " cadenas validas");
        
    }
    
}
