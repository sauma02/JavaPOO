/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobant;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desea cambiar");
        Double euro = leer.nextDouble();
        cambioDiv(euro);
    }
    public static void cambioDiv(Double divisa){
         Scanner leer = new Scanner(System.in);
        String [] divi = new String[3];
        int cont = 0;
        divi[0]="$";
        divi[1]="Y";
        divi[2]="C";
        
        while(cont == 0){
            System.out.println("Ingrese a que moneda desea realizar el cambio: \n1. Libra \n2. Dolar \n3. Yen");
        String opc = leer.nextLine();
        switch(opc){
            case "1":
                    
                    Double libras = 0.86;
                    Double cambio = (divisa*libras)/1;
                    System.out.println("El cambio a Libras es: "+cambio+divi[2]);
                break;
            case "2":
                    Double dolar = 1.28611;
                    Double cambioD = (divisa*dolar)/1;
                    System.out.println("El cambio a Dolares es: "+cambioD+divi[0]);
                break;
            case "3": 
                    Double yen = 129.852;
                    Double cambioY = (divisa*yen)/1;
                    System.out.println("El cambio a Yenes es: "+cambioY+divi[1]);
                break;
            default:
                System.out.println("Ingrese solo las monedas indicadas");
                break;
        }
    
}
    }
}


