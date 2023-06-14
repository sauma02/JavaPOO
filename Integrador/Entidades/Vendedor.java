/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_programacion.Integrador.Entidades;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Vendedor {
    private String nombre;
    private int dni;
    private double sueldoBasico;
    private double comisiones;
    private double sueldoMensual;
    private Date fechaInicio;
    
    //constructor por defecto

    public Vendedor() {
    }
//Constructor por defecto
    public Vendedor(String nombre, int dni, double sueldoBasico, double comisiones, double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    
}
