package Ejercicio4;

import java.time.Year;

public class Frecuencia {
    private String nombre, apellido;
    private int dia, mes, ano;

    public Frecuencia(String nombre, String apellido, int dia, int mes, int ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int calcularEdad() {
        return Year.now().getValue() - ano;
    }

    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String rangoFrecuencia() {
        int max = frecuenciaMaxima();
        return (int)(max * 0.5) + " - " + (int)(max * 0.85);
    }
}