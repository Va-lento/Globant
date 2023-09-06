/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlextra2.cine.Entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class PeliculaService {
    ArrayList<Pelicula> catalogoPeliculas = new ArrayList<>();
    
    public void cargarPeliculas(){
       
       Scanner scan = new Scanner(System.in);
       
        for (int i = 0; i < 3; i++) {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(scan.nextLine());
            System.out.println("Ingrese el director");
            p.setDirector(scan.nextLine());
            System.out.println("Ingrese la edad minima");
            p.setEdadMin(scan.nextInt());
            scan.nextLine();
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(scan.nextInt());
            scan.nextLine();
            System.out.println("-------------");
            catalogoPeliculas.add(p);
        }
       
    }
    public void mostrarCatalogo(){
        for (Pelicula x : catalogoPeliculas) {
            System.out.println(x.getTitulo());
        }
    }
    
    
    
}
