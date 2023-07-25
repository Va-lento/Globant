/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class PersonaService {
    public static Persona crearPersona(){
        // Instancio el objeto
        Persona random = new Persona();
        Scanner leer = new Scanner(System.in);
        
        // Relleno los atributos
        System.out.println("Ingrese el nombre");
        random.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        random.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo -> M/F/O");
        String sexo = leer.next().toUpperCase();
        while ((!sexo.equals("M"))&&(!sexo.equals("F"))&&(!sexo.equals("O"))){
            System.out.println("Ingrese un valor valido");
            sexo = leer.next().toUpperCase();
        }
        random.setSexo(sexo);
        System.out.println("Ingrese la altura (metros)");
        random.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso (kg)");
        random.setPeso(leer.nextDouble());
        System.out.println("Gracias! Se completo la planilla de "+ random.getNombre());
        return random;
    }
}
