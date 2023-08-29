/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesYComposicionesEjercicios;

import EjerciciosPOO.Entidades.Persona;
import relacionesYComposicionesEjercicios.Servicios.ServicioPersona;
import relacionesYComposicionesEjercicios.entidades.Persona1;

/**
 *
 * @author Admin
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona1 p1 = new Persona1();
        ServicioPersona sp = new ServicioPersona();
        sp.crearPersona();
        p1.toString();
    }
    
}
