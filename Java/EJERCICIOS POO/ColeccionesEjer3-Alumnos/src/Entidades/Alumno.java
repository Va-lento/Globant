/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Valentin
 */
public class Alumno {
   
    // ArrayList<String> razasPerros = new ArrayList<>();
    private String nombre;
    private ArrayList notasAlumnos;
    
    // Cons
    public Alumno(String nombre, ArrayList notasAlumnos) {
        this.nombre = nombre;
        this.notasAlumnos = notasAlumnos;
    }

    public Alumno() {
    }

    //Getters & Setters
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList getNotasAlumnos() {
        return notasAlumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotasAlumnos(ArrayList notasAlumnos) {
        this.notasAlumnos = notasAlumnos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notasAlumnos=" + notasAlumnos + '}';
    }
    
}

