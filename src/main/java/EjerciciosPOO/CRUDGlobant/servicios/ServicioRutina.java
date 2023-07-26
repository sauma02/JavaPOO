/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUDGlobant.servicios;
import CRUDGlobant.entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ServicioRutina {
    ArrayList<Rutina> lista = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rutina crearRutina(){
        System.out.println("Ingrese el id de la rutina");
        int id = leer.nextInt();
        System.out.println("Ingrese el nombre de la rutina");
        String nombre = leer.next();
        System.out.println("Ingrese la duracion de la rutina");
        int duracion = leer.nextInt();
        System.out.println("Ingrese el nivel de dificultad de la rutina");
        String nivelDificultad = leer.next();
        System.out.println("Ingrese la descripcion de la rutina");
        String descripcion = leer.next();
      
        
        
        return new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
    }
    public void registrarRutina(){
        lista.add(crearRutina());
    }
    public void obtenerRutina(){
        if(lista.isEmpty()){
            System.out.println("No hay rutinas en la lista");
        }else{
            lista.forEach((list)->{
                
                System.out.println(list);
            });
        }
    }
     public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()== id){
                lista.get(i).setNombre(nombre);
                lista.get(i).setDuracion(duracion);
                lista.get(i).setNivelDificultad(nivelDificultad);
                lista.get(i).setDescripcion (descripcion);
                
            }
            
        }
          for (int i = 0; i < lista.size(); i++) {
              System.out.println(lista);
              
          }
    }
      public void eliminarRutina(int id){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()==id){
                lista.remove(i);
            }
            
        }
        System.out.println("La rutina ha sido eliminada");
    }
}
