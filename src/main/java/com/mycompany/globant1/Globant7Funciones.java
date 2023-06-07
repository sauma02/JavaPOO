/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.globant1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Globant7Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        
        esMultiplo(num, num2);
    }
    public static void esMultiplo(int num, int num2){
        if(num2 % num == 0){
            System.out.println("El numero "+num+" es multiplo de "+num2);
        }else if(num % num2 == 0){
            System.out.println("El numero "+num2+" es multiplo de "+num);
        }else{
            System.out.println("No son multiplos");
        }
    }
}
