/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_java;

/**
 *
 * @author Admin
 */
public class Globant9Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] vector = new int[3][3];
       
       for(int i = 0; i< 2; i++){
           for (int j = 0; j < 2; j++) {
               vector[i][j]=i;
           }
    }
        for(int i = 0; i< 2; i++){
            System.out.print("[");
           for (int j = 0; j < 2; j++) {
               System.out.print("["+vector[i][j]+"]");
           }
            System.out.print("]");
            System.out.println(" ");
    }
    }
    
}
