/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Cadena;

/**
 *
 * @author Admin
 */
public class ServicioCadena {
    Cadena c1 = new Cadena();
    
    public void mostrarVocales(Cadena c1){
        int cont = 0;
        String frase = c1.getFrase();
        char arr [] = new char[frase.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = frase.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'O':
                case 'o':
                case 'u':
                case 'U':
                    cont ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\nLa frase cuenta con "+cont+" vocales");
        
    }
    public void revertirFrase(Cadena c1){
        String frase = c1.getFrase();
        char arr [] = new char[frase.length()];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = frase.charAt(i);
        }
          for (int i = 0; i < frase.length(); i++) {
            frase = frase.substring(arr.length-1);
              System.out.print(frase);
        }
    }
}
