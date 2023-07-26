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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        for (int i = 0; i < num-2; i++) {
            System.out.print("*");
            for (int j = 0; j < num-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    
}
