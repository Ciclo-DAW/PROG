package ejercicio4;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.println("cociente entero: " + numero1 / numero2);
        System.out.println("cociente real: " + numero1 / (double) numero2);
        System.out.println("resto : " + numero1 % numero2);
    }
}