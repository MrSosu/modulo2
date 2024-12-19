package esercizi.carsharing.main;

import esercizi.carsharing.admin.Admin;
import esercizi.carsharing.dto.UtenteRegisterRequest;
import esercizi.carsharing.entities.noleggio.Noleggio;
import esercizi.carsharing.entities.utente.TipoPatente;
import esercizi.carsharing.entities.utente.Utente;
import esercizi.carsharing.entities.veicolo.Auto;
import esercizi.carsharing.exceptions.VeicoloNotAvailableException;
import esercizi.carsharing.exceptions.VeicoloNotFoundException;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws VeicoloNotFoundException, VeicoloNotAvailableException, InterruptedException {
        Utente utente = Admin.register(new UtenteRegisterRequest(
                "Marco",
                "Adriani",
                LocalDate.of(1993, 9, 17),
                "ABCDEF93S17B789G"
        ));
        Auto auto = (Auto) Admin.insertVeicolo(new Auto(
                3.0,
                TipoPatente.TIPO_B,
                "AB123CD"));
        Noleggio noleggio = utente.attivaNoleggio(auto.getId());
        System.out.println(noleggio);
        Thread.sleep(2 * 60 * 1000);
        Double price = utente.terminaNoleggio(noleggio);
        System.out.println(price);

    }

}
