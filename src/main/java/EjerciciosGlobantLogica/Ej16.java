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
import java.lang.Math;
import java.util.Random;
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tamaño del vector");
        
        int num = leer.nextInt();
        
        int arr[] = new int[num];
        rellenarVector(arr);
        mostrarVector(arr);
        buscarNum(arr);
        
    }
    public static void rellenarVector(int [ ]vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int)(Math.random()*100)+1;
            
            
        }
    }
    public static void mostrarVector(int [] vec){
        for (int i = 0; i < vec.length; i++) {
            System.out.print("["+vec[i]+"]");
        }
    }
    public static void buscarNum(int [] vec){
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese el numero que desea buscar dentro del arreglo");
        int num2 = leer.nextInt();
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] == num2){
                cont ++;
                System.out.println("El numero "+num2+" se encuentra en la posicion "+i+" y esta repetido "+cont+" vez/ces");
            }
            
        }
        if(cont == 0){
            System.out.println("El numero no se encuentra dentro del arreglo");
        }
    }
}
