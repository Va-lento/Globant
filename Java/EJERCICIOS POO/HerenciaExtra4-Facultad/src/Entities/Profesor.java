/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Valentin
 */
public class Profesor extends Empleado{
    
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anioIncorporacion, int nDespacho) {
        super(anioIncorporacion, nDespacho);
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anioIncorporacion, int nDespacho, String nombre, String apellido, int id, boolean estCivil) {
        super(anioIncorporacion, nDespacho, nombre, apellido, id, estCivil);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public String getDepartamento() {
        return departamento;
    }

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
    
    
    
}
