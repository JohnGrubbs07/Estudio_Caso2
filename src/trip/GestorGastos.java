/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trip;

/**
 *
 * @author John Paul
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorGastos {
    private ArrayList<Amigo> amigos;
    private ArrayList<Gasto> gastos;

    public GestorGastos() {
        amigos = new ArrayList<>();
        gastos = new ArrayList<>();
    }

    public Amigo getAmigo(String nombre) {
        for (Amigo amigo : amigos) {
            if (amigo.getNombre().equals(nombre)) {
                return amigo;
            }
        }
        return null;
    }

    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
        double montoPorAmigo = gasto.getMonto() / gasto.getParticipantes().split(",").length;
        String[] participantes = gasto.getParticipantes().split(",");
        
        for (String participante : participantes) {
            Amigo amigo = getAmigo(participante.trim());
            if (amigo != null) {
                amigo.aumentarDeuda(montoPorAmigo);
            }
        }
    }

    public void analizarDeudas() {
        StringBuilder resultado = new StringBuilder("Análisis de Deudas:\n");
        for (Amigo amigo : amigos) {
            resultado.append(amigo.getNombre()).append(" debe ").append(amigo.getDeuda()).append(" dólares\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    // Agregar métodos para análisis de deuda específico por amigo

    public void agregarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    void Gasto(Gasto gasto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
