/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    public void crearPersona(Persona p1){
        System.out.println("Inserte el nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Inserte la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Inserte el sexo como H, M, O");
        p1.setGenero(leer.nextLine().charAt(0));
        System.out.println("Ingrese el peso en kg");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros");
        p1.setAltura(leer.nextDouble());
        
    }
}
