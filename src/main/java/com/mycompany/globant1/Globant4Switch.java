/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globant1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Globant4Switch {
        public static void main(String[] args){
        
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el tipo de motor");
            String tipoMotor = leer.nextLine();
            
            switch(tipoMotor){
                case "1":
                    System.out.println("La bomba es una bomba de agua");
                break;
                case "2":
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case "3":
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case "4":
                    System.out.println("La bomba es una bomba de pasta alimentacia");
                    break;
                    
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
              break;     
                  
            }
            
        }
}
