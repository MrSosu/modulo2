package esempi.ereditarieta;

import esempi.Mese;

import java.time.LocalDate;

public class Persona {

    public static Integer idCounter = 0;
    public Integer id;
    public String nome;
    public String cognome;
    public LocalDate dataNascita;
    public Mese meseMorte;
    public String luogoNascita;
    public String codiceFiscale;

    // se non definisco alcun costruttore viene aggiunto da Java il costruttore di default


    public Persona(String nome, String cognome) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, LocalDate dataNascita) {
        this(nome, cognome);
        this.dataNascita = dataNascita;
    }

    public Persona() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Mese getMeseMorte() {
        return meseMorte;
    }

    public void setMeseMorte(Mese meseMorte) {
        this.meseMorte = meseMorte;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", meseMorte=" + meseMorte +
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
