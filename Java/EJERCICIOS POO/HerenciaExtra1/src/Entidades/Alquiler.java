/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class Alquiler {
    private String nombre;
    private int id;
    private Calendar fechaAlq;
    private Calendar fechaDelv;
    private int posAmarre;
    private Barco tipoBarco;

    public Alquiler(String nombre, int id, Calendar fechaAlq, Calendar fechaDelv, int posAmarre, Barco tipoBarco) {
        this.nombre = nombre;
        this.id = id;
        this.fechaAlq = fechaAlq;
        this.fechaDelv = fechaDelv;
        this.posAmarre = posAmarre;
        this.tipoBarco = tipoBarco;
    }

    public Alquiler() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaAlq(Calendar fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public void setFechaDelv(Calendar fechaDelv) {
        this.fechaDelv = fechaDelv;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public Calendar getFechaAlq() {
        return fechaAlq;
    }

    public Calendar getFechaDelv() {
        return fechaDelv;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }
    
    public void crearAlquiler(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        setNombre(scan.nextLine());
        System.out.println("Ingrese el id");
        setId(scan.nextInt());
        System.out.println("Ingrese la fecha de alquiler");
        setFechaAlq
    }
    
    
}
