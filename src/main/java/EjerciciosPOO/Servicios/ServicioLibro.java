/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;
import EjerciciosPOO.Entidades.Libro;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ServicioLibro {
   
    
    public void llenarLibro(Libro l1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro");
        l1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas del libro");
        l1.setNumPa(leer.nextInt());
    }
 public void mostrarLibro(Libro l1){
     int i = l1.getIsbn();
     String t = l1.getTitulo();
     String a = l1.getAutor();
     int n = l1.getNumPa();
     System.out.println("El ISBN es: "+i+"\n El titulo es: "+t+"\n El autor es: "+a+"\n El numero de paginas es: "+n);
 }
}
