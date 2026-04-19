package Ejercicio5;

import javax.swing.JOptionPane;

public class PruebaPerfilMedico {public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String sexo = JOptionPane.showInputDialog("Sexo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Año nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (cm):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));

        PerfilMedico p = new PerfilMedico(nombre, apellido, sexo,1,1,ano,altura,peso);

        JOptionPane.showMessageDialog(null,
                "Edad: " + p.edad() +
                        "\nBMI: " + p.bmi() +
                        "\nFrecuencia máx: " + p.frecuenciaMaxima() +
                        "\nRango: " + p.rangoFrecuencia() +
                        "\n\nTabla BMI:\n<18.5 Bajo\n18.5-24.9 Normal\n25-29.9 Sobrepeso\n30+ Obeso");
    }
}