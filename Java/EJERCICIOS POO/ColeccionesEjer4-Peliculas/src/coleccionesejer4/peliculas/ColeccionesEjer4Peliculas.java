/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer4.peliculas;

import Entidades.PeliculaService;

/**
 *
 * @author Valentin
 */
public class ColeccionesEjer4Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peSer = new PeliculaService();
        
        peSer.cargarPelis();
        System.out.println("------------------------");
        peSer.mostrarPelis();
        System.out.println("------------------------");
        peSer.mostrarPmas1Hora();
        System.out.println("------------------------");
        peSer.ordenarPelisXtitulo();
        System.out.println("------------------------");
        peSer.ordenarPelisXduracion();
    }
    
}
