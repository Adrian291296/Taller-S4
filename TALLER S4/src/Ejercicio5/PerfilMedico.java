package Ejercicio5;

public class PerfilMedico {
    private String nombre, apellido, sexo;
    private int dia, mes, ano;
    private double altura, peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int ano, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    public int edad() {
        return 2026 - ano;
    }

    public double bmi() {
        return peso / Math.pow(altura / 100, 2);
    }

    public int frecuenciaMaxima() {
        return 220 - edad();
    }

    public String rangoFrecuencia() {
        int max = frecuenciaMaxima();
        return (int)(max*0.5) + " - " + (int)(max*0.85);
    }
}