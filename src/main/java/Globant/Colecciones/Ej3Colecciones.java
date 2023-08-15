/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones;
import Globant.Colecciones.entidades.Alumno;
import Globant.Colecciones.servicios.ServicioAlumno;

/**
 *
 * @author Admin
 */
public class Ej3Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        
      sa.crearAlumno();
      sa.notaFinal();
        
    }
    
}
