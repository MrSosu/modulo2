package esercizi.carsharing.validators;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Validator {

    public static void requireNotNull(Object myObject) {
        if (myObject == null) {
            throw new NullPointerException("L'input passato " + myObject + " è null");
        }
    }

    public static void requireNotBlank(String s) {
        if (s.isBlank()) {
            throw new IllegalArgumentException("La stringa non può essere blank");       }
    }

    public static void requireDateTimeAfter(LocalDateTime dateTime, LocalDateTime dateTime2) {
        if (dateTime.isBefore(dateTime2)) {
            throw new IllegalArgumentException("La data " +
                    "non può essere nel passato!");
        }
    }

    public static void requireDateTimeBefore(LocalDateTime dateTime, LocalDateTime dateTime2) {
        if (dateTime.isAfter(dateTime2)) {
            throw new IllegalArgumentException("La data " +
                    "non può essere nel futuro!");
        }
    }

    public static void requireDateAfter(LocalDate dateTime, LocalDate dateTime2) {
        if (dateTime.isBefore(dateTime2)) {
            throw new IllegalArgumentException("La data " +
                    "non può essere nel passato!");
        }
    }

    public static void requireDateBefore(LocalDate dateTime, LocalDate dateTime2) {
        if (dateTime.isAfter(dateTime2)) {
            throw new IllegalArgumentException("La data " +
                    "non può essere nel futuro!");
        }
    }

}
