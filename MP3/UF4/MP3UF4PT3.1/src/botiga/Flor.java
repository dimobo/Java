/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botiga;

// Hem de realitzar auqest import per que estan en paquets diferents.
import plantes.pkg.Especie;

/**
 *
 * @author Dimobo
 */
public class Flor extends Especie {

    // Primer crearem els constructors de la classe,
    // He creat diferents constructors per probar 
    // Diferents combinacions amb els atributs.
    public Flor() {
    }

    public Flor(String nom, String nacional) {
        this.nom = nom;
        this.nacional = nacional;
        total++;
    }

    public Flor(String nom, int petals, String nacional) {
        this.nom = nom;
        this.petals = petals;
        this.nacional = nacional;
        total++;
    }

    public Flor(String nom, int petals, String color, String nacional) {
        this.nom = nom;
        this.petals = petals;
        this.color = color;
        this.nacional = nacional;
        total++;
    }

    // En aquest constructor intentarem indicar-li un atribut que
    // Teoricament no ha heredar ja que es de tipus no modifier.
    // COm que dona error l'he comentat.
//    public Flor(String nom, char tipus) {
//        this.nom=nom;
//        this.tipus=tipus;
//    }
//    
    // Aqui he creat alguns tributs propis per a flor
    private int petals;
    String color;
    static int total;
//    
//    
//    Aquest metode l'he creat despres, esta explicat en 
//    Botiga 1 per que.

    String FlorsCreades() {
        return nom + " " + nacional + " " + petals + " " + color;
    }

}
