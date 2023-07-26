/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CRUDGlobant.entidad;

import CRUDGlobant.servicios.ServicioCliente;
import CRUDGlobant.servicios.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Resolucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioCliente sc = new ServicioCliente();
      ServicioRutina sr = new ServicioRutina();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
////        System.out.println("Ingresa la cantidad de clientes que quieres agregar");
////        int cantidad = leer.nextInt(); 
//        for (int i = 0; i < cantidad; i++) {
//            sc.registrarCliente();
//        }
    boolean salir = true;
    
    while(salir == true){
    
        System.out.println("Ingresa la accion que deseas realizar");
        System.out.println("--------------------------------------");
        System.out.println("1.Registrar cliente\n 2.Obtener cliente\n 3.Actualizar cliente \n 4.Eliminar cliente \n 5.Crear rutina \n 6.Obtener rutina \n 7.Actualizar rutina \n 8.Eliminar rutina \n 9.Salir");
        int menu = leer.nextInt();
        
        switch(menu){
            case 1:
                sc.registrarCliente();
                break;
            case 2:
                sc.obtenerCliente();;
                break;
            case 3:
                System.out.println("Ingresa el id que quieres modificar");
                int id = leer.nextInt();
                System.out.println("Ingresa el nuevo nombre");
                String nombre = leer.next();
                System.out.println("Ingrese la nueva edad");
                int edad = leer.nextInt();
                System.out.println("Ingrese la nueva altura");
                double altura = leer.nextDouble();
                System.out.println("Ingrese el nuevo peso");
                double peso = leer.nextDouble();
                System.out.println("Ingrese el nuevo objetivo");
                String objetivo = leer.next();
                sc.actualizarCliente(id, nombre, edad, altura, peso, objetivo);
                break;
            case 4:
                System.out.println("Ingrese el id del cliente que desea eliminar");
              
                sc.eliminarCliente(leer.nextInt());
                break;
            case 5:
                sr.crearRutina();
                break;
            case 6:
                sr.obtenerRutina();
                break;
            case 7:
                System.out.println("Ingresa el id de la rutina que quieres modificar");
                id = leer.nextInt();
                System.out.println("Ingresa el nuevo nombre de la rutina");
                nombre = leer.next();
                System.out.println("Ingrese la nueva duracion de la rutina");
                int duracion = leer.nextInt();
                System.out.println("Ingrese el nuevo nivel de la rutina");
               String nivelDificultad = leer.next();
                System.out.println("Ingrese la nueva descripcion de la rutina");
                String descripcion = leer.next();
                sr.actualizarRutina(id, nombre, duracion, nivelDificultad, descripcion);
                break;
                  case 8:
                      System.out.println("Ingrese el id de la ruita que deseas eliminar");
                      id = leer.nextInt();
                      sr.eliminarRutina(id);
                break;
                  case 9:
                salir = false;
                break;
                
        }
    }
    }
    
}
