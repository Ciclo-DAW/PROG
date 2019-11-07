/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
        import java.util.Scanner;
/**
 *
 * @author Brais
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        int casos;
        long d;
        casos = leo.nextInt();
        for (int i = 0; i < casos; i++) {
            d = leo.nextLong();
            System.out.println(d*d*d - (d-2)*(d-2)*(d-2));
            //completar la sentencia para escribir la salida
            //evidentemente, podéis añadir todas aquellas sentencias que necesiteis para
            //completar el ejercicio. En programaión nunca hay dos programas iguales
        }
    }
}
