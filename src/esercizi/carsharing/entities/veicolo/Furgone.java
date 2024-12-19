package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;

public class Furgone extends VeicoloMotore {

    public Furgone(Double prezzo, TipoPatente tipoPatente, String targa) {
        super(prezzo, tipoPatente, targa);
    }

    @Override
    public Boolean needCasco() {
        return false;
    }
}
