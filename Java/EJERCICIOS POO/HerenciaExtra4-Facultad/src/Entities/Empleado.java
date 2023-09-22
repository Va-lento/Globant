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
public abstract class Empleado extends Persona {
    
    protected int anioIncorporacion;
    protected int nDespacho;

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getnDespacho() {
        return nDespacho;
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

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int nDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.nDespacho = nDespacho;
    }

    public Empleado(int anioIncorporacion, int nDespacho, String nombre, String apellido, int id, boolean estCivil) {
        super(nombre, apellido, id, estCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nDespacho = nDespacho;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public void setnDespacho(int nDespacho) {
        this.nDespacho = nDespacho;
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

    public void reasignarDespacho(){
        System.out.println("Se reasignara el despacho al sig. Despacho: ");
        Scanner scan = new Scanner(System.in);
        setnDespacho(scan.nextInt());
    }
    
    
    
}
