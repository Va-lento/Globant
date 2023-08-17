/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class Baraja {
    private List<Carta> cartas = new ArrayList<>();
    private List<Carta> cartasFuera = new ArrayList<>();
    

    public Baraja() {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (String palo : palos) {
            for (int i = 0; i <12; i++) {
                if ((i != 8) && (i != 9)){
                    cartas.add(new Carta((i+1), palo));
                }
                
            }
        }
       
        }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void siguienteCarta(){
        Carta cart = new Carta();
        cart = cartas.get(0);
        
        
        if(cartas.isEmpty()){
            System.out.println("No hay mas cartas");
        } else{
            cartasFuera.add(cart);
            System.out.println(cart.toString());
        }
        
        cartas.remove(0);
        
    }
    
    public void cartasDisponibles(){
        System.out.println("**** " + cartas.size()+ " ****");
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas quiere repartir?");
        Scanner scan = new Scanner(System.in);
        int cart_repartir = scan.nextInt();
        if (cartas.size()<cart_repartir){
            System.out.println("No hay suficientes cartas");
        } else{
            for (int i = 0; i < cart_repartir; i++) {
                cartasFuera.add(cartas.get(0));
                cartas.remove(0); 
            }
        }
    }
    
    public void cartasMonton(){
        System.out.println("Despues, no pidas mucho");
        for (Carta carta : cartasFuera) {
            System.out.println(carta.toString());
            
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta.toString()); 
        }
    }
           
}
    
    
    
  

// Collections.shuffle(cartas); 
/* CHAT GPT
public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
*/

/* A pulmon :C
 for (int i = 0; i < 12; i++) {
            if ((i==8)||(i==9)){
                continue;
            }
            Carta carta1 = new Carta((i+1), "espada");
            Carta carta2 = new Carta((i+1), "copa");
            Carta carta3 = new Carta((i+1), "basto");
            Carta carta4 = new Carta((i+1), "oro");
            cartas.add(carta1);
            cartas.add(carta2);
            cartas.add(carta3);
            cartas.add(carta4);
*/