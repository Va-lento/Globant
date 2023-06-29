/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Valentin
 */
public class User {
    String nombre;
    String dni;
    String apellido;
    
    
   public User(String nombre, String dni, String apellido){
       this.nombre = nombre;
       this.dni = dni;
       this.apellido = apellido;
   }
}
