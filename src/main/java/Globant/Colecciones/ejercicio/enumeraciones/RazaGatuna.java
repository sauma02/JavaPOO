/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Globant.Colecciones.ejercicio.enumeraciones;

/**
 *
 * @author Admin
 */
public enum RazaGatuna {
      PERSA(32131,"Persa"), SIAMES(2323, "Siames"), NARANJA(553, "Naranja"), STRAY(33411, "Stray");
    private Integer codigo;
    private String valor;

    private RazaGatuna(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

}
