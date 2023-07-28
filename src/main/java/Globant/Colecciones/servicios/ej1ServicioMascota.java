
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Globant.Colecciones.servicios;

import Globant.Colecciones.entidades.ej1Mascota;
import POO_programacion.entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ej1ServicioMascota {
    
    //Nueva variable global array list, tambien se puede crear como List ya que se es el padre 
    private Scanner leer;
    //Se pone el array list como mascota para hacerlo masivo
    private ArrayList<Mascota> mascotas;
    //private ArrayList<String> mascotas;
    
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
    
//     public void crearMascota(){
//        System.out.println("Introducir nombre");
//        String nombre = leer.next();
//        System.out.println("Introducir apodo");
//        String apodo = leer.next();
//        System.out.println("Introducir tipo");
//        String tipo = leer.next();
//        //No la va a devolver sino que la vamos a ir alamcenando en el ArrayList 
//        //Se crea el string mascota con los atributos concatenados para que se pueda ingresar en el array list
//        String mascota = nombre+" "+apodo+" "+tipo;
//        mascotas.add(mascota);
//        
//        //Se crea con un constructor
//        
//    }
    //Se cambia el metodo de void a Mascota para que retorne un objeto
         public Mascota crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        //No la va a devolver sino que la vamos a ir alamcenando en el ArrayList 
        //Se crea el string mascota con los atributos concatenados para que se pueda ingresar en el array list
        String mascota = nombre+" "+apodo+" "+tipo;
        //Se quita el add, y simplemente se añade un return mascota
        Mascota m = new Mascota(nombre, apodo, tipo);
        //Se añade esto por teclado, y se crea en la variable M, y se añade a la lista de la mascota, retorna M
        mascotas.add(m);
        return m;
        
        //Se crea con un constructor
        
    }
     //Se crea un metodo con un for each para poder ingresar y mirar el array list
//     public void mostrarMascotas(){
//         //Se crear un for each con una variable auxiliar
//         System.out.println("Las mascotas actuales de la lista mascotas son");
//         for(String var: mascotas){
//             //Se crea un sout con la variable auxiliar
//             System.out.println(var);
//         }
//         //Con la funcion size se puede detectar la cantida de mascotas en el array list  
//         System.out.println("cantidad = " + mascotas.size());
//         
//     }
          public void mostrarMascotas(){
         //Se crear un for each con una variable auxiliar
         System.out.println("Las mascotas actuales de la lista mascotas son");
         //Se quita el String y se declara la variable auziliar comop una Mascota, es decir como un obejto pára que pueda mostrar los elemento del array list
         for(Mascota var: mascotas){
             //Se crea un sout con la variable auxiliar, se llama con un toString, par mostrar la posicion del objeto
             System.out.println(var.toString());
         }
         //Con la funcion size se puede detectar la cantida de mascotas en el array list  
         System.out.println("cantidad = " + mascotas.size());
         
     }
          //Fabrica de mascotas
          //Se declara una variable param con la cantidad
          /**
           * 
           * @param cant equivale a la cantidad de mascotas a crear y añadir a la lista, tdas las mascotas ya vienen predefinidas como chiquito
           * 
           */
          public void fabricaDeMascotasChiquitos(int cant){
              
              for (int i = 0; i < cant; i++) {
                  //Se crean y se añaden todas en la misma lista, se declara la mascota con los valores del constructor
                 
                  mascotas.add(new Mascota("fer", "chiquito", "Bengie"));
                  
                  
              }
          }
          /**
           * @param cant Crea mascotas pidiendo los datos por teclado, las ingresa en el array list
           */
          public void fabricaMascota(int cant){
              for (int i = 0; i < cant; i++) {
                  //Se llama a crear mascota dentro del bucle for para pedir al usuario que agregue los datos
                  Mascota mascotaCreada = crearMascota();
                  System.out.println(mascotaCreada.toString());
              }
              
              
              
          }
}
