/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Entidades;

/**
 *
 * @author Admin
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int distancia = 0;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(int t) {
        this.tipo = tipo;
    }
    public int getDistancia(){
        return distancia;
    }
    public void moverse(int t){
        
       
        switch(tipo.toLowerCase()){
            case "automovil":
                 distancia = 3*t;
                break;
            case "motocicleta":
                 distancia = 2*t;
                 break;
            case "bicicleta":
               distancia = 1*t;
               break;
            default:
                distancia = 0;
                System.out.println("Vehiculo no encontrado");
                break;
                  
                }
        System.out.println("El vehiculo "+marca+" avanzo: "+distancia+" metros");
    }
    public void frenar(){
         
        switch(tipo.toLowerCase()){
            case "automovil":
            case "motocicleta":
                 distancia += 2;
             break;
             
                
            case "bicicleta":
               distancia = distancia;
               break;
            default:
                distancia = 0;
                System.out.println("Vehiculo no encontrado");
                break;
                  
                }
        System.out.println("El vehiculo "+marca+" se detuvo a los: "+distancia+" metros");
    }
}
