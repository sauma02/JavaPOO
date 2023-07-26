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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Establesca un limite numerico");
        int num = leer.nextInt();
        System.out.println("Ingrese numeros hasta que la suma de estos sea mayor al limite");
        for (int i = 0; i < num; i++) {
          int num2 = leer.nextInt();
          suma = suma + num2;
          if(suma>num){
              System.out.println("Ha superado el limite");
              break;
          }else{
              System.out.println("No se supero el limite");
          }
          
        }
        System.out.println("Limite: "+num);
        System.out.println("La suma total fue de: "+suma);
        
    }
    
}
