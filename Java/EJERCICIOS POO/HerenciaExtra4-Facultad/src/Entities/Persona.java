/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public  class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int id;
    protected boolean estCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, boolean estCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estCivil = estCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public boolean isEstCivil() {
        return estCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstCivil(boolean estCivil) {
        this.estCivil = estCivil;
    }
    
    public void cambioEstCivil(){
        System.out.println("Se cambia el estado civil de la persona a: ");
        System.out.println("1. Soltero");
        System.out.println("2. Casado");
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        if (opt==1){
            setEstCivil(false);
        }if (opt == 2){
            setEstCivil(true);
        }else{
            System.out.println("error, reintentar UwU");
        }
    }
    
}
