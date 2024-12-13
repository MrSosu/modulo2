package esempi.generics;

import esempi.ereditarieta.Persona;
import esempi.ereditarieta.Professore;
import esempi.ereditarieta.Studente;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Coppia<String> coppiaStringhe = new Coppia<>("AS", "Roma");
        System.out.println(coppiaStringhe.getX());
        System.out.println(coppiaStringhe.getY());

        Coppia<Integer> coppiaInteri = new Coppia<>(7,8);
        System.out.println(coppiaInteri.getX());
        System.out.println(coppiaInteri.getY());

        Coppia<Integer> coppiaInteri2 = new Coppia<>(10,12);
        Coppia<Coppia<Integer>> coppiaCheScoppia = new Coppia<>(coppiaInteri, coppiaInteri2);

        Coppia<Long> coppiaLong = new Coppia<>(100L,99L);
        Coppia<?> coppiaJolly = new Coppia<>(100L,99L);

        coppiaJolly = new Coppia<>("Marco", "Adriani");

        // coppia di una qualsiasi classe che estenda Persona
        Coppia<? extends Persona> coppiaPersone = new Coppia<>(new Professore(), new Studente());

        List<Integer> listaInteri = new ArrayList<>();

        if (listaInteri instanceof List<Integer>) {
            System.out.println("Sono una lista di interi per davvero!");
        }

        if (listaInteri instanceof List<?>) {
            System.out.println("Sono una lista di qualcosa per davvero!");
        }

    }

}
