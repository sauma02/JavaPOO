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
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz10 = new int[10][10];
        int [][] matriz = new int[3][3];
        rellenar(matriz10);
        mostrar(matriz10);
        comprobarM(matriz10, matriz);
                
    }
    public static void rellenar(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*20+1);
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
    public static void comprobarM(int[][] matriz, int [][] matriz2){
        Scanner leer  = new Scanner(System.in);
        boolean encontrada = false;
        int fila = 0;
        int colum = 0;
        System.out.println("Ingrese los valores de la segunda matriz a verificar");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = leer.nextInt();
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                boolean flag = true;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(matriz[i+k][j+l]!=matriz2[k][l]){
                            flag = false;
                            break;
                    }
                }
                    if(!flag){
                        break;
                    }
                }
            if(flag){
                encontrada = true;
                fila = i;
                colum = j;
                break;
            }
            
            }
            if(encontrada){
                break;
            }
            
        }
        if(encontrada){
            System.out.println("La matriz b esta contenida dentro de la matriz a");
            System.out.println("La submatriz b empieza en la fila: "+fila+"columna: "+colum);
        }else{
            System.out.println("La matriz no fue encontrada");
        }
    }
}
