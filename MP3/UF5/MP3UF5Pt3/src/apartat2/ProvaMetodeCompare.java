/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartat2;

import java.util.Arrays;

/**
 *
 * @author Dimobo
 */
public class ProvaMetodeCompare {

    public static void main(String[] args) {
        // Primer crearem i donarem valors a les arrays per pdoer-les comparar despres.
        int[] a, b;

        a = new int[5];
        a[0] = 1;
        a[1] = 9;
        a[2] = 9;
        a[3] = 8;
        a[4] = 5;

        b = new int[10];
        b[0] = 1;
        b[1] = 9;
        b[2] = 9;
        b[3] = 8;
        b[4] = 5;
        b[5] = 1;
        b[6] = 2;
        b[7] = 3;
        b[8] = 4;
        b[9] = 1;

        // En aquest exemple esperem de résultat 0 perquè els valors que comprovem son  
        //iguals.
        int compare = Arrays.compare(a, 0, 4, b, 0, 4);
        System.out.println(compare);

        //En aquest cas esperem com resultat 1 ja que els números que comparem de la 
        //primera array són superiors als de la segona.
        compare = Arrays.compare(a, 0, 4, b, 5, 9);
        System.out.println(compare);

        //En aquest cas esperem com resultat -1 ja que els números que comparem de la 
        //primera array són inferiors als de la segona.
        compare = Arrays.compare(a, 0, 4, b, 1, 9);
        System.out.println(compare);
    }

}
