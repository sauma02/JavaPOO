/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Matematica;

/**
 *
 * @author Admin
 */
public class ServicioMatematica {
    public void devolverMayor(Matematica m1){
        double num1 = m1.getNum1();
        double num2 = m1.getNum2();
        if(num1>num2){
            System.out.println("El primer atributo es mayor al segundo: \nAt1: "+num1+"\nAt2: "+num2);
        }else if(num1==num2){
            System.out.println("Ambos atributos tienen el mismo valor: \nAt1: "+num1+"\nAt2: "+num2);
            
        }else if(num2>num1){
            System.out.println("El segundo atributo es mayor al primero: \nAt1: "+num1+"\nAt2: "+num2);
        }
    }
    public void calcularPotencia(Matematica m1){
         double num1 = m1.getNum1();
        double num2 = m1.getNum2();
        long num1r = Math.round(num1);
        long num2r = Math.round(num2);
        if(num1r > num2r){
            double pot = Math.pow(num1r,num2r);
            System.out.println("Resultado de "+num1r+" elevado "+num2r+" : "+pot);
        }else if(num1r == num2r){
            double pot = Math.pow(num1r,num2r);
            System.out.println("Resultado de "+num1r+" elevado "+num2r+" : "+pot);
        }else if(num2r>num1r){
            double pot = Math.pow(num2r,num1r);
            System.out.println("Resultado de "+num2r+" elevado "+num1r+" : "+pot);
        }
    }
    public void calculaRaiz(Matematica m1){
          double num1 = m1.getNum1();
        double num2 = m1.getNum2();
        long num1r = Math.round(num1);
        long num2r = Math.round(num2);
        if(num1r > num2r){
            double pot = Math.sqrt(num2r);
            System.out.println("Resultado de la raiz cuadrada de "+num2r+" : "+pot);
        }else if(num1r == num2r){
            double pot = Math.sqrt(num1r);
            System.out.println("Resultado de la raiz cuadrada de "+num1r+" : "+pot);
        }else if(num2r>num1r){
            double pot = Math.sqrt(num1r);
            System.out.println("Resultado de la raiz cuadrada de "+num1r+" : "+pot);
        }
    }
    
}
