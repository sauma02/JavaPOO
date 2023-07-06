/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioCadena {
    Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in);
    public void mostrarVocales(Cadena c1){
        int cont = 0;
        String frase = c1.getFrase();
        char arr [] = new char[frase.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = frase.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'O':
                case 'o':
                case 'u':
                case 'U':
                    cont ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\nLa frase cuenta con "+cont+" vocales");
        
    }
    public void revertirFrase(Cadena c1){
        String frase = c1.getFrase();
        char arr [] = new char[frase.length()];
        System.out.println("\nFrase Revertida");
         for (int i = arr.length-1; i >= 0 ; i--) {
            arr[i] += frase.charAt(i);
             System.out.print(arr[i]);
        }
         System.out.println("\n");
    }
    public void vecesRepetido(Cadena c1, String letra){
        String frase = c1.getFrase();
        char let = letra.toLowerCase().charAt(0);
        int cont = 0;
       
        char arr[] = new char[frase.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = frase.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == let){
                cont++;
            }
        }
        System.out.print("\nLa letra "+letra+" se encuentra "+cont+" vez(ces)\n");
    }
    public void compararLongitud(Cadena c1, String frase2){
        String frase = c1.getFrase();
        int frase1 = frase.length();
        int frase2l = frase2.length();
        
        if(frase1 > frase2l){
            System.out.println("La frase de la cadena es mayor a la ingresada por el usuario\n");
        }else if(frase1 == frase2l){
            System.out.println("Las dos frases tienen la misma longitud\n");
        }else{
            System.out.println("La frase ingresada por el usuario es mayor que la establecida\n");
        }
    }
    public void unirFrases(Cadena c1, String frase2){
        String frase = c1.getFrase();
        System.out.println("Las frases unidas ");
        System.out.println(c1.getFrase()+frase2);
    }
    public void reemplazar(Cadena c1, String letra){
        String frase = c1.getFrase();
        char let = letra.toLowerCase().charAt(0);
        char arr[] = new char[frase.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = frase.charAt(i);
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'A'){
                arr[i] = let;
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]);
            }
            
        }
       String string = new String(arr);
       c1.setFrase(string);
       
    }

}
