package esempi.ereditarieta;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Studente studente1 = new Studente("Marco", "Adriani", 123);
        Studente studente2 = new Studente("Giulia", "Rossi", 678);
        Professore professore1 = new Professore("Signorina", "Rottenmeier",
                LocalDate.of(1975, 8, 7), 15, "Analisi");
        Professore professore2 = new Professore("Fabio", "Junior");

        Persona[] persone = {studente1, studente2, professore1, professore2};
        for (Persona p : persone) {
            if (p.getClass().equals(Studente.class)) {
                Studente studente = (Studente) p;
                System.out.println("La matricola dello studente è: " + studente.getMatricola());
            } else if (p instanceof Professore) {
                Professore professore = (Professore) p;
                System.out.println("Il corso insegnato è: " + professore.getCorsoInsegnato());
            }
            else {
                System.out.println("Tipo non riconosciuto");
            }
        }

    }

}
