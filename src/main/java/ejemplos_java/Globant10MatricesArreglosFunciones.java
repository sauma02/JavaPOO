/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.globant1;

/**
 *
 * @author Admin
 */
public class Globant10MatricesArreglosFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[10];
       
        int [][] matriz = new int[10][10];
        llenarMatriz(matriz);
        devolverMatriz(matriz);
    }
    public static void llenarVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*10+1);
        }
    
    }
    public static void devolverVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        }
        
    }
    public static void llenarMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*25+1);
                
            }
        }
    }
    public static void devolverMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"-");
            }
            System.out.println("]");
            System.out.println("");
        }
    }
  
}
