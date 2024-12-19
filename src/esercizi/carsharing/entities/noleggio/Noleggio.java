package esercizi.carsharing.entities.noleggio;

import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Veicolo;
import esercizi.carsharing.validators.Validator;

import java.time.LocalDateTime;

public class Noleggio {

    // attributi
    private static Integer idTot = 0;
    private Integer id;
    private final Veicolo veicolo;
    private final Utente utente;
    private LocalDateTime start;
    private LocalDateTime end;

    // costruttori
    public Noleggio(Veicolo veicolo, Utente utente) {
        Validator.requireNotNull(veicolo);
        Validator.requireNotNull(utente);
        this.id = ++idTot;
        this.veicolo = veicolo;
        this.utente = utente;
        this.start = LocalDateTime.now();
    }

    public Noleggio(Veicolo veicolo, Utente utente, LocalDateTime start) {
        Validator.requireNotNull(veicolo);
        Validator.requireNotNull(utente);
        Validator.requireDateTimeAfter(start, LocalDateTime.now());
        this.id = ++idTot;
        this.veicolo = veicolo;
        this.utente = utente;
        this.start = start;
    }

    // getter e setter
    public Integer getId() {
        return id;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public Utente getUtente() {
        return utente;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        if (this.start.isBefore(LocalDateTime.now())) {
            this.start = start;
        }
        else System.out.println("Noleggio già iniziato, non puoi piu modificare la data di inizio");
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Boolean isNoleggioAttivo(LocalDateTime time) {
        return this.start.isBefore(time) && this.end == null;
    }

    @Override
    public String toString() {
        return "Noleggio{" +
                "id=" + id +
                ", veicolo=" + veicolo +
                ", utente=" + utente +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
