package esercizi.carsharing.dto;

import esercizi.carsharing.validators.Validator;

import java.time.LocalDate;

public record UtenteRegisterRequest(
        String nome,
        String cognome,
        LocalDate dataNascita,
        String codiceFiscale
) {
    public UtenteRegisterRequest {
        Validator.requireNotBlank(nome);
        Validator.requireNotBlank(cognome);
        Validator.requireDateBefore(dataNascita, LocalDate.now());
        Validator.matchingPattern(codiceFiscale, "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$");
    }
}
