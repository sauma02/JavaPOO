/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones;

import Globant.Colecciones.servicios.ej1ServicioMascota;

/**
 *
 * @author Admin
 */
public class Ej1MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se esta manera se crea una collection a traves de objetos y servicios
        //Creamos el servicio
       ej1ServicioMascota sm = new ej1ServicioMascota();
       //Se crean dos mascotas
//       sm.crearMascota();
//       sm.crearMascota();
       //Se muestran las mascotas
//       sm.mostrarMascotas();
    sm.fabricaDeMascotasChiquitos(140);
    sm.mostrarMascotas();
    sm.fabricaMascota(2);
    sm.mostrarMascotas();
       
    }
    
}
