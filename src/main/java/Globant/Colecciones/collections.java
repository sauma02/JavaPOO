/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Coleccion y Mapa. diferencias
    //Colecciones
    //Array, se llena de forma dinamica con un ciclo for
    String[] nombresArray = new String[5];
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i]="Chiquito"+(i+1);
        }
    //Con un ciclo for especifico se muestra por pantalla
        for(String var: nombresArray){
            System.out.println(var);
        }
    //Collections
    //Creamos una lista con arraylist se puede dejar o no el <>
    ArrayList<String> nombresArrayList = new ArrayList();
    
    //Añadir objetos al arraylist se usa .add
    
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
    
    
        System.out.println(nombresArrayList.size());
    //Para eliminar objetos en el array list se usa .remove
    nombresArrayList.remove("Chiquito");
    System.out.println(nombresArrayList.size());
    }
    //Las listas son padres de los arrays, linked list, vector 
    

}
