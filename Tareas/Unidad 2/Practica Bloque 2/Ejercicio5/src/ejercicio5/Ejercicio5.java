package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horasTotales;
        int semanas;
        int dias;
        int horas;
        System.out.print("Introduce el número de horas: ");
        horasTotales = teclado.nextInt();
        System.out.println("\nEl total de " + horasTotales + " horas equivale a:");
        semanas = horasTotales / (24 * 7);
        horasTotales = horasTotales% (24 * 7);
        dias = horasTotales/24;
        horas = horasTotales % 24;
        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
    }
}