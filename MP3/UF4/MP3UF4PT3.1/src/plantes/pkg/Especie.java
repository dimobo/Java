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
public class Especie {

    // Aqui estem creant els atributs que tindra com a base una Especie
    // Ja sigui Arbre o Flor (que son les seves filles)
    // El que esperem es que Arbre tingui acces a tots els atributs però
    // Flor sols a nom i nacionalitat.
    public String nom;
    protected String nacional;
    char tipus;
    String clima;

    // Ara crearem alguns metodes que podrem aprofitar per als arbres.
    // Simplement predefinirem els atributs tipus:
    // S (seca) R (regadiu)
    // I el clima que viuen.
    void ArbreSabana() {
        tipus = 'S';
        clima = "calid";
    }

    void ArbreMontanya() {
        tipus = 'S';
        clima = "fred";

    }

    void ArbreTropical() {
        tipus = 'R';
        clima = "calid";

    }

}
