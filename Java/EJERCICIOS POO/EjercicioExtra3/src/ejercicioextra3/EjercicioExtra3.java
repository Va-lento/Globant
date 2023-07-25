/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;

import Entidades.Cliente;
import Servicios.ServicioCliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioCliente serviceCliente = new ServicioCliente();
        
        Scanner scanner = new Scanner(System.in);
        byte o=0;
        ArrayList clientes = new ArrayList();
        ArrayList rutinas = new ArrayList();
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Registrar un nuevo cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Actualizar Cliente");
            System.out.println("5. Crear Rutina");
            System.out.println("6. Mostrar Rutinas");
            System.out.println("7. Actualizar Rutinas");
            System.out.println("8. Eliminar Rutina");
            System.out.println("9. Salir");
            o = scanner.nextByte();
            switch (o){
                case 1:
                    clientes.add(serviceCliente.crearCliente());
                    break;
                case 2:
                    for(Object a:clientes){
                        System.out.println(a.Nombre);
                    }
                
            }
        } while(o != 9);
        
    }
}
        
  
