/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Persona;
import EjerciciosPOO.Servicios.ServicioPersona;

/**
 *
 * @author Admin
 */
public class ResolPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        ServicioPersona sp = new ServicioPersona();
        ServicioPersona sp2 = new ServicioPersona();
        ServicioPersona sp3 = new ServicioPersona();
        ServicioPersona sp4 = new ServicioPersona();
        sp.crearPersona(p1);
        double peso1 = sp.calcularIMC(p1);
        boolean edad1 = sp.esMayorDeEdad(p1);
         Thread.sleep(1000);
         sp2.crearPersona(p2);
        double peso2 = sp.calcularIMC(p2);
        boolean edad2 = sp.esMayorDeEdad(p2);
        Thread.sleep(1000);
        sp3.crearPersona(p3);
        double peso3 = sp.calcularIMC(p3);
        boolean edad3 = sp.esMayorDeEdad(p3);
        Thread.sleep(1000);
         sp4.crearPersona(p4);
        double peso4 = sp.calcularIMC(p4);
        boolean edad4 = sp.esMayorDeEdad(p4);
        
        calcularPorcentajePesoI(peso1,peso2,peso3,peso4);
        
        calcularPorcentajeEdad(edad1,edad2,edad3,edad4);
    }
    public static void calcularPorcentajePesoI(double p1, double p2, double p3, double p4){
        int contI = 0;
        int contD = 0;
        int contS = 0;
        System.out.println("Peso 1: "+p1+"\nPeso 2: "+p2+"\nPeso 3: "+p3+"\nPeso 4: "+p4);     
        double arr [] = new double[4];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                contI++;
            }else if(arr[i] == -1.0){
                contD++;
            }else if(arr[i] == 1.0){
                contS++;
            }
            
        }
        System.out.println("Personas por debajo de su peso: "+contD);
        System.out.println("Personas con sobrepeso: "+contS);
        System.out.println("Personas con su peso ideal: "+contI);
        System.out.println("Porcetanje de personas por debajo del peso: "+contD*100/arr.length+"%");
        System.out.println("Porcetanje de personas por encima del peso: "+contS*100/arr.length+"%");
        System.out.println("Porcetanje de personas con un peso ideal: "+contI*100/arr.length+"%");
    }
    public static void calcularPorcentajeEdad(boolean e1, boolean e2, boolean e3, boolean e4){
        int contMe = 0;
        int contMa = 0;
        
        System.out.println("Edad 1: "+e1+"\nEdad 2: "+e2+"\nEdad 3: "+e3+"\nEdad 4: "+e4);     
        boolean arr [] = new boolean[4];
        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;
        arr[3] = e4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true){
                contMa++;
            }else if(arr[i] == false){
                contMe++;
            }
            
        }
        System.out.println("Personas menores de edad: "+contMe);
        System.out.println("Personas Mayores de edad: "+contMa);
        System.out.println("Porcetanje de personas Menores de edad: "+contMe*100/arr.length+"%");
        System.out.println("Porcetanje de personas Mayores de edad: "+contMa*100/arr.length+"%");
        
    }
    
}
