package esempi.ereditarieta;

import java.time.LocalDate;

public class Professore extends Persona {

    private int anniServizio;
    private String corsoInsegnato;

    public Professore(String nome, String cognome) {
        super(nome, cognome);
        this.anniServizio = 0;
        this.corsoInsegnato = "";
    }

    public Professore(String nome,
                      String cognome,
                      LocalDate dataNascita,
                      int anniServizio,
                      String corsoInsegnato) {
        super(nome, cognome, dataNascita);
        this.anniServizio = anniServizio;
        this.corsoInsegnato = corsoInsegnato;
    }

    public void inserisciVoto() {
        System.out.println("STECCATO");
    }

    public int getAnniServizio() {
        return anniServizio;
    }

    public void setAnniServizio(int anniServizio) {
        this.anniServizio = anniServizio;
    }

    public String getCorsoInsegnato() {
        return corsoInsegnato;
    }

    public void setCorsoInsegnato(String corsoInsegnato) {
        this.corsoInsegnato = corsoInsegnato;
    }
}
