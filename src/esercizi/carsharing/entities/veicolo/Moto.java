package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;

public class Moto extends VeicoloMotore {

    public Moto(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }

    @Override
    public Boolean needCasco() {
        return true;
    }

}
