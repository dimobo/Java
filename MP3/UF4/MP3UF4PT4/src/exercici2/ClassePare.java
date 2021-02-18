/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

/**
 *
 * @author Dimobo
 */
// Aquesta es la classe pare amb els atributs tal i com es demanen.
public class ClassePare {
    private int atributParePrivat;
    static String atributPareStatic;
    
    // Aqui tenim els fills tal i com es demanen.
    public static class ClasseFillaInternaStatica{
        
    }
    
    protected class ClasseFillaInternaProtected{
        
    }
    
    // Aqui tenim instanciats els objectes de la classe pare al igual que de les filles internes.
    ClassePare objectePare = new ClassePare();
    ClasseFillaExterna objecteFillExtern = new ClasseFillaExterna();
    ClasseFillaInternaStatica objecteFillInternStatic = new ClasseFillaInternaStatica();
    ClasseFillaInternaProtected objecteFillInternProtected = new ClasseFillaInternaProtected();
}
