/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Cafetera;
import EjerciciosPOO.Servicios.ServicioCafetera;

/**
 *
 * @author Admin
 */
public class ResolCafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera f1 = new Cafetera();
        ServicioCafetera sc = new ServicioCafetera();
        sc.llenarCafetera(f1);
        sc.servirTaza(f1);
        sc.vaciarCafetera(f1);
        sc.agregarCafe(f1);
    }
    
}
