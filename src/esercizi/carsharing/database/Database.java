package esercizi.carsharing.database;

import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Veicolo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {

    private static HashMap<Integer, Utente> utenti = new HashMap<>();
    private static HashMap<Integer, Veicolo> veicoli = new HashMap<>();
    private static HashMap<Integer, Noleggio> noleggi = new HashMap<>();

    public static void addUtente(Utente utente) {
        utenti.put(utente.getId(), utente);
    }

    public static List<Utente> getAllUtenti() {
        return utenti
                .values()
                .stream()
                .toList();
    }

    public static void addVeicolo(Veicolo veicolo) {
        veicoli.put(veicolo.getId(), veicolo);
    }

    public static Veicolo getVeicoloById(Integer id) {
        return veicoli.get(id);
    }

    public static void addNoleggio(Noleggio noleggio) {
        noleggi.put(noleggio.getId(), noleggio);
    }

    public static List<Noleggio> getNoleggiByVeicoloId(Integer id_veicolo) {
        List<Noleggio> myNoleggi = new ArrayList<>();
        for (Integer id : noleggi.keySet()) {
            Noleggio n = noleggi.get(id);
            if (n.getVeicolo().getId().equals(id_veicolo)) {
                myNoleggi.add(n);
            }
        }
        return myNoleggi;
    }

    public static List<Veicolo> getAllVeicoli() {
        return veicoli
                .values()
                .stream()
                .toList();
    }
}
