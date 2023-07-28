/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ejercicioextracolecciones1;

import Entidades.Producto;
import Entidades.ProductoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class EjercicioExtraColecciones1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        ProductoService proSer = new ProductoService();
        int op = 0;
        Iterator<Producto> it = productos.iterator();
        Tienda tienda1 = new Tienda();
        
        for (int i = 0; i < 1; i++) {
            productos.add(proSer.cargarProducto());
        }
        do{
            System.out.println("----------------------");
            System.out.println("TIENDA DE PRODUCTOS");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Visualizar Stock");
            System.out.println("4. Modificar un producto");
            System.out.println("5. Venta");
            System.out.println("6. Reponer");
            System.out.println("7. Salir");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                case 1:
                    productos.add(proSer.cargarProducto());
                    break;
                case 2:
                    System.out.println("¿Que producto desea eliminar?");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i+1)+ ". " +productos.get(i).getNombre());
                    }
                    String prodEliminar = scan.nextLine();
                    proSer.eliminarProduc(prodEliminar, productos);
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i+1)+ ". " +productos.get(i).getNombre());
                    }
                    break;
                case 3:
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i+1)+ ". " +productos.get(i).getNombre());
                    }
                    break;
                case 4:
                    System.out.println("¿Que producto desea modificar?");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i+1)+ ". " +productos.get(i).getNombre());
                    }
                    int prodModificar = scan.nextInt();
                    scan.nextLine();
                    productos.set((prodModificar-1), proSer.cargarProducto());
                    break;
                case 5:
                    System.out.println("¿Que producto desea comprar?");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i+1)+ ". " +productos.get(i).getNombre());
                    }
                    int prodVenta = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Cuant@ desea comprar?");
                    int cantidadVenta = scan.nextInt();
                    scan.nextLine();
                    proSer.venta(prodVenta, productos, cantidadVenta);
                        
                    break;
            }
        } while(op!=7);
        
        
        
        
        /*
        if (prodEliminar >= 0 && prodEliminar < productos.size()) {
        productos.remove(indiceAEliminar);
        
        // Imprimir el ArrayList después de eliminar
        
        System.out.println(productos.get(i).getNombre());
        } else {
        System.out.println("Índice inválido. No se eliminó ningún elemento.");
        }
        */
        
    }
    
}
