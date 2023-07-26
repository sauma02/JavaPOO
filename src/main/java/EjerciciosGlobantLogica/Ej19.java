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
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [3][3];
        System.out.println("Rellene la matriz");
        rellenar(matriz);
        System.out.println("Matriz ingresada: ");
        mostrar(matriz);
        System.out.println("Comprobando matriz...");
        comprobar(matriz);
        
        
    }
    public static void rellenar(int [][] matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el numero de la fila "+i+" columna "+j);
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    public static void mostrar(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.print("]");
            System.out.println(" ");
        }
    }
    public static void comprobar(int[][] matriz){
        int [][] matriz2 = new int [matriz.length][matriz.length];
        boolean flag = false;
        for (int i = 0; i < matriz2.length; i++) {
            
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = -matriz[j][i];
                if(matriz2[i][j] == matriz[j][i]){
                    flag = false;
                }
                }
            }
        
              mostrar(matriz2);
              if(flag == false){
                  System.out.println("La matriz no es antisimetrica");
              }else{
                  System.out.println("La matriz es antisimentrica");
              }
                 
        }
        
      
    }
    

