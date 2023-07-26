/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Matematica;
import EjerciciosPOO.Servicios.ServicioMatematica;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ResolMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Matematica m1 = new Matematica();
        ServicioMatematica sm = new ServicioMatematica();
        Scanner leer = new Scanner(System.in);
        
        m1.setNum1(Math.random()*10+1);
        m1.setNum2(Math.random()*10+1);
        sm.devolverMayor(m1);
        sm.calcularPotencia(m1);
        sm.calculaRaiz(m1);
     
        
    }
    
}
