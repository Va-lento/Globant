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
public class Armadura {
    
    private String colorPrimario;
    private String colorSecundario;
    private int salud = 100;
    private float energiaTotal = 10000;
    
    private String material;
    private int dureza;
    
    private Bota botas;
    private Casco casco;
    private Guante guantes;
    
    public Armadura() {
        this.botas = new Bota();
        this.guantes = new Guante();
        this.casco = new Casco();
    }
    
    public Armadura(String colorPrimario, String colorSecundario, int energia, String material, int dureza, Bota botas, Guante guantes) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.dureza = dureza;
        this.botas = botas;
        this.guantes = guantes;
    }
    
    public String getColorPrimario() {
        return colorPrimario;
    }
    
    public String getColorSecundario() {
        return colorSecundario;
    }
    
    public int getSalud() {
        return salud;
    }
    
    public float getEnergia() {
        return energiaTotal;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public int getDureza() {
        return dureza;
    }
    
    public Bota getBotas() {
        return botas;
    }
    
    public Guante getGuantes() {
        return guantes;
    }
    
    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }
    
    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
    
    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    public void setEnergia(int energia) {
        this.energiaTotal = energia;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void setDureza(int dureza) {
        this.dureza = dureza;
    }
    
    public void setBotas(Bota botas) {
        this.botas = botas;
    }
    
    public void setGuantes(Guante guantes) {
        this.guantes = guantes;
    }
    
    
    public void crearArmadura(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("CARGANDO ARMADURA...");
        System.out.println("---------------------");
        System.out.println("Color primario: ");
        this.colorPrimario = scan.nextLine();
        System.out.println("Color secundario: ");
        this.colorSecundario = scan.nextLine();
        System.out.println("Color primario: "+this.colorPrimario);
        System.out.println("Color Secundario: "+this.colorSecundario);
        System.out.println("Que material sera la armadura: ");
        System.out.println("1. Diamante");
        System.out.println("2. Hierro");
        scan.nextLine();
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("ARMADURA TERMINADA");
        System.out.println("---------------------");
    }
    
    public void mostrarEstado(){
        System.out.println("------------------");
        System.out.println("Estado de la armadura: ");
        System.out.println("Energia "+((this.energiaTotal/10000)*100)+"%");
        System.out.println("Energia actual: "+this.energiaTotal);
        System.out.println("Salud "+this.salud+"%");
        System.out.println("------------------");
        System.out.println("Estado botas: ");
        System.out.println("energia de las botas: "+botas.getEnergia());
        System.out.println("Daño en las botas: "+botas.isDaniado());
        System.out.println("Botas Destruidas: "+botas.isDestruido());
        System.out.println("------------------");
        System.out.println("Estado guantes: ");
        System.out.println("energia de las guantes: "+guantes.getEnergia());
        System.out.println("Daño en las guantes: "+guantes.isDaniado());
        System.out.println("guantes Destruidas: "+guantes.isDestruido());
        System.out.println("------------------");
        this.energiaTotal = this.energiaTotal-10;
        casco.setEnergia(casco.getEnergia()-10);
    }
    
    public void caminar(){
        if(!botas.isDaniado()){
            System.out.println("* camina *");
            this.energiaTotal = this.energiaTotal-10;
            botas.setEnergia(botas.getEnergia()-10);
            System.out.println("SE CONSUMIERON 10 PUNTOS DE ENERGIA EN LAS BOTAS");
            botas.calcDanios();
            if(botas.isDaniado()){
                System.out.println("SE ROMPIERON LOS GUANTES!!!");
            } 
        }
    }
    public void correr(){
        if(!botas.isDaniado()){
            
            if(!botas.isDaniado()){
                System.out.println("* corre *");
                this.energiaTotal = this.energiaTotal-20;
                botas.setEnergia(botas.getEnergia()-20);
                System.out.println("SE CONSUMIERON 20 PUNTOS DE ENERGIA EN LAS BOTAS");
                botas.calcDanios();
                if(botas.isDaniado()){
                    System.out.println("SE ROMPIERON LOS GUANTES!!!");
                }
            }
        }
    }
    
    public void propulsarse(){
        if(!botas.isDaniado()){
            
            System.out.println("* se propulsa *");
            this.energiaTotal = this.energiaTotal-30;
            botas.setEnergia(botas.getEnergia()-30);
            System.out.println("SE CONSUMIERON 30 PUNTOS DE ENERGIA EN LAS BOTAS");
            botas.calcDanios();
            if(botas.isDaniado()){
                System.out.println("SE ROMPIERON LOS GUANTES!!!");
            }
        } 
    }
    public void volar(){
        if(!botas.isDaniado()){
        System.out.println("* vuela *");
        this.energiaTotal = this.energiaTotal-50;
        botas.setEnergia(botas.getEnergia()-30);
        guantes.setEnergia(guantes.getEnergia()-20);
        System.out.println("SE CONSUMIERON 20 PUNTOS DE ENERGIA EN LOS GUANTES");
        System.out.println("SE CONSUMIERON 30 PUNTOS DE ENERGIA EN LAS BOTAS");
        guantes.calcDanios();
        botas.calcDanios();
        if(guantes.isDaniado()){
            System.out.println("SE ROMPIERON LOS GUANTES!!!");
        }
        if(botas.isDaniado()){
            System.out.println("SE ROMPIERON LOS GUANTES!!!");
        }
        }
        
    }
    public void disparar(){
        System.out.println("* fichifium *");
        this.energiaTotal = this.energiaTotal-30;
        guantes.setEnergia(guantes.getEnergia()-30);
        System.out.println("SE CONSUMIERON 30 PUNTOS DE ENERGIA EN LOS GUANTES");
        guantes.calcDanios();
        if(guantes.isDaniado()){
            System.out.println("SE ROMPIERON LOS GUANTES!!!");
        }
    }
    
    
    
}
