/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Rectangulo;
import EjerciciosPOO.Servicios.ServicioRectangulo;

/**
 *
 * @author Admin
 */
public class ResolRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        ServicioRectangulo sr = new ServicioRectangulo();
        sr.ingresarValores(r1);
        sr.dibujarRectangulo(r1);
    }
    
}
