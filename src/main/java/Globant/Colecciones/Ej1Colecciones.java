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
public class Ej1Colecciones {

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
         
    }
    
}
