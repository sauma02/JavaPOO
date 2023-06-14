/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_programacion.servicios;

import POO_programacion.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioMascota {
    //Se usa el .useDelimiter para que pueda leer el espacio y  no se salte los otros dos atributos
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Mascota crearMascota(){
        //Se crear el scanner para poder ingresar por teclado y crear a la mascota cuando se llame a la clase
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        //Devolvemos el nacimiento de la mascota
        return new Mascota(nombre, apodo, tipo);
    
    }
}
