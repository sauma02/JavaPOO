/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGlobant;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Ingrese 2 numeros enteros positivos");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
         
        while(flag == true){
           System.out.println("MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir");
           String opc = leer.nextLine();
        
        
        switch(opc){
            case "1":
                int suma = num + num2;
                System.out.println("La suma es: "+suma);
                continue;
            case "2":
                int resta = num - num2;
                System.out.println("La resta es: "+resta);
                continue;
            case "3":
                int multi = num * num2;
                System.out.println("La multiplicacion es: "+multi);
                continue;
            case "4":
                double div = num / num2;
                if(num2 == 0){
                    System.out.println("Error no se puede dividir por 0");
                }else{
                    System.out.println("La division es: "+div);
                }
                continue;
            case "5":
                System.out.println("¿Esta seguro que desea salir (S/N)?");
               String opc2 = leer.nextLine();
                switch(opc2.toLowerCase()){
                    case "s":
                    case "si":
                        System.out.println("Saliendo");
                        flag = false;
                        break;
                    case "n":
                    case "no":
                        System.out.println("Volviendo al menu principal..");
                        continue;
                    default:
                        System.out.println("Ingrese una opcion correcta");
                        break;
                }
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
               
                    
        }
        }
    }
    
}
