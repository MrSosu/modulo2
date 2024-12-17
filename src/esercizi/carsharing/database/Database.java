package esercizi.carsharing.database;

import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Veicolo;

import java.util.HashMap;

public class Database {

    public static HashMap<Integer, Utente> utenti;
    public static HashMap<Integer, Veicolo> veicoli;
    public static HashMap<Integer, Noleggio> noleggi;

    public static void addUtente(Utente utente) {
        utenti.put(utente.getId(), utente);
    }

    public static void addVeicolo(Veicolo veicolo) {
        veicoli.put(veicolo.getId(), veicolo);
    }

    public static void addNoleggio(Noleggio noleggio) {
        noleggi.put(noleggio.getId(), noleggio);
    }

}
