/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;
import EjerciciosPOO.Entidades.Operacion;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ServicioOperacion {
    Operacion o1 = new Operacion();
    
    public void crearOperacion(Operacion o1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        o1.setNumero2(leer.nextInt());
    }
    public int sumar(Operacion o1){
        int suma = o1.getNumero1()+o1.getNumero2();
        return suma;
    }
    public int restar(Operacion o1){
        int resta = o1.getNumero1()-o1.getNumero2();
        return resta;
    }
    public void division(Operacion o1){
        
       
        if(o1.getNumero2() == 0){
            System.out.println("No se puede dividir por 0");
            
        }else{
            int div = o1.getNumero1()/o1.getNumero2();
            System.out.println("La division equivale a: "+div);
        }
        
    }
    public int multiplicacion(Operacion o1){
        int multi = o1.getNumero1()*o1.getNumero2();
        return multi;
    }
}
