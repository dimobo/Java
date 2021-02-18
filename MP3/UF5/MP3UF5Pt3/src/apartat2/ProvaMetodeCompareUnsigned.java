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
public class ProvaMetodeCompareUnsigned {

    public static void main(String[] args) {
        // Primer crearem i donarem valors a les arrays per pdoer-les comparar despres.
        int[] a, b;

        a = new int[5];
        a[0] = 1;
        a[1] = 9;
        a[2] = 9;
        a[3] = 8;
        a[4] = 5;

        b = new int[5];
        b[0] = 1;
        b[1] = 9;
        b[2] = 9;
        b[3] = 8;
        b[4] = 5;

        // En aquest exemple esperem de résultat 0 perquè els valors que comprovem son  
        //iguals.
        int compare = Arrays.compareUnsigned(a, b);
        System.out.println(compare);

        b[0] = 0;
        //En aquest cas esperem com resultat 1 ja que els números que comparem de la 
        //primera array són superiors als de la segona.
        compare = Arrays.compareUnsigned(a, b);
        System.out.println(compare);

        b[0] = 9;
        //En aquest cas esperem com resultat -1 ja que els números que comparem de la 
        //primera array són inferiors als de la segona.
        compare = Arrays.compareUnsigned(a, b);
        System.out.println(compare);
    }

}
