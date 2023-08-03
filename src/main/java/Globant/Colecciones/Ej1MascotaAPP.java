/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Globant.Colecciones;

import Globant.Colecciones.servicios.ej1ServicioMascota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Ej1MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombres = {"pepe", "pepa"};
    
        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
        List <String> nombresList2 = new ArrayList(Arrays.asList(nombres));
        //Para añadir o volcarle elementos al array, se utiliza el addAll con el parametro nombreslist como List, se puede utilizar un indice para definir la posicion
        nombresList2.addAll(0,nombresList);
        //Se esta manera se crea una collection a traves de objetos y servicios
        //Creamos el servicio
//       ej1ServicioMascota sm = new ej1ServicioMascota();
//       //Se crean dos mascotas
////       sm.crearMascota();
////       sm.crearMascota();
//       //Se muestran las mascotas
////       sm.mostrarMascotas();
//sm.fabricaMascota(2);
//sm.mostrarMascotas();
//sm.actualizarMascota(1);
//sm.mostrarMascotas();
//sm.eliminarMascota(0);
//sm.mostrarMascotas();
//       
//    }
//    
     //Iterators para recorrer los arrays mediante patrones
    List <String> nombres2 = new ArrayList();
    nombres2.add("lola");
    nombres2.add("marta");
    nombres2.add("lelo");
     Iterator <String> it = nombres2.iterator();
     //El it.hasNext(), corrobora que exista el indice desde el que se desea buscar, recorre hasta que llegue al ultimo objeto y corte el buscle
     while(it.hasNext()){
         //
         String aux = it.next();
         //Para eliminar
         if(aux.equals("lola")){
             it.remove();
         }
         
     }
    //Un for mostrar los elementos y eliminarlos
    //Sin embargo, con el for eaxh no se puede eliminar por lo que este recorre todos los objetos, si se borra uno, habran errores
//    for(String aux : nombres2){
//        //Se le dice que recorra el array, al encontrar una posicion que sea de igual valor al aux, lo elimine
//        if(aux.equals("lola")){
//            nombres2.remove(aux);
//        }
//    }
    //Busca dentro del array, para poder borrar, yendo paso a paso
//        for (int i = 0; i < nombres2.size(); i++) {
//            String m = nombres2.get(0);
//            if(m.equals("lola")){
//           nombres2.remove(m);
//       }
                    nombres2.forEach((e)->System.out.println(e));

        }
        //For each tecnico, se concatena al array list con un metodo de flecha, y se manda a sout con la variable auziliar e, previamente declarada
        //Con el .stream() se da la posibilidad de hacer analizis por flujo, se obtiene la misma lista, se fuiltra, se puede hacer un flat map
        //nombres2.stream().count();
    //Iterator es un patron que se implemento para recorrer diferentes tipos de datos, es decir cuando se enlazaban las listas
   
    }


