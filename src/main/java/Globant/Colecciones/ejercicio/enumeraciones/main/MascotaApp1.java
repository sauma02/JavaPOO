/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones.ejercicio.enumeraciones.main;

import Globant.Colecciones.ejercicio.enumeraciones.RazaGatuna;
import Globant.Colecciones.ejercicio.enumeraciones.RazaPerruna;
import Globant.Colecciones.ejercicio.enumeraciones.entidades.Mascota1;

/**
 *
 * @author Admin
 */
public class MascotaApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Al crear el objeto, se establece dentro de <> e enum a usar, en este caso RazaPerruna y se reemplaza la letra T, de esta manera 
        //la clase sabra a que atributo debe asiganrle el valor dependiendo el enum, en este caso a la raza
        Mascota1 m1 =  new Mascota1<RazaPerruna>("Fer", "Chiquito", "Perro");
       m1.setRaza(RazaPerruna.BEAGLE);
        Mascota1 m2 = new Mascota1<RazaGatuna>("Pepa", "Lola", "Gato");
        m2.setRaza(RazaGatuna.PERSA);
    }
    
}
