package esercizi.carsharing.entities.utente;

import java.time.LocalDate;

public class Utente {

    // attributi
    private static Integer idTot = 0;
    private Integer id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String codiceFiscale;
    private Boolean hasCasco;
    private Patente patente;

    // costruttori
    public Utente(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, Boolean hasCasco) {
        this.id = ++idTot;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.hasCasco = hasCasco;
    }

    public Utente(String nome, LocalDate dataNascita, String cognome, String codiceFiscale, Patente patente, Boolean hasCasco) {
        this(nome, cognome, dataNascita, codiceFiscale, hasCasco);
        this.patente = patente;

    }

    // getter e setter
    public Integer getId() {
        return id;
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public Boolean getHasCasco() {
        return hasCasco;
    }
    public void setHasCasco(Boolean hasCasco) {
        this.hasCasco = hasCasco;
    }
}
