
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Globant.Colecciones.servicios;

import Globant.Colecciones.entidades.ej1Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ej1ServicioMascota {
    
    //Nueva variable global array list, tambien se puede crear como List ya que se es el padre 
    private Scanner leer;
    private ArrayList<String> mascotas;
    
    //Se crear constructor del array list para inicializar

    public ej1ServicioMascota() {
        //Se ingresa el scanner dentro del constructor
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
     
    
    
    
    //Se declara el metodo con la mascota para directamente crearla sin necesidad de parametros, public [nombreObjeto] [nombreMetodo]
   // public ej1Mascota crearMascota(){
//        System.out.println("Introducir nombre");
//        String nombre = leer.next();
//        System.out.println("Introducir apodo");
//        String apodo = leer.next();
//        System.out.println("Introducir tipo");
//        String tipo = leer.next();
//        //No la va a devolver sino que la vamos a ir alamcenando en el ArrayList    
//        
//        
//        //Se crea con un constructor
//        return new ej1Mascota(nombre, apodo, tipo);
//    }
    
     public void crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        //No la va a devolver sino que la vamos a ir alamcenando en el ArrayList 
        //Se crea el string mascota con los atributos concatenados para que se pueda ingresar en el array list
        String mascota = nombre+" "+apodo+" "+tipo;
        mascotas.add(mascota);
        
        //Se crea con un constructor
        
    }
     //Se crea un metodo con un for each para poder ingresar y mirar el array list
     public void mostrarMascotas(){
         //Se crear un for each con una variable auxiliar
         System.out.println("Las mascotas actuales de la lista mascotas son");
         for(String var: mascotas){
             //Se crea un sout con la variable auxiliar
             System.out.println(var);
         }
         //Con la funcion size se puede detectar la cantida de mascotas en el array list  
         System.out.println("cantidad = " + mascotas.size());
         
     }
}
