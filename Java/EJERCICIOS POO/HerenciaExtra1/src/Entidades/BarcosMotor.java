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
public class BarcosMotor extends Barco {
    
    protected int cv;

    public BarcosMotor(int cv, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public BarcosMotor(int cv) {
        this.cv = cv;
    }

    public BarcosMotor() {
    }

    public void setCv(int cv) {
        this.cv = cv;
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

    public int getCv() {
        return cv;
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

    @Override
    public double calcModulo() {
        double modulo = (eslora * 10)+cv;
        return modulo;
    }
    
    
}
