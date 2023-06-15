/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;
import EjerciciosPOO.Entidades.Circunferencia;
import EjerciciosPOO.Servicios.ServicioCircunferencia;
/**
 *
 * @author Admin
 */
public class resolucionCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Circunferencia c1 = new Circunferencia();
    ServicioCircunferencia sc1 = new ServicioCircunferencia();
    
    sc1.crearCircunferencia(c1);
        System.out.println("El area es: "+sc1.area(c1)+"\nEl perimetro es: "+sc1.perimetro(c1));
        
    
    
    }
    
}
