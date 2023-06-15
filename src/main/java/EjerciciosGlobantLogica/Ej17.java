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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int cont = 0;
        int n = leer.nextInt();
        int arr[] = new int[n];
    rellenarVector(arr);
    mostrarVector(arr);
        for (int i = 0; i < arr.length; i++) {
            if(cuentaCifras(arr[i]) == 1){
                 cont = 0;
                cont ++;
                System.out.println("Numeros de 1 digito: "+cont);
            }else if(cuentaCifras(arr[i]) == 2){
                cont = 0;
                cont ++;
                System.out.println("Numeros de 2 digitos: "+cont);
            }else if(cuentaCifras(arr[i]) == 3){
                 cont = 0;
                cont ++;
                System.out.println("Numeros de 3 digitos: "+cont);
            }else if(cuentaCifras(arr[i]) == 4){
                 cont = 0;
                cont ++;
                System.out.println("Numeros de 4 digitos: "+cont);
            }else if(cuentaCifras(arr[i]) == 5){
                 cont = 0;
                cont ++;
                System.out.println("Numeros de 5 digitos: "+cont);
            }else{
                 cont = 0;
                cont++;
                System.out.println("Numeros mayores de 5 digitos: "+cont);
            }
        }
    
    
    }
    public static void rellenarVector(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*1000+25)+1;
            
            
        }
    }
    public static void mostrarVector(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("["+arr[i]+"]");
        }
    }
    public static int cuentaCifras(int num){
        return Integer.toString(num).length();
    }
   
       
    
}




