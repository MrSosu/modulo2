package esempi.ereditarieta;

import java.time.LocalDate;

public class Studente extends Persona implements Comparable<Studente> {

    private Integer matricola;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public Studente(String nome, String cognome, LocalDate dataNascita, int matricola) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
    }

    public Studente() {}

    public void prenotaEsame() {
        System.out.println("ESAME PRENOTATO");
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", meseMorte=" + meseMorte +
                ", dataNascita=" + dataNascita +
                ", luogoNascita='" + luogoNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Studente studente = (Studente) obj;
        if (this.id.hashCode() == studente.id.hashCode()
                && this.matricola.hashCode() == studente.matricola.hashCode()
                && this.codiceFiscale.hashCode() == studente.codiceFiscale.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Studente studente) {
        /* il compareTo ritorna:
        - Un numero NEGATIVO se l'oggetto corrente è più "piccolo"
        - 0 se sono uguali nell'ordinamento
        - Un numero POSITIVO se l'oggetto corrente è più "grande"
         */
        return this.matricola - studente.matricola;
    }
}
