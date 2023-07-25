/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;

/**
 *
 * @author Valentin
 */
public class AlquilerService {
    public static int calcularPrecio(Pelicula p){
       int precio = (int)(0.50* p.getDuracion());
        System.out.println("El precio de "+p.getTitulo()+" es de: $"+precio);
        return precio;
    }
}
