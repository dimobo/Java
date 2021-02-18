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
public class Arbre extends Especie {

    public Arbre() {
    }

    // Per crear un nou arbre sols ho acceptarem en el cas de que tinguem tots els valors.
    public Arbre(String nom, String nacional, String tipusEscorça, String tipusRames, String ecosistema) {
        this.nom = nom;
        this.nacional = nacional;
        this.tipusEscorça = tipusEscorça;
        this.tipusRames = tipusRames;
        // Indiquem que agarre el metode del pare ja que al fill no tenim valors establerts.

        if (ecosistema.equals("montanya")) {
            super.ArbreMontanya();
        } else if (ecosistema.equals("sabana")) {
            super.ArbreSabana();
        } else {
            super.ArbreTropical();
        }
        total++;
    }

    // A diferencia de la Classe Flor arbre si te acces a tipus i clima per que
    // Esta dintre del mateix paquet.
    public Arbre(String nom, char tipus) {
        this.nom = nom;
        this.tipus = tipus;
    }

    // Ara crearem uns atributs propis per als arbres.
    public String tipusEscorça;
    String tipusRames;
    static int total;

    // Al igual que amb Flor crearem un metode per llistar tots els atributs
    // Per poder llistar amb facilitat inclus atributs provats de la classe.
    String ArbresCreats() {
        return nom + " " + nacional + " " + tipusEscorça + " " + tipusRames + " " + tipus + " " + clima;
    }

}
