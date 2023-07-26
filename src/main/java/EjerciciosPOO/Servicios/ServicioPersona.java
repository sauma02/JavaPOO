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
        p1.setGenero(leer.next().charAt(0));
        System.out.println("Ingrese el peso en kg");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros");
        p1.setAltura(leer.nextDouble());
        
    }
    public double calcularIMC(Persona p1){
        double imc = Math.round(p1.getPeso()/Math.pow( p1.getAltura(), 2));
        if(imc < 20){
            System.out.println("Esta por debajo de su peso ideal");
            return -1;
        }else if(imc >=20 && imc <= 25){
            System.out.println("Usted esta en su peso ideal");
            return 0;
        }else if(imc > 25){
            System.out.println("Usted tiene sobrepeso");
           return 1;
        }
        return imc;
    }
    public boolean esMayorDeEdad(Persona p1){
        int esMayor = p1.getEdad();
        boolean mayor=false;
        if(esMayor >= 18){
            System.out.println("Es mayor de edad");
            mayor = true;
            return mayor;
            
        }else{
            System.out.println("No es mayor de edad");
            return mayor;
        }
        
        
    }
}
