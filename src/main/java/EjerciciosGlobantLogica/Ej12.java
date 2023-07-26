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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0, correcta = 0, incorrecta = 0, cont2 = 0, aux = 0;
        System.out.println("Ingrese una cadena de 5 caracteres, el primer caracter tiene que ser una X y el ultimo una O");
        System.out.println("Para salir marque &&&&&");
        String frase = leer.nextLine();
        
      while(!frase.equals("&&&&&")){
          int longitud = frase.length();
          
            if(frase.substring(0, 1).equalsIgnoreCase("x") && (frase.endsWith("o")) && (longitud == 5)){
                correcta++;
            }else{
                incorrecta++;
            }
           System.out.println("Ingrese la cadena correcta:"); 
           frase = leer.nextLine();
        }
        System.out.println("La suma de las marcaciones incorrectas fue de: "+incorrecta);
    System.out.println("La suma de las marcaciones correctas fue de: "+correcta);
    }
    
    
}
