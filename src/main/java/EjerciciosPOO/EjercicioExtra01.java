/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;
import EjerciciosPOO.Entidades.Vehiculo;
/**
 *
 * @author Admin
 */
public class EjercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Vehiculo v1 = new Vehiculo("Renault", "Logan", 2010, "automovil");
    Vehiculo v2 = new Vehiculo("Harley Davidson", "Chopper", 2019, "motocicleta");
    Vehiculo v3 = new Vehiculo("Shimazu", "Ventura", 2001, "bicicleta");
    
    v1.moverse(5);
    v2.moverse(5);
    v3.moverse(5);
    
    v1.moverse(10);
    v2.moverse(10);
    v3.moverse(10);
    
    v1.moverse(60);
    v2.moverse(60);
    v3.moverse(60);
    
    v1.moverse(300);
    v1.frenar();
    v2.moverse(300);
    v2.frenar();
    v3.moverse(300);
    v3.frenar();
    
    if(v1.getDistancia() > v2.getDistancia() && v1.getDistancia() > v3.getDistancia()){
        System.out.println("El vehiculo "+v1.getTipo()+" es el que recorrio mas distancia");
    }else if(v2.getDistancia()>v1.getDistancia() && v2.getDistancia() > v3.getDistancia()){
        System.out.println("El vehiculo "+v2.getTipo()+" es el que recorrio mas distancia");
    }else{
        System.out.println("El vehiculo "+v3.getTipo()+" es el que recorrio mas distancia");
    }
    
    }
    
}
