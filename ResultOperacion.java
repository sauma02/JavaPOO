/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

/**
 *
 * @author Admin
 */
import EjerciciosPOO.Entidades.Operacion;
import EjerciciosPOO.Servicios.ServicioOperacion;
import java.util.Scanner;
public class ResultOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion o1 = new Operacion();
        ServicioOperacion so = new ServicioOperacion();
        so.crearOperacion(o1);
        System.out.println("La suma equivale a: "+so.sumar(o1));
        System.out.println("La resta equivale a: "+so.restar(o1));
        so.division(o1);
        System.out.println("La multiplicacion equivale a: "+so.multiplicacion(o1));
    }
    
}
