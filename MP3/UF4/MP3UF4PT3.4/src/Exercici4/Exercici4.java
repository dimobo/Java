/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici4;

/**
 *
 * @author dimobo
 */
// Primera interficie
interface PrimeraInterficie extends SegonaInterficie, TerceraInterficie {
    
    String dirFrase(String s);
    int sumarLletres(int i);
    
}

// Segona interficie
interface SegonaInterficie {

    char primeraLletra(char c);
}

// Tercera interficie
interface TerceraInterficie {
    
    int llargadaText(int i);
}

// Com podem veure en les tres interfaces tenim com a minim un metode.

// Aquesta classe es la que implementara l'interficie.
public class Exercici4 implements PrimeraInterficie {

    
    // Com podem veure s'han d'implementar tots els metodes ja que d'altra forma simplement peta el programa.
    // Aixó es degut a que els metodes que es passen "com abstractes" 
    // Es passen per defecte com a public (es a dir que es poden veure des de cualsevol lloc.)
    // I "com son abstractes" estem obligats a implementar-los.
    @Override
    public String dirFrase(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sumarLletres(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char primeraLletra(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int llargadaText(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}