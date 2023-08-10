/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trip;

/**
 *
 * @author John Paul
 */
public class Amigo {
    private String nombre;
    private double deuda;

    public Amigo(String nombre, double deuda) {
        this.nombre = nombre;
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void aumentarDeuda(double monto) {
        deuda += monto;
    }

    public void reducirDeuda(double monto) {
        deuda -= monto;
    }
}
