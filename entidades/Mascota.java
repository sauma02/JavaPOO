/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_programacion.entidades;

/**
 *
 * @author Admin
 */
public class Mascota {
    //Encapsular el tipo mascota
    //Se ponen en private para que desde afuera no se pueda acceder a los atributos sin un metodo SET o GET
    private String nombre;
    private String apodo;
    //Conejo, Perro, Gato, etc...
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    //Para crear un constructor public se declara public con el nombre de la clase
    public Mascota(){
        this.energia=1000;
    }
    //Constructor con argumentos
    public Mascota(String nombre, String apodo, String tipo){
        //Para poder asignar el valor que se ingrese en el constructor al atributo de la clase, 
        //se declara con la palabra reservada this(hace referencia a la clase en la que estamos)
        this.nombre = nombre;
        //Logica dentro de los constructores
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro")|| tipo.equals("Conejo") || tipo.equals("Carpincho")){
            this.tipo = tipo;
        }
            this.energia = 1000;
        this.apodo = apodo;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    //Crear SET, establece el valor, se crea como public para poder acceder por fuera de la clase
    //Los metodos inician en minuscula
    //Se establece los argumentos a recibir, en este caso el nombre, y con la palabra reservada this para que modifique a la clase
    public void setNombre(String nombre){
        //Se puede establecer logicas dentro de los setters
        if(nombre.length()>0 ){
            this.nombre = nombre;
            
        }
    }
       public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Comentar metodos o funciones
    //Funcion Destinada para pasear
    /**
     * 
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia = energia - energiaRestar;
        return energia;
        
     }
    //Funcion destinada a pasear por vueltas
    /**
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
        
     }
    
    //Crear GET, se crea como public para poder acceder por fuera de la clase, se establece sin argumentos
    //pero sin void pero si el tipo de variable, ya que devuelve un valor, en este caso el nombre, se establece return nombre
    //Este metodo sirve para traer el valor almacenado dentro de los atributos de un objeto
    public String getNombre(){
        //Se le puede poner this, pero no importa, ya que de igual manera al no tenerlo, devolver el atributo nombre seleccionado
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    //Esta funcion devuelve un mensaje formateadi segun cada mascota, es decir, segun cada objeto, 
    //ademas ya mostraria los atributos y no donde esta alojado
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", Energia=" + energia +'}';
    }
    
    
}
