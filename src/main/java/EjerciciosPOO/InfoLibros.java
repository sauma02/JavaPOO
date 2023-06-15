/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;
import EjerciciosPOO.Servicios.ServicioLibro;
import EjerciciosPOO.Entidades.Libro;
/**
 *
 * @author Admin
 */
public class InfoLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Libro l1 = new Libro();
       ServicioLibro sm = new ServicioLibro();
       sm.llenarLibro(l1);
       sm.mostrarLibro(l1);
       
        
    }
    
}
