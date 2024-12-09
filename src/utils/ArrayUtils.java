package utils;

import esercizi.riparazioni.Riparazione;
import esercizi.riparazioni.Tecnico;

public class ArrayUtils {

    public static Tecnico[] addTecnico(Tecnico[] arrayTecnici, Tecnico tecnico) {
        // creo un nuovo array di lunghezza +1 rispetto a quello in input
        Tecnico[] newArrayTecnici = new Tecnico[arrayTecnici.length+1];
        // copio ogni valore del vecchio array nel nuovo array nella stessa posizione
        for (int i = 0; i < arrayTecnici.length; i++) {
            newArrayTecnici[i] = arrayTecnici[i];
        }
        // aggiungo nell'ultima posizione il nuovo elemento
        newArrayTecnici[newArrayTecnici.length-1] = tecnico;
        return newArrayTecnici;
    }

    public static Riparazione[] addRiparazione(Riparazione[] arrayRiparazioni, Riparazione riparazione) {
        // creo un nuovo array di lunghezza +1 rispetto a quello in input
        Riparazione[] newArrayRiparazioni = new Riparazione[arrayRiparazioni.length+1];
        // copio ogni valore del vecchio array nel nuovo array nella stessa posizione
        for (int i = 0; i < arrayRiparazioni.length; i++) {
            newArrayRiparazioni[i] = arrayRiparazioni[i];
        }
        // aggiungo nell'ultima posizione il nuovo elemento
        newArrayRiparazioni[arrayRiparazioni.length-1] = riparazione;
        return newArrayRiparazioni;
    }

}
