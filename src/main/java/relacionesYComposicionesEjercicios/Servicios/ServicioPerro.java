/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesYComposicionesEjercicios.Servicios;

import java.util.Scanner;
import relacionesYComposicionesEjercicios.entidades.Perro;

/**
 *
 * @author Admin
 */
public class ServicioPerro {
    Scanner leer = new Scanner(System.in);
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la edad del perro");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese el tamaño del perro");
        String tamaño = leer.next();
        
        Perro p1 = new Perro(nombre, edad, raza, tamaño);
        return p1;
        
    }
    
}
