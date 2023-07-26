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
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del socio");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la clase del socio: A. \nB. \nC.");
        char clase = leer.next().charAt(0);
        System.out.println("Ingrese el valor del tratamiento");
        double cuota = leer.nextDouble();
        
        switch(clase){
            case 'a':
            case 'A':
                double desc = cuota * 0.5;
                double val_final = cuota - desc;
                System.out.println("El socio "+nombre+" de clase "+clase+" debera pagar un total de "+val_final+" con un descuento del 50%");
                break;
            case 'b':
            case 'B':
                double desc1 = cuota * 0.35;
                double val_final1 = cuota - desc1;
                System.out.println("El socio "+nombre+" de clase "+clase+" debera pagar un total de "+val_final1+" con un descuento del 35%%");
                break;
            case 'c':
            case 'C':
                
                double val_final2 = cuota;
                System.out.println("El socio "+nombre+" de clase "+clase+" debera pagar un total de "+val_final2+" (No cuenta con descuentos)");
                break;
        }
    }
    
}
