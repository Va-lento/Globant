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
public class Persona {
   
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Calculo el peso ideal de la persona
    public static void calcularIMC(double peso, double altura){
        double pesoIdeal = (peso/(altura*altura));
        int retorno = 0;
        if (pesoIdeal<20){
            System.out.println("La persona se encuentra debajo de su peso ideal");
            retorno = -1;
            
        } if ((pesoIdeal>=20) || (pesoIdeal<=25)){
            System.out.println("La persona se encuentra dentro de su peso ideal");
            retorno = 0;
            
        } if (pesoIdeal>25){
            System.out.println("La persona se encuentra por encima de su peso ideal");
            retorno = 1;
            
        }   
        
    }
    
    //Calcular si es mayor de edad
    public static boolean calcularMayorEdad(int edad){
        boolean esMayor = false;
        if (edad>=18){
            esMayor = true;
        }
        if (esMayor){
            System.out.println("La persona es mayor de edad !!");
        } else{
            System.out.println("La persona es menor de edad");
        }
        return esMayor;
    }
}
