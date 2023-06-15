/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;
import EjerciciosPOO.Entidades.Circunferencia;
import java.util.Scanner;
        /**
 *
 * @author Admin
 */
public class ServicioCircunferencia {
    
    public void crearCircunferencia(Circunferencia c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        
    }
    public Double area(Circunferencia c1){
        double ar = Math.pow(c1.getRadio(), 2)+Math.PI;
        return ar;
        
    }
    public Double perimetro(Circunferencia c1){
        double p = 2*Math.PI+c1.getRadio();
        
        return p;
    }

 
}
