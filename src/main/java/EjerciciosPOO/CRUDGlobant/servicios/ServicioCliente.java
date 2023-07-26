/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUDGlobant.servicios;

import CRUDGlobant.entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioCliente {
    ArrayList<Cliente> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public Cliente registrarCliente(){
        System.out.println("Ingrese el id del cliente");
        int id = leer.nextInt();
         System.out.println("Ingrese el Nombre ");
        String nombre = leer.next();
         System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
         System.out.println("Ingrese la altura");
        Double altura = leer.nextDouble();
         System.out.println("Ingrese el peso");
        Double peso = leer.nextDouble();
         System.out.println("Ingrese el objetivo");
        String objetivo = leer.next();
        
        return new Cliente(id, nombre, edad, altura, peso, objetivo);
    }
    public void registrarClientes(){
        lista.add(registrarCliente());
    }
    public void obtenerCliente(){
        //se utiliza el for del foprmato ? : ? para que muestre los atributos de cada cliente
        if(lista.isEmpty()){
            System.out.println("No hay clientes en la lista");
        }else{
            lista.forEach((list)->{
                
                System.out.println(list);
            });
        }
        
        
        
    }
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()== id){
                lista.get(i).setNombre(nombre);
                lista.get(i).setEdad(edad);
                lista.get(i).setAltura(altura);
                lista.get(i).setPeso(peso);
                lista.get(i).setObjetivo(objetivo);
            }
            
        }
          for (int i = 0; i < lista.size(); i++) {
              System.out.println(lista);
              
          }
    }
    
    public void eliminarCliente(int id){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()==id){
                lista.remove(i);
            }
            
        }
        System.out.println("El cliente ha sido eliminado");
    }
}
