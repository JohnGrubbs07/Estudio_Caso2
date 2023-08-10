/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trip;

/**
 *
 * @author John Paul
 */
public class Gasto {
    private String descripcion;
    private String participantes;
    private String quienPago;
    private double monto;
    private String moneda;

    public Gasto(String descripcion, String participantes, String quienPago, double monto, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.monto = monto;
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getParticipantes() {
        return participantes;
    }

    public String getQuienPago() {
        return quienPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getMoneda() {
        return moneda;
    }
}
