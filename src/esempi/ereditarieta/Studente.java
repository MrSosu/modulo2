package esempi.ereditarieta;

import java.time.LocalDate;

public class Studente extends Persona {

    private int matricola;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public Studente(String nome, String cognome, LocalDate dataNascita, int matricola) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
    }

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
}
