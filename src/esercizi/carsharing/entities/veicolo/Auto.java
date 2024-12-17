package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;

public class Auto extends VeicoloMotore {

    public Auto(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }

    @Override
    public Boolean needCasco() {
        return false;
    }

}
