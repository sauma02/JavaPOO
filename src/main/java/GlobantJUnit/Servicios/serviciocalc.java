/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GlobantJUnit.Servicios;

import GlobantJUnit.DiscountCalculator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class serviciocalc {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public double calcularDesc(DiscountCalculator c1, Double valor){
        System.out.println("Ingrese el valor del descuento");
        c1.setDescuento(leer.nextDouble());
        
        Double desc = c1.getDescuento()*valor;
        Double valFi = valor - desc;
        System.out.println("El descuento es de "+desc+ " el valor final es de: \n");
        return valFi;
        
        
    }
}
