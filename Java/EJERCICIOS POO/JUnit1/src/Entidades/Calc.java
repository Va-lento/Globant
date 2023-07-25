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
public class Calc {
    private double valor;
    private double desc;

    public Calc(double valor, double desc) {
        this.valor = valor;
        this.desc = desc;
    }

    public Calc() {
    }

    public double getValor() {
        return valor;
    }

    public double getDesc() {
        return desc;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }
    
    public int precioConDesc(int valor, int desc){
        int resultado = (valor*(desc/100));
        return resultado;
    }

    double precioConDesc(double valor, double desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double precioConDesc(double valor, double desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
