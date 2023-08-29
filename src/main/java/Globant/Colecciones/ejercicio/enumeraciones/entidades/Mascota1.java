/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Globant.Colecciones.ejercicio.enumeraciones.entidades;

import Globant.Colecciones.ejercicio.enumeraciones.RazaPerruna;
import Globant.Colecciones.ejercicio.enumeraciones.SexoAnimall;

/**
 *
 * @author Admin
 */
public class Mascota1 <T> {
    //Se establece dentro de <> la letra T para representar el generico, de esta manera tambien, se asigna en raza, dando a entener que el enum se implementara en ese atributo
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private T raza;
    private SexoAnimall sexo;
    
    private int energia;

    public Mascota1() {
    }

    public Mascota1(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public SexoAnimall getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimall sexo) {
        this.sexo = sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    @Override
    public String toString() {
        return "Mascota1{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }

   
    
    
}
