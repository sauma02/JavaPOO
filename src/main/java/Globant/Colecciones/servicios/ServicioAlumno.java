/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Globant.Colecciones.servicios;

import Globant.Colecciones.entidades.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioAlumno {
    Scanner leer = new Scanner(System.in);
    private ArrayList<Alumno> alumnos = new ArrayList();
    
    Integer [] nota = new Integer[3];
    public ArrayList<Alumno> crearAlumno(){
        boolean flag = true;
        
        
        while(flag == true){
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            
                int cont = 0;
                List<Integer> notas = new ArrayList(Arrays.asList(nota) );
                System.out.println("Ingrese las notas del alumno");
                for (int i = 0; i < nota.length; i++) {
                    nota[i] = leer.nextInt();
                   notas.add(i, nota[i]);
                    if(i == 2){
                        cont = 1;
                    }
                }
                 Alumno m = new Alumno(nombre, notas);
                 
                alumnos.add(m);
                 System.out.println("Escriba 'y' para crear otro alumno, o 'salir' para salir del programa");
                  String op = leer.next();
                 String y = "y";
                 String salir = "salir";
          
                  if(op.equalsIgnoreCase(salir)){
                      System.out.println("Saliendo..");
                      
                flag = false;
                break;
                
                    }else if(op.equals(y)){
                    flag = true;
                        }
                  
        } 
        return alumnos;
    }
    public int notaFinal(){
        crearAlumno();
        System.out.println("Ingrese el nombre del alumno a calcular");
        String nombre = leer.next();
        if(nombre.equals(alumnos.get(0))){
           List<Integer> notaFin = m.getNotas();
           int cont = 0;
           int sum = 0;
            for (Integer i : notaFin) {
                sum += i;
            }
            System.out.println("El promedio final es:");
            return sum/3;
        }else{
            int error = 37703;
            return error;
        }
    }
}
               
                
                
                
                
                
              
                
            
                
            
            
            
        
    

