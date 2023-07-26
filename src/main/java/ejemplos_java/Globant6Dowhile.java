/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Globant6Dowhile {
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
int suma = 0;
int num;
int cont= 0;
do{
    System.out.println("Ingrese 20 numeros");
    num = leer.nextInt();
    cont = cont +1;
    if(num<0){
        suma = 0;
    }else{
        suma = suma + num;
        System.out.println("Suma: "+suma);
    }
    if(cont==20){
        break;
    }

}while(num != 0);
if(num == 0){
    System.out.println("Se capturo el numero 0");
    System.out.println("Suma total hasta que se marco 0: "+ suma);
    
}else{
    System.out.println("Se han ingresado 20 numeros correctamente");
    System.out.println("Suma total: "+suma);
}


}                
}