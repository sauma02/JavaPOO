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
public class GlobantEjemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        char [] chara = new char[frase.length()];
        for (int i = 0; i < chara.length; i++) {
                chara[i]=frase.charAt(i);
                
        }
        for (int i = 0; i < chara.length; i++) {
            switch(chara[i]){
                case 'a':
                case 'A':
                    chara[i]='@';
                     break;
                case 'e':
                case 'E':
                    chara[i]='#';
                     break;
                case 'i':
                case 'I':
                    chara[i]='$';
                     break;
                case 'o':    
                case 'O':
                    chara[i]='%';
                     break;
                case 'u':
                case 'U':
                    chara[i]='*';
                    break;
                default:
                    break;
            }
            System.out.print(chara[i]);
            
        }
        
    }
    
}
