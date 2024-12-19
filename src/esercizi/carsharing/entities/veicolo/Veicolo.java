package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.admin.Admin;
import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.validators.Validator;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Veicolo implements Casco {

    // attributi
    protected static Integer idTot = 0;
    protected Integer id;
    protected Double prezzo;
    protected Coordinata coordinata;

    // costruttore
    public Veicolo(Double prezzo) {
        Validator.requireGreaterThen(prezzo, 0d);
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
        List<Noleggio> myNoleggi = Admin.getNoleggiByVeicoloId(this.id);
        for (Noleggio n : myNoleggi) {
            if (n.isNoleggioAttivo(time)) {
                return false;
            }
        }
        return true;
    }

}
