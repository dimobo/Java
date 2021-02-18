/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat3;

import java.io.*;

/**
 *
 * @author dimobo
 */
public class LligStreamObjectes {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("objecte.data")));
            String nom;
            int num;
            char inicial;
            boolean repetin;
            try {
                nom = (String) in.readObject();
                inicial = (char) in.readObject();
                num = (int) in.readObject();
                repetin = (boolean) in.readObject();
                System.out.println(nom + " " + inicial + " amb el numero " + num + " esta repetint curs? " + repetin);

            } catch (EOFException e) {
                System.out.println("Error EOE");
            }
        } finally {

        }
    }

}
