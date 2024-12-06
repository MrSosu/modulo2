package esempi;

import java.time.LocalDate;

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
    }

}
