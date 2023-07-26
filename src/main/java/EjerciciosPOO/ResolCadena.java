/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Cadena;
import EjerciciosPOO.Servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ResolCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "casa blanca";
        Scanner leer = new Scanner(System.in);
        
        Cadena c1 = new Cadena(frase, frase.length());
        ServicioCadena sc = new ServicioCadena();
        sc.mostrarVocales(c1);
        sc.revertirFrase(c1);
        System.out.println("\nIngrese la letra que desea buscar");
        String letra = leer.nextLine();
        sc.vecesRepetido(c1, letra);
        System.out.println("\nIngrese la frase a la que desea comparar la longitud");
        String frase2 = leer.nextLine();
        sc.compararLongitud(c1, frase2);
        sc.unirFrases(c1, frase2);
        System.out.println("\nIngrese el caracter por el que desea reemplazar la letra a");
        String let = leer.nextLine();
        sc.reemplazar(c1, let);
       
    }
    
}
