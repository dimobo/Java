/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat4;

import java.util.Scanner;

/**
 *
 * @author dimobo
 */
public class Recorrer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String linia;
        char caracter;
        boolean majusc = true, ordre = true;
        int opcio = 0;

        // Primer crearem un bucle per forçar el introduïr un text que no esigui buit.
        do {
            System.out.println("Introuduïu el text a tractar:");
            linia = ent.nextLine();
            if (linia.isEmpty()) {
                System.out.println("\nNo heu introduït cap text.\n");
            }
        } while (linia.isEmpty());

        // En aquest cas no ens cal crear un bucle ja que el char no ens deixara seguir
        // Fins que no li indiquem un valor.
        System.out.println("Introuduïu el caracter a buscar:");
        caracter = ent.next().charAt(0);

        // Ara crearem un bucle amb un menu per que l'usuari pugui decidir si vol distingir entre majúscules 
        // I minúscules a l'hora de comparar el text.
        do {

            try {
                System.out.println("Vols distingir entre majúscules i minúscules?\n1) Si \n2) No");
                opcio = ent.nextInt();

                switch (opcio) {
                    case 1:
                        majusc = true;
                        break;
                    case 2:
                        majusc = false;
                        break;
                    default:
                        System.out.println("No has introduït un valor correcte.\n");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("No has introduït un valor correcte.\n");
                // La següent linea es important per netejar el cache del scanner per que si no entra en bucle
                // Infinit el programa.
                ent.nextLine();
            }
        } while (opcio != 1 && opcio != 2);

        // Es encessari reiniciar el valor de l'opcio per al switch.
        opcio = 0;

        // En aquest cas crearem un bucle com l'anterior però per que l'usuari pugui decidir l'ordre de lectura del text.
        do {

            try {
                System.out.println("Vols buscar de dreta a esquerra o d'esquerra a dreta?\n1) Esquerra a Dreta \n2) Dreta a Esquerra");
                opcio = ent.nextInt();

                switch (opcio) {
                    case 1:
                        ordre = true;
                        break;
                    case 2:
                        ordre = false;
                        break;
                    default:
                        System.out.println("No has introduït un valor correcte.\n");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("No has introduït un valor correcte.\n");
                // La següent linea es important per netejar el cache del scanner per que si no entra en bucle
                // Infinit el programa.
                ent.nextLine();
            }
        } while (opcio != 1 && opcio != 2);
        
        // Ara en aquest punt entrarem a tractar el text, primer tenim que saber en quina direcció el volem llegir.
        // Ja que depen de com necessitarem un bucle que va sumant index o un bucle que va restan index.
        // Despres hem de saber si volem diferenciar majuscules de minuscules o no.

        // Aqui tenim els bucles que llegeixen d'esquerra a dreta, per lo que han de sumar index.
        if (ordre == true) {
            if (majusc == true) {
                for (int i = 0; i < linia.length(); i++) {
                    if (linia.charAt(i) == caracter) {
                        System.out.println("La lletra ha aparegut en la possició " + linia.indexOf(caracter, i));
                    }
                }
            }
            if (majusc == false) {
                // En aquest bucle no volem diferenciar majuscules de minuscules per lo que he decidit convertir tot el text
                // A lowcase per que sigui més facil de contar.
                linia = linia.toLowerCase();
                caracter = Character.toLowerCase(caracter);
                for (int i = 0; i < linia.length(); i++) {
                    if (linia.charAt(i) == caracter) {
                        System.out.println("La lletra ha aparegut en la possició " + linia.indexOf(caracter, i));
                    }
                }
            }

        }

        // Aqui tenim els bucles que llegeixen de dreta a esquerra, per lo que tenen que restar index en lloc de sumar-lo.
        if (ordre == false) {
            if (majusc == true) {
                for (int i = linia.length() - 1; i >= 0; i--) {
                    if (linia.charAt(i) == caracter) {
                        System.out.println("La lletra ha aparegut en la possició " + linia.lastIndexOf(caracter, i));
                    }
                }

            }
            if (majusc == false) {
                // En aquest bucle no volem diferenciar majuscules de minuscules per lo que he decidit convertir tot el text
                // A lowcase per que sigui més facil de contar.
                linia = linia.toLowerCase();
                caracter = Character.toLowerCase(caracter);
                for (int i = linia.length() - 1; i >= 0; i--) {
                    if (linia.charAt(i) == caracter) {
                        System.out.println("La lletra ha aparegut en la possició " + linia.lastIndexOf(caracter, i));
                    }
                }

            }

        }

    }

}
