/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobant;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados a convertir");
       double grados = leer.nextDouble();
       double faren = 32 +(9*grados/5);
        System.out.println(grados+"C° grados a farenheit son "+faren+"F°");
    }
    
}
