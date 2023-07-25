/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Rutina;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ServicioCliente {
    public static Cliente crearCliente(){
        Cliente c = new Cliente();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos a registrar al nuevo cliente!!");
        System.out.println("Ingrese el id");
        c.setId(scan.nextInt());
        scan.next();
        System.out.println("Ingrese su nombre");
        c.setNombre(scan.next());
        System.out.println("Ingrese su edad");
        c.setEdad(scan.nextInt());
        System.out.println("Ingrese su peso");
        c.setPeso(scan.nextInt());
        System.out.println("Ingrese su altura");
        c.setAltura(scan.nextInt());
        scan.next();
        System.out.println("Ingrese su objetivo");
        c.setObjetivo(scan.next());
 
        return c;
    }
}
