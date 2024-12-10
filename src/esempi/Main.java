package esempi;

import esempi.ereditarieta.Persona;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Marco", "Adriani");
        Persona p2 = new Persona();
        p2.nome = "Pippo";
        p1.dataNascita = LocalDate.of(1993, 9, 17);
        System.out.println(p1);
        System.out.println(p2);
        Persona p3 = new Persona("Marco", "Adriani", LocalDate.of(1993,9,17));
        System.out.println(p3);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p2));

        p1.meseMorte = Mese.DICEMBRE;
        System.out.println(p1.meseMorte.getNumMese());
        System.out.println("Quando so morto? " + p1.meseMorte.getStagione());
        System.out.println(Arrays.toString(Mese.values()));
        Mese enero = Mese.valueOf("GENNAIO");
        System.out.println(enero);

        Object[] oggetti = { p1, "ciao", 3};
        System.out.println(Arrays.toString(oggetti));
    }

}
