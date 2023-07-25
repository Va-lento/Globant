/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ejercicio7;

import Entidades.Persona;
import Servicio.PersonaService;


/**
 *
 * @author Valentin
 */
public class Ejercicio7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Buenos dias! Vamos a iniciar una Persona!");
        PersonaService ps = new PersonaService();
        for (int i = 0; i < 4; i++) {
            Persona p1 = ps.crearPersona();
            Persona.calcularIMC(p1.getPeso(),p1.getAltura());
            Persona.calcularMayorEdad(p1.getEdad());
            
        }
        
    }
    
    
    
}
