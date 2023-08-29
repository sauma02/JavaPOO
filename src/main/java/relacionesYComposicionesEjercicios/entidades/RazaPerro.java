/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package relacionesYComposicionesEjercicios.entidades;

/**
 *
 * @author Admin
 */
public enum RazaPerro {
     BEAGLE(32131,"Beagle"), COCKER(2323, "Cocker"), PITBULL(553, "Pitbull"), BORDER_COLLIE(33411, "Border Collie");
    private Integer codigo;
    private String valor;

    private RazaPerro(Integer codigo, String valor) {
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
