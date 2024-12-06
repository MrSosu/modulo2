package esercizi.riparazioni;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // creo dei tecnici
        Tecnico tecnico1 = new Tecnico("Marco");
        Tecnico tecnico2 = new Tecnico("Marco");
        Tecnico tecnico3 = new Tecnico("Ciccio");
        Tecnico tecnico4 = new Tecnico("Franco");

        // creo delle riparazioni
        Riparazione riparazione1 = new Riparazione("via Fasulla 123", Priority.URGENTE);
        Riparazione riparazione2 = new Riparazione("via Monte Bianco 21", Priority.BASSA);
        Riparazione riparazione3 = new Riparazione("Piazza Garibaldi 13", Priority.MEDIA);
        Riparazione riparazione4 = new Riparazione("via del Corso 45", Priority.ALTA);

        // creo la ditta di riparazioni
        DittaRiparazioni dittaRiparazioni = new DittaRiparazioni(100, 100);

        // testo i metodi
        dittaRiparazioni.addRiparazione(riparazione1);
        dittaRiparazioni.addRiparazione(riparazione2);
        dittaRiparazioni.addRiparazione(riparazione3);
        dittaRiparazioni.addRiparazione(riparazione4);

        dittaRiparazioni.addTecnico(tecnico1);
        dittaRiparazioni.addTecnico(tecnico2);
        dittaRiparazioni.addTecnico(tecnico3);
        dittaRiparazioni.addTecnico(tecnico4);

        Riparazione[] inAttesa = dittaRiparazioni.getRiparazioniInAttesa();
        System.out.println(Arrays.toString(inAttesa));

        dittaRiparazioni.assegnaRiparazione(riparazione1, tecnico2);
        dittaRiparazioni.assegnaRiparazione(riparazione2, tecnico3);

        inAttesa = dittaRiparazioni.getRiparazioniInAttesa();
        System.out.println(Arrays.toString(inAttesa));

        System.out.println(dittaRiparazioni.getRiparazioneMaxPriority());

        dittaRiparazioni.concludiRiparazione(riparazione1);
        inAttesa = dittaRiparazioni.getRiparazioniInAttesa();
        System.out.println(Arrays.toString(inAttesa));

        Tecnico[] ferie = { tecnico2, tecnico3 };
        dittaRiparazioni.ferieTecnici(ferie);
        System.out.println(tecnico2.isInFerie());
        System.out.println(tecnico3.isInFerie());

        System.out.println(tecnico1.equals(tecnico2));
    }

}
