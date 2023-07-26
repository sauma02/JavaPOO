/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Cafetera;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    public void llenarCafetera(Cafetera f1){
        System.out.println("Capacidad actual: "+f1.getCapacidadMaxima()+"\nCantidad actual: "+f1.getCantidadActual());
        
        System.out.println("Ingrese la cantidad con la que desea llenar la cafetera");
        f1.setCapacidadMaxima(leer.nextDouble());
        f1.setCantidadActual(f1.getCapacidadMaxima());
        System.out.println("Capacidad nueva: "+f1.getCapacidadMaxima());
        System.out.println("Cantidad nueva: "+f1.getCantidadActual());
    }
    public int servirTaza(Cafetera f1){
        System.out.println("Ingrese la capacidad de la taza");
        int taza = leer.nextInt();
        int capacidadMaximaTaza = taza;
        if(taza == f1.getCantidadActual()){
            
            Double a = (f1.getCantidadActual()-taza)+f1.getCantidadActual();
            Double entero = new Double(a);
            taza = entero.intValue();
            f1.setCantidadActual(f1.getCantidadActual()-taza);
            System.out.println("Llenando taza....");
            System.out.println("Taza llena");
            System.out.println("Cantidad restante en la taza: "+f1.getCantidadActual());
            return taza;
        }else if(taza < f1.getCantidadActual()){
             Double a = (f1.getCantidadActual()-taza);
            Double entero = new Double(a);
            taza = entero.intValue();
            f1.setCantidadActual(f1.getCantidadActual()-taza);
            System.out.println("Llenando taza....");
            System.out.println("Taza llena");
            System.out.println("Cantidad restante en la cafetera: "+f1.getCantidadActual());
            return taza;
            
        }else if(taza > f1.getCantidadActual()){
            System.out.println("La taza tiene mas capacidad que la cafetera");
            Double a  = taza-f1.getCantidadActual();
             Double entero = new Double(a);
            taza = entero.intValue();
            f1.setCantidadActual(0.0);
            System.out.println("No se lleno la taza..");
            System.out.println("Rellenando con restante");
            System.out.println("Cantidad actual: "+f1.getCantidadActual());
            System.out.println("La taza le quedo faltando: "+taza);
            return taza;
        }
        System.out.println("Cantidad de cafe en la taza: "+taza+"/"+capacidadMaximaTaza);
        return taza;
    }
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0.0);
        System.out.println("Vaciando cafetera: "+c1.getCantidadActual());
    }
    public int agregarCafe(Cafetera c1){
        System.out.println("Ingrese cuanto cafe desea ingresar en la cafetera");
        int cafe  = leer.nextInt();
                if(cafe > c1.getCapacidadMaxima()){
                    System.out.println("La cantidad de cafe excede el maximo");
                    return cafe;
                }else if(cafe < c1.getCapacidadMaxima()){
                    System.out.println("Cantidad de cafe actual: "+c1.getCantidadActual());
                    c1.setCantidadActual(c1.getCantidadActual()+cafe);
                    System.out.println("Cantidad de cafe agregada: "+cafe);
                    System.out.println("Nueva cantidad de cafe: "+c1.getCantidadActual()+"/"+c1.getCapacidadMaxima());
                    return cafe;
                }else if(cafe == c1.getCapacidadMaxima()){
                    c1.setCantidadActual(c1.getCapacidadMaxima());
                    System.out.println("Cafetera llenada: "+c1.getCantidadActual()+"/"+c1.getCapacidadMaxima());
                    return cafe;
                }
                return cafe;
    }
}
