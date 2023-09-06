/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Valentin
 */
public class Yate extends Barco{
  
    protected int cv;
    protected int nCamarotes;

    public Yate(int cv, int nCamarotes, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
        this.nCamarotes = nCamarotes;
    }

    public Yate(int cv, int nCamarotes) {
        this.cv = cv;
        this.nCamarotes = nCamarotes;
    }

    public Yate() {
    }

    public int getCv() {
        return cv;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public double calcModulo() {
        double modulo = (eslora * 10) + cv + nCamarotes;
        return modulo;
    }
    
    
}
