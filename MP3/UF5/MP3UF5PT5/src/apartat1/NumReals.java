/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat1;

import java.util.Scanner;

/**
 *
 * @author dimobo
 */
public class NumReals {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String num = null;

        do {
            
            try {
                // Aqui estem demanant a l'usuari que introdueixi un numero real.
                System.out.println("Introdueix un numero real del tipus double:\nTambé s'accepta anotació científica.\nPer sortir del programa introdueix 0.0");
                num = ent.nextLine();
                // En aquesta linea establim el "estandar sobre el que antendrem com numero real double"
                String pattern="\\d+\\.\\d{1,2}([eE]\\d+)?";

                // Començarem amb les comprovacions per veure si s'ha introduit un numero valid, invalid o no s'han introduit dades.
                if (num.matches(pattern)) {
                    System.out.println("\nHas introduit un numero real de tipus double correcte!\n");
                }
                if (!num.matches(pattern)) {
                    System.out.println("\nHas introduit un valor incorrecte.\nEls numeros reals de tipus double estan composats per XX.XX\nOn les X son un numero.\n");
                }
                if (num.isEmpty()) {
                    System.out.println("\nNo has introduit ningun valor.\nEls numeros reals de tipus double estan composats per XX.XX\nOn les X son un numero.\n");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("No has introduït un valor correcte.\n");
                // La següent linea es important per netejar el cache del scanner per que si no entra en bucle
                // Infinit el programa.
                ent.nextLine();
            }

        } while (!"0.0".equals(num));

    }

}
