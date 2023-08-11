/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej2Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
       
        boolean flag = true;
        while(flag == true){
            System.out.println("Ingrese la raza del perro o escriba 'salir' para finalizar");
            String razas = leer.nextLine();
            String salir = "salir";
            if(razas.equalsIgnoreCase(salir)){
                flag = false;
            }else{
                raza.add(razas);
            }
        }
        for (String razas : raza) {
            System.out.println(razas);
        }
        System.out.println("Ingrese la raza que desea buscar");
        String razas1 = leer.nextLine();
        //Para recorrer el array list utilizamos el iterator, para eliminar
        //Se utiliza el for convencional para recorrer, buscar y eliminar el elemento como en un vector
        for (int i = 0; i < raza.size(); i++) {
            String m = raza.get(i);
            if(m.equals(razas1)){
                raza.remove(m);
               
                flag = true;
                break;
            }
            
        }
        if(flag == true){
            System.out.println("Raza encontrada y eliminada");
        }else{
            System.out.println("La raza ingresada no esta en la lista");
        }
        
        raza.forEach((e)-> System.out.println(e));
        
        
    }
    
}
