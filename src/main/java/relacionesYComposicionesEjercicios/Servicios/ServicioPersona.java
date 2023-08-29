/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesYComposicionesEjercicios.Servicios;


import static java.lang.constant.ConstantDescs.NULL;
import java.util.Scanner;
import relacionesYComposicionesEjercicios.entidades.Perro;
import relacionesYComposicionesEjercicios.entidades.Persona1;

/**
 *
 * @author Admin
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    ServicioPerro sp = new ServicioPerro();
    public Perro asignarPerro(){
        Perro p1 = sp.crearPerro();
        return p1;
    }
    public Persona1 crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido de la persona");
        String apellido = leer.next();
        System.out.println("Ingrese la edad de la persona");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el documento de la persona");
        String documento = leer.next();
        System.out.println("Ingrese al perro");
        Perro p1 = asignarPerro();
        Persona1 pp1 = new Persona1(nombre, apellido,  edad, documento, p1);
        
        return pp1;
    }
  
    
  
}
