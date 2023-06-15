/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.globant1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Globant1 {

    public static void main(String[] args) {
        
        Scanner leer  = new Scanner(System.in);
        String var = "aaa";
        int al = 0;
        float be = 2;
        double p=3.3;
        char ve = 'a';
        boolean flag = true;
        String nombre = "Jose David Sauma Zaretsky";
        int edad = 22;
        boolean bandera;
        char ch;
        int suma = al + al;
        float sumaA = be + be;
        System.out.println(nombre +" "+ edad);
        System.out.println("Ingrese el valor de flag");
        flag = leer.nextBoolean();
        System.out.println("Ingrese un numero decimal");
        p = leer.nextDouble();
        System.out.println("Ingrese un solo caracter");
        ve = leer.next().charAt(0);
                
        
    }
}
