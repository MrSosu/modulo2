package esercizi.carsharing.entities.veicolo;

import esercizi.carsharing.entities.utente.TipoPatente;

public abstract class VeicoloMotore extends Veicolo {

    // attributi
    protected String targa;
    protected TipoPatente tipoPatente;
    protected Double livelloCarburante; // valore tra 0 ed 1 che rappresenta la percentuale di serbatoio piena

    // costruttore
    public VeicoloMotore(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo);
        this.tipoPatente = tipoPatente;
        this.livelloCarburante = 1d;
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
