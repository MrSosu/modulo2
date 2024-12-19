package esercizi.carsharing.admin;

import esercizi.carsharing.database.Database;
import esercizi.carsharing.dto.UtenteRegisterRequest;
import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Veicolo;
import esercizi.carsharing.mappers.UtenteMapper;

import java.util.List;

public class Admin {

    private static Admin instance;

    private Admin() {}

    public static Admin getInstance() {
        if (instance != null) return instance;
        else {
            instance = new Admin();
            return instance;
        }
    }

    public static Utente register(UtenteRegisterRequest request) {
        Utente utente = UtenteMapper.toEntity(request);
        Database.addUtente(utente);
        return utente;
    }

    public static List<Utente> getAllUtenti() {
        return Database.getAllUtenti();
    }

    public static Veicolo insertVeicolo(Veicolo veicolo) {
        Database.addVeicolo(veicolo);
        return veicolo;
    }

    public static Veicolo getVeicoloById(Integer id) {
        return Database.getVeicoloById(id);
    }

    public static List<Veicolo> getAllVeicoli() {
        return Database.getAllVeicoli();
    }

    public static Noleggio insertNoleggio(Noleggio noleggio) {
        Database.addNoleggio(noleggio);
        return noleggio;
    }

    public static List<Noleggio> getNoleggiByVeicoloId(Integer id_veicolo) {
        return Database.getNoleggiByVeicoloId(id_veicolo);
    }



}
