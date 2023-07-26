/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobantLogica;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if(num == 0){
            System.out.println("Se ha seleccionado al 0");
        }else if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
       
                
        
    }
    
}
