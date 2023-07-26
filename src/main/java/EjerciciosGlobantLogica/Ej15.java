/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobantLogica;

/**
 *
 * @author Admin
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vec = new int[100];
        rellenarVector(vec);
        revertirVector(vec);
    }
    public static void rellenarVector(int [] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = i;
        }
        
    }
    public static void mostrarVector(int [] vec){
        for (int i = 0; i < vec.length; i++) {
            System.out.println("["+vec[i]+"]");
        }
    }
    public static void revertirVector(int [] vec){
        int [] aux = new int[vec.length];
        for (int i = vec.length-1,j= 0; i >= 0; i--,j++) {
            aux[i] = vec[j];
        }
        for (int i = 0; i < aux.length; i++) {
            System.out.println("["+aux[i]+"]");
        }
        
    }
}
