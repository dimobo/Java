/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici5;

/**
 *
 * @author dimobo
 */
// Primera interficie.
// Crearem la primera interficie amb un text simple per començar a practicar.
interface PrimeraInterficie {

    default void dirAlgo() {
        System.out.println("Hola, dic algo.");
    }
}

// D'aquesta manera la segona interficie exten la primera sense fer menció al metode.
//interface SegonaInterficie extends PrimeraInterficie {
//    
//
//}

// D'aquesta manera la segona interficie exten la primera reescribint el metode i fent-lo abstracte.
//interface SegonaInterficie extends PrimeraInterficie {
//    
//    void dirAlgo();
//}

// D'aquesta manera la segona interficie exten la primera redefinint el metode i fent-lo abstracte.
interface SegonaInterficie extends PrimeraInterficie {
    
    default void dirAlgo(){
        System.out.println("MIIIIAU.");
    }
}

public class Exercici5 {

}
