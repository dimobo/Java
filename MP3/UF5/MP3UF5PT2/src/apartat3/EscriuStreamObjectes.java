/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat3;

// Primer importarem lo necessari per poder trevallar amb objectes i el I/O
import java.io.*;

/**
 *
 * @author dimobo
 */
public class EscriuStreamObjectes {

    public static void main(String[] args) throws IOException {

        // Aqui donem valors als atributs de l'objecte.
        Alumne al = new Alumne();
        al.nom = "Carlos";
        al.inicial = 'G';
        al.num = 10;
        al.repetin = false;
        
        // Amb aqueste liniea exportem l'objecte al fitxer objecte.data
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("objecte.data")))) {
            out.writeObject(al);
        }

    }

}

// D'aquesta classe crearem l'objecte.
class Alumne implements Serializable {

    String nom;
    int num;
    char inicial;
    boolean repetin;

}
