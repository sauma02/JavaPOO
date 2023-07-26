/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Globant8Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Equipo = new String[5];
        Scanner leer = new Scanner(System.in);
        
        for(int i = 0;i<Equipo.length;i++){
            Equipo[i]=leer.nextLine();
            
        }
        for(int i = 0; i<Equipo.length; i++){
            System.out.println("["+Equipo[i]+"]");
        }
    }
    
}
