package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;
import esercizi.carsharing.validators.Validator;

public abstract class VeicoloMotore extends Veicolo {

    // attributi
    protected String targa;
    protected TipoPatente tipoPatente;
    protected Double livelloCarburante; // valore tra 0 ed 1 che rappresenta la percentuale di serbatoio piena

    // costruttore
    public VeicoloMotore(Double prezzo, TipoPatente tipoPatente, String targa) {
        super(prezzo);
        Validator.matchingPattern(targa, "^[A-Z]{2}\\d{3}[A-Z]{2}$\n");
        Validator.requireNotNull(tipoPatente);
        this.tipoPatente = tipoPatente;
        this.livelloCarburante = 1d;
        this.targa = targa;
    }

    // getter e setter
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public TipoPatente getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(TipoPatente tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public Double getLivelloCarburante() {
        return livelloCarburante;
    }

    public void setLivelloCarburante(Double livelloCarburante) {
        this.livelloCarburante = livelloCarburante;
    }
}
