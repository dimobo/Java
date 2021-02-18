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
// Aquesta es la classe filla.
public class ClasseFillaExterna extends ClassePare {
    
    // Aqui tenim els objectes de les classes externes i les internes instanciats.
    ClassePare objectePareExtern = new ClassePare();
    ClasseFillaExterna objecteFill = new ClasseFillaExterna();
    ClasseFillaInternaStatica objecteFillExternStatic = new ClasseFillaInternaStatica();
    ClasseFillaInternaProtected objecteFillExternProtected = new ClasseFillaInternaProtected();
    
}
