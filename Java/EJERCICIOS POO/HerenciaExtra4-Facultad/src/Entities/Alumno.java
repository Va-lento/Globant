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
public class Alumno extends Persona {
    
    protected String curso;

    public Alumno(String curso) {
        this.curso = curso;
    }

    public Alumno(String curso, String nombre, String apellido, int id, boolean estCivil) {
        super(nombre, apellido, id, estCivil);
        this.curso = curso;
    }

    public Alumno() {
    }

    public String getCurso() {
        return curso;
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

    public void setCurso(String curso) {
        this.curso = curso;
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
