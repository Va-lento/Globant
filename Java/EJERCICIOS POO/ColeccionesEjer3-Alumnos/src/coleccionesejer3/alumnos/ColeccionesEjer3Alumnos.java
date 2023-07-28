/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer3.alumnos;

import Entidades.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class ColeccionesEjer3Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        AlumnoService AlumSer = new AlumnoService();
        // NADA --- Iterator<Alumno> it = listaAlumnos.iterator();
        
        System.out.println("¿Cuantos alumnos desea cargar?");
        int cantAlum = scan.nextInt();
        for (int i = 0; i < cantAlum; i++) {
           listaAlumnos.add(AlumSer.crearAlumno());
        }
        System.out.println("//////////////////////");
        // corrobora -- System.out.println(listaAlumnos.get(0).getNotasAlumnos());
        System.out.println("CALCULANDO NOTA FINAL DE CADA ALUMNO...");
        System.out.println("//////////////////////");
        for (int i = 0; i < cantAlum; i++) {
            System.out.println("La nota final de "+listaAlumnos.get(i).getNombre()+" es ");
            int notaF;
            notaF = AlumSer.calcNotaFinal(listaAlumnos.get(i).getNotasAlumnos());
            System.out.println(notaF);
            System.out.println("//////////////////////");
        }
    
    
    
    }
        
    }
    

