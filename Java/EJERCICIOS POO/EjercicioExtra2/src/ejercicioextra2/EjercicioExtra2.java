/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import Entidades.Pelicula;
import Servicio.AlquilerService;
import Servicio.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peliService = new PeliculaService();
        Scanner leer = new Scanner(System.in);
        AlquilerService alqService = new AlquilerService();
        
        System.out.println("Bienvenido al VideoClub!");
        System.out.println("Es hora de ingresar las peliculas disponibles!");
        Pelicula[] pelisCargadas = new Pelicula[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Cargando pelicula N°"+(i+1));
            pelisCargadas[i] = peliService.cargarPeli();
        }
        System.out.println("Se han cargado todas las peliculas!");
        byte opcion;
        int precioTotal = 0;
        do{
            System.out.println("Que pelicula quiere alquilar?");
            System.out.println("1."+pelisCargadas[0].getTitulo());
            System.out.println("2."+pelisCargadas[1].getTitulo());
            System.out.println("3."+pelisCargadas[2].getTitulo());
            System.out.println("4. SALIR");
            opcion = leer.nextByte();
            if ((opcion>0) && (opcion<4)){
            precioTotal += alqService.calcularPrecio(pelisCargadas[opcion-1]);
        }
        }while(opcion!=4);
        System.out.println("Su total es de: $"+precioTotal);
        
    }
    
}
