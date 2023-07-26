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
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        
        switch(letra){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':    
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
        
    }
    
}
