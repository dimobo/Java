/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botiga;

import plantes.pkg.Productor1;

/**
 *
 * @author Dimobo
 */
public class Botiga1 {

    public static void main(String[] args) {
        
        System.out.println("Al executar el play des del netbeans s'executa la classe Botiga1 de dintre el paquet botiga.\n"
                + "El paquet plantes te la classe Productora1 amb un metode main també, l'executare justament al finalitzar\n"
                + "l'execució de Flor. Tens tota l'informació que puguis necesitar i el per que de les coses que he fet \n"
                + "Com a comentaris dintre les diferents classes. Tot seguit comença l'execució:\n\n");

        // Ara crearem les Flors.
        Flor[] taulaFlors = new Flor[3];
        taulaFlors[0] = new Flor("Rosa", "Europa");
        taulaFlors[1] = new Flor("Margarida", 10, "Europa");
        taulaFlors[2] = new Flor("Myosotis", 5, "Blau", "America");

        // Com podem veure si intentem extraure les dades de la flor 0 ens 
        // Sortira un seguit de lletres i numeros sense sentit.
        System.out.println("Objecte sense tractar:\n" + taulaFlors[0]);

        // Per a que ens doni l'informació que nosaltres volem saber en un
        // Format que puguem entendre he creat el metode FlorsCreades
        // Dins la classe flor, ja que aquest metode ens retorna les dades de
        // l'objecte en format llegible.
        System.out.println("\nExemple de dades tractades \n" + taulaFlors[0].FlorsCreades());
        // He de dir que també podria extraure el resultat de la següent forma:
//                System.out.println(taulaFlors[0].nom);
        // Però d'aquesta forma puc obtenir tots els atributs
        // Amb un format pre establert a part que també puc obtenir l'atribut
        // Petals que es privat ja que d'altra forma seria impossible ja que
        // Ens dona error: (he comentat la linea per que dona error, la pots desomentar.)
//        System.out.println(taulaFlors[0].petals);
//
        // Crearem un bucle ara per poder imprimir l'informació de totes les flors.
        System.out.println("\nImprimint informació de les flors que tenim:");
        for (int i = 0; i < Flor.total; i++) {
            System.out.println(taulaFlors[i].FlorsCreades());
        }

        System.out.println("\nFins aqui l'execució de Botiga1, ara donarem pas a l'execució de Productor1\n"
                + "Recordar que tens l'explicació dintre de les classes Especie Arbre i Productor1\n");
        
        Productor1.main(args);
    }

}
