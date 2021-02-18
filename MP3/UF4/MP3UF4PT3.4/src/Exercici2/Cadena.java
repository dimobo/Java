/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author dimobo
 */
public class Cadena implements java.lang.CharSequence {
    private char[] contingut;

    // Constructors
    public Cadena(int longitud) {
        if(longitud>0) contingut = new char[longitud];
    }

    public Cadena(char[] copia) {
        contingut = Arrays.copyOf(copia, copia.length);
    }
    
    // Getter i Setter
    public char[] getContingut() {
        return contingut;
    }

    public void setContingut(char[] contingut) {
        this.contingut = contingut;
    }
    
    //Mètodes de la interfície
    @Override
    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char charAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints(); //To change body of generated methods, choose Tools | Templates.
    }

}
