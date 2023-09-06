/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;

import Entidades.BarcosMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class HerenciaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int nMastiles, int matricula, double eslora, int anioFabricacion
        Velero velero = new Velero(5, 1, 10.0, 2003);
        // int cv, int matricula, double eslora, int anioFabricacion)
        BarcosMotor bMotor = new BarcosMotor(10, 10, 20.0, 2003);
        // (int cv, int nCamarotes, int matricula, double eslora, int anioFabricacion)
        Yate yate = new Yate(15, 200, 10, 30.0, 2003);
        
        System.out.println("VELERO");
        System.out.println(velero.calcModulo());
        
        System.out.println("-------------------");
        System.out.println("Barco a Motor");
         System.out.println(bMotor.calcModulo());
        System.out.println("-------------------");
        System.out.println("YATE");
         System.out.println(yate.calcModulo());
        System.out.println("-------------------");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Que barco desea alquilar?");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate");
        int opt = scan.nextInt();
        scan.nextLine();
        int dias = 0;
        switch (opt) {
            case 1:
                System.out.println("Cuantos dias desea alquilar el velero");
                dias = scan.nextInt();
                System.out.println("El precio del alquiler es de: "+ (velero.calcModulo()*dias));
                
                break;
            case 2:
                System.out.println("Cuantos dias desea alquilar el Barco a motor");
                dias = scan.nextInt();
                System.out.println("El precio del alquiler es de: "+ (bMotor.calcModulo()*dias));
                break;
            case 3:
                System.out.println("Cuantos dias desea alquilar el yate");
                dias = scan.nextInt();
                System.out.println("El precio del alquiler es de: "+ (yate.calcModulo()*dias));
                break;
                  }
    }
    
}
