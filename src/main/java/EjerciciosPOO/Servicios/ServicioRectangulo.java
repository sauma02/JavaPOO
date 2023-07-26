/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Rectangulo;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in);
    Rectangulo r1 = new Rectangulo();
    public void ingresarValores(Rectangulo r1){
        System.out.println("Ingrese el valor de la base");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura");
        r1.setAltura(leer.nextInt());
    }
    public int perimetro(Rectangulo r1){
        int per = (r1.getBase() * r1.getAltura())*2;
        return per;
    }
    public int superficie(Rectangulo r1){
        int area = r1.getAltura() * r1.getBase();
        return area;
    }
    public void dibujarRectangulo(Rectangulo r1){
        for (int i = 1; i <= r1.getAltura(); i++) {
            
            for (int j = 1; j <= r1.getBase(); j++) {
                if((i==1)||(i==r1.getAltura())||(j==1)||(j==r1.getBase())){
                System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println("");
            
        }
    }
    
}
