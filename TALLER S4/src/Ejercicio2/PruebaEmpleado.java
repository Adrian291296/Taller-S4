package Ejercicio2;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Empleado 1");
        System.out.print("Nombre: ");
        String n1 = sc.nextLine();

        System.out.print("Apellido: ");
        String a1 = sc.nextLine();

        System.out.print("Salario mensual: ");
        double s1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEmpleado 2");
        System.out.print("Nombre: ");
        String n2 = sc.nextLine();

        System.out.print("Apellido: ");
        String a2 = sc.nextLine();

        System.out.print("Salario mensual: ");
        double s2 = sc.nextDouble();

        Empleado e1 = new Empleado(n1, a1, s1);
        Empleado e2 = new Empleado(n2, a2, s2);

        System.out.println("\nSalarios anuales:");
        System.out.println(e1.getNombre() + ": " + e1.getSalario() * 12);
        System.out.println(e2.getNombre() + ": " + e2.getSalario() * 12);

        e1.setSalario(e1.getSalario() * 1.10);
        e2.setSalario(e2.getSalario() * 1.10);

        System.out.println("\nCon aumento:");
        System.out.println(e1.getNombre() + ": " + e1.getSalario() * 12);
        System.out.println(e2.getNombre() + ": " + e2.getSalario() * 12);
    }
}