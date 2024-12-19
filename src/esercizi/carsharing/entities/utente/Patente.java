package esercizi.carsharing.entities.utente;

import esercizi.carsharing.validators.Validator;

import java.time.LocalDate;

public class Patente {

    // attributi
    private static Integer idTot = 0;
    private Integer id;
    private String numeroPatente;
    private LocalDate scadenza;
    private TipoPatente tipoPatente;
    private Utente utente;

    // costruttori
    public Patente(String numeroPatente, LocalDate scadenza, TipoPatente tipoPatente, Utente utente) {
        Validator.matchingPattern(numeroPatente, "^[A-Z]{2}\\d{7}[A-Z]$\n");
        Validator.requireDateAfter(scadenza, LocalDate.now());
        Validator.requireNotNull(tipoPatente);
        Validator.requireNotNull(utente);
        this.id = ++idTot;
        this.numeroPatente = numeroPatente;
        this.scadenza = scadenza;
        this.tipoPatente = tipoPatente;
        this.utente = utente;
    }

    // getter e setter
    public Integer getId() {
        return id;
    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public void setNumeroPatente(String numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public TipoPatente getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(TipoPatente tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
