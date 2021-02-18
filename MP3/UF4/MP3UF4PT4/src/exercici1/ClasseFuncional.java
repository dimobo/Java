/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

/**
 *
 * @author Dimobo
 */
public class ClasseFuncional {

    // Aqui podem veure com implementem l'interficie com una classe anonima.
    // És static per que el crido des del metode main.
    static InterficieFuncional funcionaAnonima = new InterficieFuncional() {
        @Override
        // Aqui tenim l'implementació de la InterficieFuncional com classe anonima.
        // En resum el que fa es contar les lletres que te el text que li passem.
        // Contar quantes vegades es reteteix una lletra que li indiquem i dir-nos
        // Si les repeticions coincideixen amb el numero que li hem donat.
        public void metodeFuncional(String frase, char lletra, int num) {
            int lletresFrase = frase.length();
            int repetida = 0;
            boolean encertat;

            for (int i = 0; i < lletresFrase; i++) {
                if (frase.charAt(i) == lletra) {
                    repetida++;
                }
            }

            encertat = repetida == num;

            System.out.println("La frase tenia " + lletresFrase + " caracters\nLa lletra " + lletra + " ha sortit " + repetida + " vegades");
            if (encertat == true) {
                System.out.println("Has esncertat les repeticions de la lletra\n");
            } else {
                System.out.println("No has esncertat les repeticions de la lletra\n");
            }
        }
    };

    // Aqui tenim l'implementació de l'interficie com una lambda.
    // En aquesta implementació ens indica si en un text que li hem passat llegint sols
    // La quantitat de caracters que li indiquem apareix la lletra que li indiquem.
    // És estatic per que la crido des del metode main.
    static InterficieFuncional funcionaLambda = (String frase, char lletra, int num) -> {

        boolean surtLletra = false;

        for (int i = 0; i < num; i++) {
            if (frase.charAt(i) == lletra) {
                surtLletra = true;
                break;
            }
        }

        if (surtLletra == true) {
            System.out.println("La lletra" + lletra + " surt en el text.");

        } else {
            System.out.println("La lletra " + lletra + " no surt en el text.");
        }

    };

    // Aqui podem veure unes proves de les implementacions.
    public static void main(String[] args) {
        funcionaAnonima.metodeFuncional("Hola bon dia", 'o', 2);
        funcionaAnonima.metodeFuncional("Esta nit soparem al infern", 'a', 5);
        funcionaLambda.metodeFuncional("Este any a la lan party el imperio varas guanyara.", 'v', 10);
        funcionaLambda.metodeFuncional("Este any a la lan party el imperio varas guanyara.", 'y', 10);

    }
}
