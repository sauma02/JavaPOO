/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobant;

/**
 *
 * @author Admin
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int[4][4];
        int [][] matriz2 = new int[4][4];
                rellenar(matriz);
                rellenar2(matriz,matriz2);
                mostrar(matriz);
                mostrar(matriz2);
    }
    public static void rellenar(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*50+1);
            }
        }
    }
    public static void mostrar(int [][] matriz){    
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println(" ");
        }
    }
    public static void rellenar2(int[][] matriz, int[][] matriz2 ){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
    }
    }

