/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Globant3If {
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        
        if(num1>25 && num2>25){
            System.out.println("Ambos numeros son mayores de 25");
            
        }else if(num1>25){
            System.out.println("Solo "+num1+" es mayor de 25");
            
        }else if(num2>25){
            System.out.println("Solo "+num2+" es mayor de 25");
        }else{
            System.out.println("Ninguno es mayor de 25");
        }
        
    
    }
}
