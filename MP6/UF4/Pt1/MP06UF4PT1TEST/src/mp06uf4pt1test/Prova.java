/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf4pt1test;

import JavaBean.ProducteJavaBean;
import java.beans.*;

/**
 *
 * @author dimobo
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProducteJavaBean p = new ProducteJavaBean();
        Receptor r = new Receptor();
        Vetador v = new Vetador();

        p.addPropertyChangeListener(r);
        p.addVetoableChangeListener(v);

        try {
            // Primer iniciarem els valors que no estan sent observats per notificar i comprobar canvis.
            System.out.println("Iniciem els valors que no estan sent vigilats.\n");
            p.setNumSerie(1);
            p.setDenominacio("Española");
            p.setFabricant("Josemanuel Montero");
            p.setAnyFabricacio(1995);
//            p.setCaracTecniques(0, "Procastinar");
//            p.setCaracTecniques(1, "Llum");

            // Ara passarem a introduïr els valors "critics" es a dir els que estem vigilant.
            System.out.println("Iniciem els valors que estan sent vigilats.\n");
            p.setStockActual(10);
            p.setStockMinim(2);
            p.setPreuPublic(40);

            // Ara anirem a forçar que surtin errors amb les comparacions que tenim del stock i del preu.
            System.out.println("Ara forarem un error en cadascun dels cassos.\n");
            p.setStockActual(1);
            p.setPreuPublic(0);

        } catch (PropertyVetoException e) {
            PropertyChangeEvent pc = e.getPropertyChangeEvent();
            System.out.format("Error al canviar el preu, el preu no pot ser en cap cas inferior a 0\nPreu actual %s\n", p.getPreuPublic());
        }

        // Ara mirarem com han quedat els valors:
        System.out.println("\nAra mirarem com han quedat els valors finalment.");
        System.out.println(p.getNumSerie());
        System.out.println(p.getDenominacio());
        System.out.println(p.getFabricant());
        System.out.println(p.getAnyFabricacio());
        System.out.println(p.getStockActual());
        System.out.println(p.getStockMinim());
        System.out.println(p.getPreuPublic());


    }

}
