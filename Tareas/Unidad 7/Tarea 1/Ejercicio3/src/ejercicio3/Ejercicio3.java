/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numCasos;
        String gusta = "";
        String ingrediente = "";
        Collection<String> ingredientesBuenos = new ArrayList<>();
        Collection<String> ingredientesMalos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        numCasos = teclado.nextInt();

        while (numCasos != 0) {
            for (int i = 0; i < numCasos; i++) {
                gusta = teclado.next();
                ingrediente = teclado.next();

                while (!ingrediente.equals("FIN")) {
                    if (gusta.equals("SI:")) {
                        ingredientesBuenos.add(ingrediente);
                    } else {
                        ingredientesMalos.add(ingrediente);
                    }

                    ingrediente = teclado.next();
                }
            }

            ingredientesMalos.removeAll(ingredientesBuenos);
            for(int i = 0; i < ingredientesMalos.size(); i++){
                if(i == ingredientesMalos.size() - 1){
                    System.out.print(((ArrayList<String>) ingredientesMalos).get(i));
                } else {
                    System.out.print(((ArrayList<String>) ingredientesMalos).get(i) + " ");
                }
            }

            ingredientesBuenos.clear();
            ingredientesMalos.clear();
            System.out.println();
            numCasos = teclado.nextInt();
        }
    }
}
