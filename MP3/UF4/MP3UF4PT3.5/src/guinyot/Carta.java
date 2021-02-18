/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinyot;

import java.util.Random;

/**
 * @author dimobo
 */
// Aquest priemr enum es el que contindra les cartes.
public enum Carta {
    // Els següents coranta registres representen les 40 cartes que podem tenir.
    // Podem veure que el enum conte dintre dos enums, un per al tipus de carta i l'altre
    // Pel palo de la carta.
    C1(Tip.REI, Pal.OROS),
    C2(Tip.CAVALL, Pal.OROS),
    C3(Tip.SOTA, Pal.OROS),
    C4(Tip.SET, Pal.OROS),
    C5(Tip.SIS, Pal.OROS),
    C6(Tip.CINC, Pal.OROS),
    C7(Tip.QUATRE, Pal.OROS),
    C8(Tip.TRES, Pal.OROS),
    C9(Tip.DOS, Pal.OROS),
    C10(Tip.AS, Pal.OROS),
    C11(Tip.REI, Pal.COPES),
    C12(Tip.CAVALL, Pal.COPES),
    C13(Tip.SOTA, Pal.COPES),
    C14(Tip.SET, Pal.COPES),
    C15(Tip.SIS, Pal.COPES),
    C16(Tip.CINC, Pal.COPES),
    C17(Tip.QUATRE, Pal.COPES),
    C18(Tip.TRES, Pal.COPES),
    C19(Tip.DOS, Pal.COPES),
    C20(Tip.AS, Pal.COPES),
    C21(Tip.REI, Pal.ESPASA),
    C22(Tip.CAVALL, Pal.ESPASA),
    C23(Tip.SOTA, Pal.ESPASA),
    C24(Tip.SET, Pal.ESPASA),
    C25(Tip.SIS, Pal.ESPASA),
    C26(Tip.CINC, Pal.ESPASA),
    C27(Tip.QUATRE, Pal.ESPASA),
    C28(Tip.TRES, Pal.ESPASA),
    C29(Tip.DOS, Pal.ESPASA),
    C30(Tip.AS, Pal.ESPASA),
    C31(Tip.REI, Pal.BASTOS),
    C32(Tip.CAVALL, Pal.BASTOS),
    C33(Tip.SOTA, Pal.BASTOS),
    C34(Tip.SET, Pal.BASTOS),
    C35(Tip.SIS, Pal.BASTOS),
    C36(Tip.CINC, Pal.BASTOS),
    C37(Tip.QUATRE, Pal.BASTOS),
    C38(Tip.TRES, Pal.BASTOS),
    C39(Tip.DOS, Pal.BASTOS),
    C40(Tip.AS, Pal.BASTOS);

    // Tot seguit tenim un constructor necessari per a l'enum.
    private final Tip tipCarta;
    private final Pal palCarta;

    Carta(Tip tipCarta, Pal palCarta) {
        this.tipCarta = tipCarta;
        this.palCarta = palCarta;
    }

    // Els seguents metodes son metodes que he creat jo per a poder fer proves per
    // Veure com podia extraure les dades dels diferents enums.
    String tipCarta() {
        return tipCarta + " " + palCarta;
    }

    Pal palCarta() {
        return palCarta;
    }

    // Aqui obtenim un triunfo de forma aleatoria gracies al metode obtenirTriunfo
    // Que tenim a la classe pal.
    static final Pal TRIUNFO = Pal.obternirTriunfo();

    // Aquest metode ens mira les cartes i retorna la carta guanyadora tenint en compte primer
    // El Triunfo, despres l'ordre de jugada ja que sols passarem a comprovar valors de les cartes
    // Si les dues cartes jugades son del mateix pal, despres mira el valor de la carta i
    // Per ultim mira el numero de la carta (pel cas de que les cartes valen 0) 
    static Carta guanyarMa(Carta primera, Carta segona) {
        if (primera.palCarta == TRIUNFO && segona.palCarta != TRIUNFO) {
            return primera;
        }
        if (primera.palCarta != TRIUNFO && segona.palCarta == TRIUNFO) {
            return segona;
        }
        if (primera.palCarta == segona.palCarta) {
            if (primera.tipCarta.valCarta > segona.tipCarta.valCarta) {
                return primera;
            }
            if (primera.tipCarta.valCarta < segona.tipCarta.valCarta) {
                return segona;
            }
            if (primera.tipCarta.valCarta == segona.tipCarta.valCarta) {
                if (primera.tipCarta.numCarta > segona.tipCarta.numCarta) {
                    return primera;
                } else {
                    return segona;
                }
            }
        }
        return primera;
    }

    // Aquest metode es igual que l'anterior però funciona amb 4 cartes.
    static Carta guanyarMa(Carta primera, Carta segona, Carta tercera, Carta quarta) {
        if (primera.palCarta == TRIUNFO && segona.palCarta != TRIUNFO && tercera.palCarta != TRIUNFO && quarta.palCarta != TRIUNFO) {
            return primera;
        }
        if (primera.palCarta != TRIUNFO && segona.palCarta == TRIUNFO && tercera.palCarta != TRIUNFO && quarta.palCarta != TRIUNFO) {
            return segona;
        }
        if (primera.palCarta != TRIUNFO && segona.palCarta != TRIUNFO && tercera.palCarta == TRIUNFO && quarta.palCarta != TRIUNFO) {
            return tercera;
        }
        if (primera.palCarta != TRIUNFO && segona.palCarta != TRIUNFO && tercera.palCarta != TRIUNFO && quarta.palCarta == TRIUNFO) {
            return quarta;
        }

        // En aquet cas no fare la resta de comparacions per que son moltes i 
        // El codi és igual que en el anterior guanyar ma.
        return primera;
    }

}

// En aquest segon enum tindrem informació sobre els pals.
enum Pal {
    OROS, COPES, ESPASA, BASTOS;

    // El seguen metode tenim el que jo utilitzo per obtenir el triunfo de forma aleatoria.
    static final Pal obternirTriunfo() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

// Aquest enum ens guardara quin tipus de carta podem tenir i els seus valors.
enum Tip {
    REI(12, 4),
    CAVALL(11, 2),
    SOTA(10, 3),
    SET(7, 0),
    SIS(6, 0),
    CINC(5, 0),
    QUATRE(4, 0),
    TRES(3, 10),
    DOS(2, 0),
    AS(1, 11);

    // A partir d'aqui tenim les cariables que necesitem tenir dintre del enum i el constructor del
    // Enum.
    final int numCarta;
    final int valCarta;

    Tip(int numCarta, int valCarta) {
        this.numCarta = numCarta;
        this.valCarta = valCarta;
    }

}
