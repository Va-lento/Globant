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
public class PersonalServicio extends Empleado {
    
    protected String sectorAsignado;

    public PersonalServicio() {
    }

    public PersonalServicio(String sectorAsignado) {
        this.sectorAsignado = sectorAsignado;
    }

    public PersonalServicio(String sectorAsignado, int anioIncorporacion, int nDespacho) {
        super(anioIncorporacion, nDespacho);
        this.sectorAsignado = sectorAsignado;
    }

    public PersonalServicio(String sectorAsignado, int anioIncorporacion, int nDespacho, String nombre, String apellido, int id, boolean estCivil) {
        super(anioIncorporacion, nDespacho, nombre, apellido, id, estCivil);
        this.sectorAsignado = sectorAsignado;
    }

    public String getSectorAsignado() {
        return sectorAsignado;
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

    public void setSectorAsignado(String sectorAsignado) {
        this.sectorAsignado = sectorAsignado;
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
    
    
    
}
