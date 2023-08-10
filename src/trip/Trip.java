/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trip;

/**
 *
 * @author John Paul
 */
import javax.swing.JOptionPane;

public class Trip {
    public static void main(String[] args) {
        GestorGastos gestorGastos = new GestorGastos();

        gestorGastos.agregarAmigo(new Amigo("Josua", 0));
        gestorGastos.agregarAmigo(new Amigo("Greivin", 0));
        gestorGastos.agregarAmigo(new Amigo("Guillermo", 0));
        gestorGastos.agregarAmigo(new Amigo("Andres", 0));
        gestorGastos.agregarAmigo(new Amigo("Tavo", 0));
        gestorGastos.agregarAmigo(new Amigo("David", 0));

        
        boolean agregarNuevoGasto = true;
        while (agregarNuevoGasto) {
            String descripcion = JOptionPane.showInputDialog("Ingrese el local donde se realizo el gasto o describa de que fue el gasto:");
            String participantes = JOptionPane.showInputDialog("Ingrese los nombres de los participantes separados por comas:");
            String quienPago = JOptionPane.showInputDialog("Ingrese el nombre de la persona que pagó:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del gasto:"));
            String moneda = JOptionPane.showInputDialog("Ingrese la moneda:");

            Gasto nuevoGasto = new Gasto(descripcion, participantes, quienPago, monto, moneda);
            gestorGastos.agregarGasto(nuevoGasto);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro gasto?", "Agregar Gasto",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta != JOptionPane.YES_OPTION) {
                agregarNuevoGasto = false;
            }
        }

        
        gestorGastos.analizarDeudas();
    }
}
