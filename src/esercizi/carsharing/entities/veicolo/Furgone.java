package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;

public class Furgone extends VeicoloMotore {

    public Furgone(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }

    @Override
    public Boolean needCasco() {
        return false;
    }
}
