/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Cadena;
import EjerciciosPOO.Servicios.ServicioCadena;

/**
 *
 * @author Admin
 */
public class ResolCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "hola";
        Cadena c1 = new Cadena(frase, frase.length());
        ServicioCadena sc = new ServicioCadena();
        sc.mostrarVocales(c1);
        sc.revertirFrase(c1);
    }
    
}
