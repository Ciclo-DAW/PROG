package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.print("Introduce el valor del radio del círculo/circunferencia: ");
        radio = teclado.nextDouble();
        System.out.println("");
        System.out.println("Superficie del círculo: " + Math.PI * radio * radio);
        System.out.println("Longitud de la circunferencia: " + 2 * Math.PI * radio);
//para el cálculo se utiliza el valor de la propiedad PI de la clase Math
//pero se puede utilizar sin ningún problema el valor numérico 3,14159 265
    }
}