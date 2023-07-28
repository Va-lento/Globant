
import Entidades.Producto;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentin
 */
public class Tienda {

    public Tienda() {
    }
    
    
    public void venta(int p, ArrayList prods, int cant){
            Producto m = (Producto) prods.get(p-1);
            if (m.getCantidad() > cant){
                m.setCantidad((m.getCantidad()- cant));
                System.out.println("Venta exitosa!");
            } if (m.getCantidad() < cant){
                System.out.println("Stock insuficiente, stock actual: "+m.getCantidad());
            }
   
    }
}
