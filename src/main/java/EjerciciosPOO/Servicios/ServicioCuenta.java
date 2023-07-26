/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Servicios;

import EjerciciosPOO.Entidades.Cuenta;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ServicioCuenta {
    Scanner leer = new Scanner(System.in);
    public void Cuenta(Cuenta c1){
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        c1.setDNI(leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        c1.setSaldoActual(leer.nextInt());
        
    }
    public Double ingresar(Cuenta c1){
        System.out.println("¿Cuanto dinero desea ingresar?");
        Double ing = leer.nextDouble();
        
        Double suma = ing + c1.getSaldoActual();
        Double entero = new Double(suma);
        int suma2 = entero.intValue();
       c1.setSaldoActual(suma2);
       return suma;
    }
    public Double retirar(Cuenta c1){
        
        System.out.println("Ingrese el valor a retirar");
        Double ret = leer.nextDouble();
        if(ret > c1.getSaldoActual()){
            System.out.println("No cuenta con el saldo suficiente");
            c1.setSaldoActual(0);
            double tot = 0.0;
            System.out.println("El saldo total quedo en: ");
            return tot;
            
        }else{
            
            Double reti = c1.getSaldoActual()-ret;
            Double entero = new Double(reti);
            int reti2 = entero.intValue();
            c1.setSaldoActual(reti2);
            System.out.println("Nuevo Saldo actual: "+c1.getSaldoActual());
            System.out.println("Usted a retirado: ");
            return reti;
        }
    }
    public void extraccionRapida(Cuenta c1){
        double porce = 0.2;
        double veinte = porce * c1.getSaldoActual();
        if(veinte == 0){
            System.out.println("No tiene saldo en su cuenta");
        }else{
            double resto = c1.getSaldoActual()-veinte;
            Double entero = new Double (resto);
            int resto2 = entero.intValue();
            c1.setSaldoActual(resto2);
            System.out.println("Usted ha retirado el 20% de su saldo: "+resto+" nuevo saldo actual "+c1.getSaldoActual());
        }
    }
    public int consultarSaldo(Cuenta c1){
        int saldo = c1.getSaldoActual();
        System.out.println("Su saldo es de: ");
        return saldo;
    }
    public void consultarDatos(Cuenta c1){
        System.out.println("Su numero de cuenta: "+c1.getNumeroCuenta());
        System.out.println("Su DNI es: "+c1.getDNI());
        
    }
    
    
}
