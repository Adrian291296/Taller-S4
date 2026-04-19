package Ejercicio3;

import javax.swing.JOptionPane;

public class PruebaFecha {public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Año:"));

        Fecha f = new Fecha(dia, mes, ano);

        JOptionPane.showMessageDialog(null, f.mostrarFecha());
    }
}