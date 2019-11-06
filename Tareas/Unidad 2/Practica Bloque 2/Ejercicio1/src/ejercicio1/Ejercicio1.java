package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        float real;
        double realLargo;
        boolean logico = true;
        System.out.print("Escribe un nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Escribe un valor para la variable de tipo float: ");
        real = teclado.nextFloat();
        System.out.print("Escribe un valor para la variable de tipo double: ");
        realLargo = teclado.nextDouble();
        System.out.println("");
        System.out.println("nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("primeros tres caracteres del nombre: " + nombre.substring(0, 3));
        System.out.println("valor float elevado al cubo: " + real * real * real);
        System.out.println("valor double elevado al cubo: " + Math.pow(realLargo, 3));
        System.out.println("raíz cuadrada del valor double: " + Math.sqrt(realLargo));
        System.out.println("valor de la variable boolean: " + logico);
    }
}