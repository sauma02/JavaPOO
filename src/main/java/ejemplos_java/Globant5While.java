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
public class Globant5While {
            public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una nota entre 0 y 10");
            int nota = leer.nextInt();
               
            if(nota<0 || nota>10){
                while(nota<0 || nota>10){
                    System.out.println("Error, ingrese una nota entre 0 y 10");
                    nota = leer.nextInt();
                }
                System.out.println("Nota ingresada exitosamente");
            }else{
                System.out.println("Nota ingresada exitosamente");
            }   
            }
}
