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
    private List<Integer> notas = Arrays.asList(new Integer [3]);
    public void crearAlumno(){
        boolean flag = true;
        
        while(flag == true){
            System.out.println("Ingrese el nombre del alumno o escriba 'salir' para cerrar el programa");
            String nombre = leer.nextLine();
            String salir = "salir";
            if(nombre.equalsIgnoreCase(salir)){
                flag = false;
                break;
            }else{
                boolean flag1 = true;
                System.out.println("Ingrese las notas del alumno");
                for (int i = 0; i < notas.size(); i++) {
                    Integer notas1 = leer.nextInt();
                   notas.add(i, notas1);
                    if(i == 3){
                        flag1 = false;
                    }
                }
               
                 Alumno m = new Alumno(nombre, notas);
                 System.out.println("Escriba 'y' para crear otro alumno, o 'salir' para salir del programa");
                 String op = leer.nextLine();
                 if(op.equalsIgnoreCase(salir)){
                     flag = false;
                     break;
                 }else{
                     flag = true;
                 }
               
                
                
                
                
                
              
                
            }
                
            }
            
            
        }
    }

