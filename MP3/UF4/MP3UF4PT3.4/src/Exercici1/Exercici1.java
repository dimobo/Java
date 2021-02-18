/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici1;

/**
 *
 * @author dimobo
 *
 */
// Priemr crearem l'interficie
interface PrimeraInterficie {

    // En aquest punt declararem la constant.
    static final int num = 4;

    // En aquest punt declararem el metode que volem implementar.
    void compareNums(int i);

}

// Aquesta sera la classe on volem implementar l'interficie i fer les proves pertinents.
public class Exercici1 implements PrimeraInterficie {

    public static void main(String[] args) {

        // Com podem veure podem llegir en numero de la interficie.
        System.out.println(num);

        // Aqui farem la prova de metode.
        Exercici1 num2 = new Exercici1();
        num2.compareNums(4);
        num2.compareNums(5);
        num2.compareNums(1);
        num2.compareNums(7);

    }

    // Implementació del metode compareNums.
    @Override
    public void compareNums(int i) {
        if (num < i) {
            System.out.println("El numero introduït és més gran");
        } else {
            System.out.println("El numero introduït no és més gran");

        }
    }

}
