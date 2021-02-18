/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinyot;

/**
 *
 * @author dimobo
 */
// Aquesta classe l'he usat per a fer tests.
public class Partida {

    public static void main(String[] args) {

        // Primer imprimirem el triunfo per veure quin pal te ventatja.
        // Tinc per a imprimir-ho dos vegades per assegurarme que no canvia.
        System.out.println("El triunfo de la partida és: " + Carta.TRIUNFO);
//        System.out.println("Segona vegada que mostrem Triunfo: " + Carta.TRIUNFO);
//
//        //Aquesta linea es un test per comprobar com imprimir les cartes amb el numero i el palo.
//        System.out.println(Carta.C1.tipCarta());
//
        // Aqui tenim un quants exemples de partida
        System.out.println("\nExemples amb dos cartes:");
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C8, Carta.C11).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C21, Carta.C4).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C16, Carta.C17).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C3, Carta.C34).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C19, Carta.C40).tipCarta());

        // Imprimirem de nou el triunfo per mirar si ha canviat.
        System.out.println("\nEl triunfo de la partida és: " + Carta.TRIUNFO);
//        
        // Aqui tenim exemples de partida en 4 cartes.
        System.out.println("\nExemples amb quatre cartes:");
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C8, Carta.C11, Carta.C1, Carta.C32).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C21, Carta.C4, Carta.C14, Carta.C22).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C16, Carta.C17, Carta.C40, Carta.C31).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C3, Carta.C34, Carta.C12, Carta.C22).tipCarta());
        System.out.println("La carta guanyadora ha estat: " + Carta.guanyarMa(Carta.C19, Carta.C40, Carta.C1, Carta.C2).tipCarta());

    }

}
