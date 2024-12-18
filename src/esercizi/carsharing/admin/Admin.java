package esercizi.carsharing.admin;

import esercizi.carsharing.database.Database;
import esercizi.carsharing.dto.UtenteRegisterRequest;
import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Veicolo;
import esercizi.carsharing.mappers.UtenteMapper;

public class Admin {

    public static Utente register(UtenteRegisterRequest request) {
        Utente utente = UtenteMapper.toEntity(request);
        Database.addUtente(utente);
        return utente;
    }

    public static Veicolo insertVeicolo(Veicolo veicolo) {
        Database.addVeicolo(veicolo);
        return veicolo;
    }

    public static Veicolo getVeicoloById(Integer id) {
        return Database.getVeicoloById(id);
    }

    public static Noleggio insertNoleggio(Noleggio noleggio) {
        Database.addNoleggio(noleggio);
        return noleggio;
    }

}
