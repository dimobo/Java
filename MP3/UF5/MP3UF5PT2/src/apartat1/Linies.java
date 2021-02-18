/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat1;

// Aqui realitzem les importacions necessaries per a poder llegir fitxers
// I poder escriure text a un altre fitxer de txt.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author dimobo
 */
public class Linies {

    public static void main(String[] args) throws IOException {

        // En aquest punt estem preparant els encarregats de llegir el fitxer i escriurel.
        // He decidit separar en 2 el encarregat de llegir els fitxers per evitar possibles problemes.
        // I tenir d'aquesta manera tindre el codi més segmentat.
        BufferedReader inputStream1 = null;
        BufferedReader inputStream2 = null;
        BufferedReader inputStream3 = null;

        PrintWriter outputStream = null;

        // Ara crearem un try per intentar executar el nostre codi de forma segura
        // I poder tractar-lo en cas de que sorgeixin exepcions.
        try {
            // En aquest punt estem acabant de preparar els encarregats de llegir i ecriure en els fitxers
            // també indicant amb quin fitxer han de trevallar.
            inputStream1 = new BufferedReader(new FileReader("origen1.txt"));
            inputStream2 = new BufferedReader(new FileReader("origen2.txt"));
            outputStream = new PrintWriter(new FileWriter("fusio.txt"));

            // He decidit crear dos variables string pel mateix motiu que amb inputStreams1 i 2
            // Per evitar possibles errors i per tenir les dades segmentades.
            String primer, segon;

            // En aquest punt entrarem en un bucle que llegira les dades dels fitxers
            // I si no estan en null escriura la linia al fitxer de fusio.
            do {
                primer = inputStream1.readLine();
                segon = inputStream2.readLine();

                if (primer != null) {
                    outputStream.println(primer);
                }
                if (segon != null) {
                    outputStream.println(segon);
                }

            } while (primer != null && segon != null);
        // Aqui tractariem les exepcions.
        } finally {
            if (inputStream1 != null) {
                inputStream1.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

        }
        
        // Ara obrirem un altre try que sen encarregara de llegir el fitxer fusio,
        // Li he canviat el nom a la variable i tot simplement per que es pugui veure més clar.
        try {
            String tercer;

            inputStream3 = new BufferedReader(new FileReader("fusio.txt"));

            do {
                tercer = inputStream3.readLine();

                if (tercer != null) {
                    System.out.println(tercer);
                }

            } while (tercer != null);
        } finally {

            if (inputStream3 != null) {
                inputStream3.close();
            }
        }

    }

}
