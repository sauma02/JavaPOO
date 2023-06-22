/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Entidades.Cuenta;
import EjerciciosPOO.Servicios.ServicioCuenta;

/**
 *
 * @author Admin
 */
public class ResolCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta();
        ServicioCuenta sc = new ServicioCuenta();
        sc.Cuenta(c1);
        sc.ingresar(c1);
        sc.retirar(c1);
        sc.consultarDatos(c1);
        sc.consultarSaldo(c1);
    }
    
}
