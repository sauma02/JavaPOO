/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Entidades;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Figura {
    private double area, perimetro, base, altura, radio, apotema, lado, diagonalM, diagonalMe;
private String tipoFigura;


    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setDiagonalM(double diagonalM) {
        this.diagonalM = diagonalM;
    }

    public void setDiagonalMe(double diagonalMe) {
        this.diagonalMe = diagonalMe;
    }

    public double getLado() {
        return lado;
    }

    public double getDiagonalM() {
        return diagonalM;
    }

    public double getDiagonalMe() {
        return diagonalMe;
    }
    
    

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getApotema() {
        return apotema;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    public Figura(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de figura");
        this.tipoFigura = input.nextLine();
    }
    public void calcularAreaPerimetro(){
        Scanner input = new Scanner(System.in);
        switch(tipoFigura.toLowerCase()){
            case "cuadrado":
            case "rectangulo":
                System.out.println("Ingrese la base y altura");
                this.base=input.nextDouble();
                this.altura=input.nextDouble();
                this.perimetro=base*2 + altura *2;
                this.area=base * area;
                
                break;
            case "circulo":
                System.out.println("Ingresar Radio");
                this.radio = input.nextDouble();
                this.perimetro = Math.PI*(radio*2);
                this.area = Math.PI*(radio*radio);
             break;
            case "triangulo":
                System.out.println("Ingrese la base, la altura y el lado");
                this.base=input.nextDouble();
                this.altura=input.nextDouble();
                this.lado=input.nextDouble();
                  this.perimetro=lado *3;
                this.area=base*altura/2;
                break;
            case "hexagono":
                System.out.println("Ingresa el lado");
                this.lado=input.nextDouble();
                System.out.println("Ingresa la apotema");
                this.apotema=input.nextDouble();
                this.perimetro=lado*6;
                this.area=(perimetro*apotema)/2;
                break;
            case "Pentagono":
                System.out.println("Ingresa el lado");
                this.lado=input.nextDouble();
                System.out.println("Ingresa la apotema");
                this.apotema=input.nextDouble();
                this.perimetro=lado*5;
                this.area=(perimetro*apotema)/2;
                break;
            case "rombo":
                System.out.println("Ingresar lado");
                this.lado=input.nextDouble();
                System.out.println("Ingrese la diagonal mayor");
                this.diagonalM=input.nextDouble();
                System.out.println("Ingrese la diagonal menor");
                this.diagonalMe=input.nextDouble();
                this.perimetro=lado*4;
                this.area=(diagonalM*diagonalMe)/2;
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("La figura tipo "+tipoFigura+" tiene un perimetro de "+perimetro+"cm y un area de "+area+"cm^2");
    }
}
