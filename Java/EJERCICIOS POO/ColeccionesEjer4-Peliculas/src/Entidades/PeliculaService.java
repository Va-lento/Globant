/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class PeliculaService {
    
    ArrayList<Pelicula> pelis = new ArrayList<>();
    
    
    public void cargarPelis(){
        Scanner scan = new Scanner(System.in);
        boolean x = true;
       
        while(x){
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(scan.nextLine());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(scan.nextLine());
            System.out.println("Ingrese la duracion");
            p.setDuracion(scan.nextDouble());
            scan.nextLine();
            System.out.println("----------------");
            System.out.println("Desea agregar otra pelicula? S/N");
            String b = scan.nextLine();
            x = b.equalsIgnoreCase("S");
            pelis.add(p);
            
        }  
    }
    
    public void mostrarPelis(){
        pelis.forEach((e)->System.out.println(e.toString()));
    }
    
    public void mostrarPmas1Hora(){
        for (int i = 0; i < pelis.size(); i++) {
            if(pelis.get(i).getDuracion()>1){
                System.out.println(pelis.get(i).getTitulo());  
            }
        }
    }
      public void ordenarPelisXtitulo(){
      Collections.sort(pelis, ComparatorPelis.ordernarPorTitulo);
      pelis.forEach((e)->System.out.println(e.toString()));
    }
    public void ordenarPelisXduracion(){
        Collections.sort(pelis, ComparatorPelis.ordernarPorDuracion);
      pelis.forEach((e)->System.out.println(e.toString()));
    }
     
    
    
}
