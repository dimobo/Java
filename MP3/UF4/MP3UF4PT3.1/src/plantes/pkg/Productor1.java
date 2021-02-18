/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantes.pkg;

/**
 *
 * @author Dimobo
 */
public class Productor1 {

    public static void main(String[] args) {
        // En aquesta classe anire més per feina ja que es molt semblant a la de botiga1
        // I alli ho tinc tot documentat amb el per que, no obstant igual documentare
        // En aquest fitxer.
//        
        // Igual que passa amb flors primer creare arbres.
        // String nom, String nacional, String tipusEscorça, String tipusRames, String ecosistema
        Arbre[] taulaArbres = new Arbre[3];
        taulaArbres[0] = new Arbre("Acacea", "Africa", "Llissa", "Ramificades", "sabana");
        taulaArbres[1] = new Arbre("Pi", "Europa", "Rugosa", "Simples", "montanya");
        taulaArbres[2] = new Arbre("Palmera", "America", "Rugosa", "Simples", "tropical");
        
        // Com podem veure l'objecte següent no es pot crear per que no tenim cap constructor
        // Dintre la classe arbre que pugui treballar sols amb els atributs que li donem.
//        taulaArbres[2] = new Arbre("Palmera", "America", "Rugosa");

        // Crearem un bucle ara per poder imprimir l'informació de tots els arbres.
        System.out.println("\nImprimint informació dels arbres que tenim:");
        for (int i = 0; i < Arbre.total; i++) {
            System.out.println(taulaArbres[i].ArbresCreats());
        }

    }

}
