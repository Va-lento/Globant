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
public class Velero extends Barco{
    
    protected int nMastiles;

    public int getnMastiles() {
        return nMastiles;
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

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
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

    public Velero(int nMastiles, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nMastiles = nMastiles;
    }

    public Velero(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    public Velero() {
    }

    @Override
    public double calcModulo() {
        double modulo = (eslora * 10)+nMastiles;
        return modulo;
    }

   
    
    
}
