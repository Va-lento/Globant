/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class PeliculaService {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Pelicula cargarPeli(){
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        p.setTitulo(leer.nextLine());
        System.out.println("Ingrese el año en el que se estreno la pelicula");
        p.setAnioPeli(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la duracion de la pelicula (mins)");
        p.setDuracion(leer.nextInt());
        leer.nextLine(); 
        return p;
        
    }
}
