/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dimobo
 */
public class InicialsExpReg {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;

        // Aqui demanem el text al usuari.
        System.out.println("Introdueix un text per a analitzar.");
        text = ent.nextLine();

        // En la següent linea creem el patro del pattern.
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(text);
        
        System.out.println(m);

        while (m.find()) {
            System.out.print(m.group());
        }
    }

}
