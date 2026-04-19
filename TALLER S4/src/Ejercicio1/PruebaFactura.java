package Ejercicio1;

import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Número de pieza:");
        String desc = JOptionPane.showInputDialog("Descripción:");
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));

        Factura f = new Factura(num, desc, cant, precio);

        JOptionPane.showMessageDialog(null,"Monto total: " + f.obtenerMontoFactura());
    }
}