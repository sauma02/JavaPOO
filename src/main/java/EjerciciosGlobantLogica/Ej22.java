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
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos que desea convertir");
        double min = leer.nextDouble();
        convert(min);
        
        
    }
    public static void convert(double min){
        double seg, hor, dia;
        String result;
        seg = min*60;
        hor = (min%(24*60)/60);
        dia = min/(24*60);
       
        System.out.println("El tiempo ingresado es: \nDia(s): "+Math.round(dia)+" \nHora(s): "+Math.round(hor));
      
    
        
    }
    
}
