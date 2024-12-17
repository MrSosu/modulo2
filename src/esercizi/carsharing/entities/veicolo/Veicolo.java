package esercizi.carsharing.entities.veicolo;

import java.time.LocalDateTime;

public abstract class Veicolo implements Casco {

    // attributi
    protected static Integer idTot = 0;
    protected Integer id;
    protected Double prezzo;
    protected Coordinata coordinata;

    // costruttore
    public Veicolo(Double prezzo) {
        this.id = ++idTot;
        this.prezzo = prezzo;
        this.coordinata = new Coordinata(0d,0d); // er garage
    }

    // getter e setter
    public Integer getId() {
        return id;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Coordinata getCoordinata() {
        return coordinata;
    }

    public void setCoordinata(Coordinata coordinata) {
        this.coordinata = coordinata;
    }

    public Boolean isDisponibile(LocalDateTime time) {
        return false;
    }

}
