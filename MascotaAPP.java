/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_programacion;
//Se importa el objeto para poder crearlo y llamarlo dentro de la main class

import POO_programacion.entidades.Mascota;
import POO_programacion.servicios.ServicioMascota;


/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        //Crear un nuevo objeto con la entidad recien creada
        /*Perro p1 = new Perro();
        Perro p2 = new Perro();*/
        
        //Al no tener atributos definidos son "fantasmas"
        //Declarar una variable objeto, mas no crearlo
      
        //A la izquierda se asigna el objeto, a la derecha nace, se crea
        
        
        
         // Mascota m1 = new Mascota("Fernando chiquito", leer.next(), "Perro");
          //CTRL+SPACE muestra todos los constructores disponibles dentro del parentesis
          //Al ser los atributos publicos se úeden acceder de esta manera para asiganrlos
          //Exiten valores por defecto si no se asigna un valor se pone 0 si es numero, al ser valores primitivos
          
          //Al un objeto no esta definido lo pone como nulo
          
            //        public String nombre;
            //    public String apodo;
            //    //Conejo, Perro, Gato, etc...
            //    public String tipo;
            //    public String color;
            //    public int edad;
            //    public boolean cola;
            //    public String raza;
            //  
            //          m1.nombre = "Fernando Chiquito";
            //          m1.apodo = "Chiquito";
            //          m1.tipo = "Perro";
            //          m1.edad = 14;
            //          m1.raza = "Beagle";
            //          m1.cola = true;
            //          m1.color = "Tricolor";
            //          
            //Reasignar valores en los atributos del objeto
            //System.out.println(m1.getNombre());
            //Si se escribe el objeto solo opara ser mostrado, retornara el espacio de memoria donde esta 
            //asignada la variable, en este caso M1, nuestro objeto
             //System.out.println(m1.toString());
             //m1.pasear(100);
             //System.out.println(m1.toString());
             //Ahora para usar el servicio crear mascota, creamos un objeto
             //Al no se logico que una mascota se pueda crear asi misma, se delega un servicio para poder hacerlo
             ServicioMascota sm = new ServicioMascota();
             Mascota m1 = sm.crearMascota();
             int a = 10;
             modificador(a, m1);
             System.out.println("a " + a);
             System.out.println("Madcota "+m1);
    }
    public static void modificador(int num, Mascota m){
        num = 100;
        m.setApodo("Mascota Referencia");
    }
    
}
