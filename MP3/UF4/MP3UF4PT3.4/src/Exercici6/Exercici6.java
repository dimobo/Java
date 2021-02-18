/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici6;

/**
 *
 * @author dimobo
 */
// Aquesta es la primera interficie que creare.
interface PrimeraInterficie {

    void comu();
    
    // He mirat de sobrecarregar el metode i en aquet cas el metode s'importa i com a resultat tenim el metode comu
    // i el sobre carregat.
//    void comu(int i);

    String frase(int i);

    char lletra(char c);
}

// Aquesta es la segona interficie que creare.
interface SegonaInterficie {

    void comu();

    boolean certFals();

    double numReal();

}

// Aquesta es la classe que implementara les interficies
public class Exercici6 implements PrimeraInterficie, SegonaInterficie {

    // Com podem veure s'han importat tos els metodes sols que el metode comu que tenien les dos interficies sols s'ha importat una vegada, jo suposo que el que ha passat
    // es sobreescriptura.
    @Override
    public void comu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String frase(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char lletra(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean certFals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double numReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Com podem veure aqui tenim el metode sobrecarregat importat.
//    @Override
//    public void comu(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
