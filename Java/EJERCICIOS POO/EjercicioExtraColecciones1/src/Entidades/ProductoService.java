/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ProductoService {
    
    
    public static Producto cargarProducto(){
        
        Scanner scan = new Scanner(System.in);
        Producto pro = new Producto();
        System.out.println("Ingrese el nombre del prodcuto");
        pro.setNombre(scan.nextLine());
        System.out.println("Ingrese la categoria a la que pertenece");
        pro.setCategoria(scan.nextLine());
        System.out.println("Ingrese el precio del producto");
        pro.setPrecio(scan.nextDouble());
        System.out.println("Ingrese la cantidad que hay en el inventario");
        pro.setCantidad(scan.nextInt());
        scan.nextLine();
        System.out.println("Producto Cargado con exito!!");
        
        return pro;
    }
    public void eliminarProduc(String prodE, ArrayList prods){
        for (int i = 0; i < prods.size(); i++) {
            Producto m = (Producto) prods.get(i);
            if (m.getNombre().equalsIgnoreCase(prodE)){
                prods.remove(i);
            }
        }
    }
    
    public void venta(int p, ArrayList<Producto> prods, int cant){
        // Producto m = (Producto) prods.get(p-1);
        if (prods.get(p-1).getCantidad() >= cant){
           int n = (prods.get(p-1).getCantidad() - cant);
           prods.get(p-1).setCantidad(n);
            
            System.out.println("Venta exitosa!");

        } else {
            System.out.println("Stock insuficiente, stock actual: "+prods.get(p-1).getCantidad());
        }
        // (prods.get(p-1).getCantidad() < cant)
                
    }
    
}
