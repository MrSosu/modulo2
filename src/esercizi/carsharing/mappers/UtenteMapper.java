package esercizi.carsharing.mappers;

import esercizi.carsharing.dto.UtenteRegisterRequest;
import esercizi.carsharing.entities.utente.Utente;

public class UtenteMapper {

    public static Utente toEntity(UtenteRegisterRequest request) {
        Utente utente = new Utente();
        utente.setNome(request.nome());
        utente.setCognome(request.cognome());
        utente.setDataNascita(request.dataNascita());
        utente.setCodiceFiscale(request.codiceFiscale());
        return utente;
    }

}
