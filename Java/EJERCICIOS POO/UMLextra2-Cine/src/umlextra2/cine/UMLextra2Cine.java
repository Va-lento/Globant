/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlextra2.cine;

import java.util.Scanner;
import umlextra2.cine.Entities.CineService;
import umlextra2.cine.Entities.PeliculaService;

/**
 *
 * @author Valentin
 */
public class UMLextra2Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PeliculaService pS = new PeliculaService();
        CineService cS = new CineService();
        
        
        System.out.println("Cargando Peliculas...");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        pS.cargarPeliculas();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Catalogo:");
        pS.mostrarCatalogo();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Que pelicula desea ver?");
        scan.nextLine();
        
        
        
    }
    
}
