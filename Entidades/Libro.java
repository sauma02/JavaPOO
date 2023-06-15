/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Entidades;

/**
 *
 * @author Admin
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numPa;
    
    public Libro(){
        
    }
    public Libro(int isbn, String titulo, String autor, int numPa){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPa=numPa;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPa() {
        return numPa;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPa(int numPa) {
        this.numPa = numPa;
    }
    
}
