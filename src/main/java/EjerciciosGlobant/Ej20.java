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
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        System.out.println("Ingrese los numeros de la matriz solo entre 1 y 9");
        rellenar(matriz);
        System.out.println("Matriz ingresada: ");
        mostrar(matriz);
        System.out.println("Comprobando si su matriz es magica");
        comprobar(matriz);
    }
    public static void rellenar(int [][] matriz){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                 System.out.println("Ingrese los numeros de la fila "+i+" colummna "+j);
                matriz[i][j]=leer.nextInt();
               
                if(matriz[i][j] > 9 || matriz[i][j] <= 0){
                    System.out.println("Ingrese solo numeros entre 1 y 9");
                     System.out.println("Ingrese los numeros de la fila "+i+" colummna "+j);
                    matriz[i][j] = leer.nextInt();
                }
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
       public static void comprobar(int [][] matriz){
        boolean flag = false;
        int suma = 0;
           for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                suma = matriz[0][0] + matriz[0][1] + matriz[0][2];
                if((matriz[1][0] + matriz[1][1] + matriz[1][2]) == suma && (matriz[2][0] + matriz[2][1] + matriz[2][2]) == suma &&(matriz[0][0] + matriz[1][0] + matriz[2][0]) == suma && (matriz[0][1] + matriz[1][1]+matriz[2][1])== suma && (matriz[0][2]+matriz[1][2]+matriz[2][2])==suma && (matriz[0][0]+matriz[1][1]+matriz[2][2])==suma &&(matriz[2][2]+matriz[1][1]+matriz[0][0])==suma){
                       flag = true;
                }
                
            }
            
        }
           if(flag == true){
               System.out.println("Es una matriz magica");
           }else{
               System.out.println("No es una matriz magica");
           }
       }
        
    }

