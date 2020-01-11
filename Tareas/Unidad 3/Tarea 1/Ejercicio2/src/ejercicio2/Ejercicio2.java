/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Libro l1 = new Libro("978-84-8181-227-5", "El último muerto", "Fernando Lalana", 4);
        l1.visualizaDatosLibro();

        System.out.println();

        l1.setUnidades(3);
        l1.visualizaDatosLibro();

        System.out.println();

        Libro l2 = new Libro();
        System.out.print("Introduzca el ISBN: ");
        l2.setIsbn(teclado.nextLine());
        System.out.print("Introduzca el titulo: ");
        l2.setTitulo(teclado.nextLine());
        System.out.print("Introduzca el autor: ");
        l2.setAutor(teclado.nextLine());
        System.out.print("Introduzca el numero de unidades: ");
        l2.setUnidades(teclado.nextInt());

        l2.visualizaDatosLibro();

    }
    
}
