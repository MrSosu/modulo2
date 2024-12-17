package esercizi.carsharing.entities.veicolo;

public class Bicicletta extends Veicolo {

    public Bicicletta(Double prezzo) {
        super(prezzo);
    }

    @Override
    public Boolean needCasco() {
        return true;
    }
}
