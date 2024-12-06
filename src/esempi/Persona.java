package esempi;

import java.time.LocalDate;

public class Persona {

    public static Integer idCounter = 0;
    public Integer id;
    public String nome;
    public String cognome;
    public LocalDate dataNascita;
    public String luogoNascita;
    public String codiceFiscale;

    // se non definisco alcun costruttore viene aggiunto da Java il costruttore di default

    public Persona() {
        this.id = ++idCounter;
    }

    public Persona(String nome, String cognome) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, LocalDate dataNascita) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", luogoNascita='" + luogoNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // la prima cosa è verificare se obj è una Persona
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return persona.nome.equals(this.nome) && persona.cognome.equals(this.cognome);
    }
}
