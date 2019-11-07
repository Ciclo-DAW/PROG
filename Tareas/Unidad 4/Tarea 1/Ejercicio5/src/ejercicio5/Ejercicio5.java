/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Brais
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numCasillas;
        int posicion;
        int tirada;
        Scanner leo = new Scanner(System.in);
        numCasillas = leo.nextInt();
        posicion = leo.nextInt();
        tirada = leo.nextInt();
        while (numCasillas != 0 && posicion != 0 && tirada != 0) {
            if(posicion + tirada == numCasillas){
                System.out.println(numCasillas);
            } else if(posicion + tirada > numCasillas){
                System.out.println(numCasillas - (posicion + tirada - numCasillas));
            } else {
                System.out.println(posicion + tirada);
            }

            numCasillas = leo.nextInt();
            posicion = leo.nextInt();
            tirada = leo.nextInt();


        }
    }
    
}
