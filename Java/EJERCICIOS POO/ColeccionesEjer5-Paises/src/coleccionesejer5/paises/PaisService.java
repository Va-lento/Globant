/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer5.paises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Valentin
 */
public class PaisService {
    
    Scanner scan = new Scanner(System.in);
    HashSet<Pais> paises = new HashSet<>();
    
    public void cargarPaises(){
        
        boolean continuar = true;
        
        while(continuar){
            Pais p = new Pais();
            System.out.println("INGRESE UN PAIS");
            p.setNombre(scan.nextLine());
            paises.add(p);
            System.out.println("-------------------");
            System.out.println("DESEA CONTINUAR? S/N");
            String resp = scan.nextLine();
            continuar=(resp.equalsIgnoreCase("S"));
        }
    }
    
    public void mostrarPaises(){
        for (Pais x : paises) {
            System.out.println(x.getNombre());
        }
    }
    
    public void mostrarPaisesOrdenados(){
        TreeSet<Pais> paisesOrdenados = new TreeSet<>(paises);
        for (Pais x : paisesOrdenados) {
            System.out.println(x.getNombre());
            
        }
        
    }
    
    
}
