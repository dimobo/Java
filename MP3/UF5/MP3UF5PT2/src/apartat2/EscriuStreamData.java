/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat2;

// Primer importarem tot el necesari per escriure les dades.
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author dimobo
 */
public class EscriuStreamData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // En aquest punt estem creant les variables que contindran els valors que demanarem dels alumnes.
        Scanner ent = new Scanner(System.in);
        String rep, nom;
        int num = 0;
        char inicial;
        boolean repetin = false;

        // Començarem aqui amb el proces de recol·lecció de dades.
        do {
            System.out.println("Introuduïu el nom d'un alumne:");
            nom = ent.nextLine();
            if ("".equals(nom)) {
                System.out.println("No heu introduït cap nom.");
            }
        } while ("".equals(nom));

        System.out.println("Introuduïu Una l'inicial del primer cognom de l'alumne:");
        inicial = ent.next().charAt(0);

        do {
            System.out.println("Introuduïu el numero de l'alumne:");
            num = ent.nextInt();
            if (num == 0) {
                System.out.println("No heu introduït cap numero \no el numero introduït no es valid.");
            }
        } while (num == 0);

        do {
            System.out.println("L'alumne esta repetint? Si o No?");
            rep = ent.nextLine();
            if ("".equals(rep)) {
                System.out.println("No heu respost a la pregunta de forma correcta.\n");
            }
            if ("Si".equals(rep)) {
                repetin = true;
            }
            if ("No".equals(rep)) {
                repetin = false;
            }
        } while ("".equals(rep));
        
        // Ara seguirem amb el proces d'escriptura de les dades al fitxer dades.dat
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dades.dat")))) {
            out.writeUTF(nom);
            out.writeChar(inicial);
            out.writeInt(num);
            out.writeBoolean(repetin);
        }

    }

}
