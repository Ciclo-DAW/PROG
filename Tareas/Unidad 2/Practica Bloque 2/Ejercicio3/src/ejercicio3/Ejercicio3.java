package ejercicio3;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio;
        int iva;
        System.out.print("Introduce el precio del producto: ");
        precio = teclado.nextDouble();
        System.out.print("Introduce el IVA a aplicar: ");
        iva = teclado.nextInt();
        System.out.println("\nIVA: " + precio * (iva / 100.0));
        System.out.println("Precio final: " + (precio + (precio * (iva / 100.0))));
    }
}