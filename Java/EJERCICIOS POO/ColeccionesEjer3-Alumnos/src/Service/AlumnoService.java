/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class AlumnoService {
   
    public static Alumno crearAlumno(){
        //instancio y creo variables
        Alumno alum = new Alumno();
        Scanner scan = new Scanner(System.in);
        ArrayList notas = new ArrayList();
        
        // Cargo datos del alumno
        System.out.println("Cargando Alumno...");
        System.out.println("Por favor, ingrese el nombre del alumno: ");
        alum.setNombre(scan.nextLine());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la  nota N°"+(i+1)+ " de " + alum.getNombre());
            notas.add(scan.nextInt()); 
        }
        alum.setNotasAlumnos(notas);
       
        return alum;
        
    }
    public static int calcNotaFinal(ArrayList notas){
        int notaF;
        notaF =(((int) notas.get(0) +(int) notas.get(1) + (int) notas.get(2))/3);
        return notaF;
    }
    
}
