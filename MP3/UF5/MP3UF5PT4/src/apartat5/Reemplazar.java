/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat5;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dimobo
 */
public class Reemplazar {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner ent2 = new Scanner(System.in);
        String text1, text2, fitxerDefault = "text.txt", fitxerUser1, fitxerUser2;
        int opcio = 0, cnt = 0;
        boolean continuar = false, guardar = false;
        File fitxer = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = null;

        // Primer pregutnarem a l'usuari si vol indicar un fitxer sobre el que treballarà el programa
        // O si ja li va bé usar el fitxer per defecte, antes de seguir amb el programa mirarem que el fitxer
        // Existeix realment.
        do {
            System.out.println("Introdueix el nom del fitxer que vols usar.\nPer defecte: " + fitxerDefault);
            fitxerUser1 = ent.nextLine();

            if (!fitxerUser1.isEmpty()) {
                fitxer = new File(fitxerUser1);
                if (!fitxer.exists()) {
                    System.out.println("\nEl fitxer introduit no existeix.\n");
                }
            } else {
                fitxer = new File(fitxerDefault);
            }
        } while (!fitxer.exists());

        // En aquest punt entrarem a la lectura del fitxer (ja sigui el per defecte o l'indicat per l'usuari)
        try {
            fileReader = new FileReader(fitxer);
            bufferedReader = new BufferedReader(fileReader);
            stringBuilder = new StringBuilder("");
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Estem llegint el fitxer omitin els salts de linea.
                stringBuilder.append(linea + "\n");
            }

            System.out.println("Contingut del fitxer: \n" + stringBuilder.toString());

        } catch (IOException e) {
            System.out.println("Excepció mentres es llegia el fitxer: " + e.getMessage());
        }

        // Ara demanarem a l'usuari que ens indique el text a buscar dintre del fitxer, 
        // No permetrem text buit.
        do {
            System.out.println("\nIntrouduïu el text a buscar:");
            text1 = ent.nextLine();
            if (text1.isEmpty()) {
                System.out.println("\nNo heu introduït cap text.\n");
            }
        } while (text1.isEmpty());

        // Ara li demanarem a l'usuari que ens indique el text pel que tenim que substituïr el buscat,
        // En aquest cas si permetrem una cadena buida.
        System.out.println("\nIntrouduïu el text a reemplaçar:");
        text2 = ent.nextLine();

        // En aquest pun preguntarem a l'usari si vol seguir amb el programa, lo ideal seria
        // Seguir amb el programa dintre del case però per evitar tabulacions a part de tenir el codi
        // Més separat i facil de llegir no seguire amb ell dintre el case.
        do {
            try {
                System.out.println("\nVols continuar amb el programa?\n1) Si \n2) No");
                opcio = ent.nextInt();

                switch (opcio) {
                    case 1:
                        continuar = true;
                        break;
                    case 2:
                        continuar = false;
                        break;
                    default:
                        System.out.println("No has introduït un valor correcte.\n");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("No has introduït un valor correcte.\n");
                // La següent linea es important per netejar el cache del scanner per que si no entra en bucle
                // Infinit el programa.
                ent.nextLine();
            }
        } while (opcio != 1 && opcio != 2);

        // Com ja he dit el codi que ve a partir d'ara tindria que estar dintre del case però he decidit mourel aqui fora
        // Per netejar un poc les tabulacions i que sigui un poc més senzill de llegir.
        if (continuar == true) {
            // Aquest bucle el que fara es recorrer el stringBuilder i comparar-lo amb el text1 i indicar
            // En quins llocs ha aparegut la paraula a buscar.
            for (int i = 0; i < stringBuilder.length(); i++) {
                try {
                    if (stringBuilder.substring(i, i + text1.length()).equals(text1)) {
                        System.out.println("La lletra ha aparegut en la possició " + stringBuilder.indexOf(text1, i) + " Fins la possició " + (stringBuilder.indexOf(text1, i) + text1.length()));
                        cnt++;
                        stringBuilder.delete(i, i + text1.length());
                        stringBuilder.insert(i, text2);
                    }
                } catch (java.lang.StringIndexOutOfBoundsException e) {
                    i = stringBuilder.length();
                };
            }
            // Aqui podem veure les modificacions del text.
            System.out.println("\nContingut nou del fitxer: \n" + stringBuilder.toString());
            System.out.println("S'han substituït " + cnt + " paraules");

            // Ara preguntarem a l'usuari si vol guardar els canvis realitzats al text.
            do {
                try {
                    System.out.println("\nVols guardar els canvis?\n1) Si \n2) No");
                    opcio = ent.nextInt();

                    switch (opcio) {
                        case 1:
                            // Ara li preguntarem si vol guardar sobre el fitxer que ha indicat, per defecte o un nou fitxer.
                            if (fitxerUser1.isEmpty()) {
                                System.out.println("\nIndica en quin fitxer vols guardar,\nPer defecte " + fitxer);
                                fitxerUser2 = ent2.nextLine();
                                if (fitxerUser2.isEmpty()) {
                                    try (FileOutputStream oS = new FileOutputStream(fitxer)) {
                                        oS.write(stringBuilder.toString().getBytes());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try (FileOutputStream oS = new FileOutputStream(fitxerUser2)) {
                                        oS.write(stringBuilder.toString().getBytes());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }

                            } else {
                                System.out.println("\nIndica en quin fitxer vols guardar,\nPer defecte " + fitxerUser1);
                                fitxerUser2 = ent2.nextLine();
                                if (fitxerUser2.isEmpty()) {
                                    try (FileOutputStream oS = new FileOutputStream(fitxerUser1)) {
                                        oS.write(stringBuilder.toString().getBytes());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try (FileOutputStream oS = new FileOutputStream(fitxerUser2)) {
                                        oS.write(stringBuilder.toString().getBytes());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("No has introduït un valor correcte.\n");
                            break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("No has introduït un valor correcte.\n");
                    // La següent linea es important per netejar el cache del scanner per que si no entra en bucle
                    // Infinit el programa.
                    ent.nextLine();
                }
            } while (opcio != 1 && opcio != 2);
        }
    }
}
