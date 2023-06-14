/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_programacion.Integrador.sueldos;

import POO_programacion.Integrador.Entidades.Vendedor;
import POO_programacion.Integrador.VendedorServicio.VendedorServicio;

/**
 *
 * @author Admin
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
    VendedorServicio vs = new VendedorServicio();
    Vendedor v1 = vs.altaVendedor();
    vs.SueldoMensual(v1);
    vs.vacaciones(v1);
    
    }
    
}
