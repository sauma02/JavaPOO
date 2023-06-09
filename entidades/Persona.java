/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_programacion.entidades;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Persona {
    //Atributos
    //Constructor
    //Metodos
    public String nombre;
    public String apellido;
    public String dni;
    public Date nacimiento;
    //Se importa la libreria de Fechas
    public String pais;
    //ALT+INSERT para generar codigos
    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
    
}
