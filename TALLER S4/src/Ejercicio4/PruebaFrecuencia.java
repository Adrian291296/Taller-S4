package Ejercicio4;

import java.util.Scanner;

public class PruebaFrecuencia {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String n = sc.nextLine();

        System.out.print("Apellido: ");
        String a = sc.nextLine();

        System.out.print("Año nacimiento: ");
        int ano = sc.nextInt();

        Frecuencia f = new Frecuencia(n, a, 1,1,ano);

        System.out.println("Edad: " + f.calcularEdad());
        System.out.println("Frecuencia máxima: " + f.frecuenciaMaxima());
        System.out.println("Rango: " + f.rangoFrecuencia());
    }
}