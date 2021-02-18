/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat2;

// Primer importarem tot el necessari per poder llegir el fitxer dades.dat
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author dimobo
 */
public class LligStreamDades {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // El primer que farem es crear n try amb el que també indicarem un nom per al encarregat de llegir les dades i el fitxer
        // Del que te extraure les dades.
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dades.dat")))) {

            // Despres prepararem les variables.
            String nom;
            char inicial;
            int num;
            boolean repetin;

            try {
                // En aquet punt simplement extraurem les dades i les imprimirem per pantalla amb un sout.
                    nom = in.readUTF();
                    inicial = in.readChar();
                    num = in.readInt();
                    repetin = in.readBoolean();
                    System.out.println(nom + " " + inicial + " amb el numero "+ num + " esta repetint curs? " + repetin);
                    

            } catch (EOFException e) {
                System.out.println("Error de EOFException");
            }

        }
    }

}
