package esercizi.riparazioni;

public class Main {

    public static void main(String[] args) {

        DittaRiparazioni ditta = new DittaRiparazioni("SOSU_RIPARAZIONI");
        Tecnico tecnico = new Tecnico("Eldor Shomurodov");
        ditta.addTecnico(tecnico);
        Tecnico tecnico1 = new Tecnico("Ahmed Barusso");
        ditta.addTecnico(tecnico1);
        ditta.addRiparazione(new Riparazione("via Fasulla 123", Priority.BASSA, tecnico));
        Riparazione r1 = new Riparazione("via Fasulla 123", Priority.MEDIA);
        ditta.addRiparazione(r1);
        ditta.addRiparazioneToTecnico(r1, tecnico1);
        Riparazione r2 = new Riparazione("via pippo", Priority.URGENTE);
        ditta.addRiparazione(r2);
        System.out.println(ditta.riparazioneMaxPriority());

    }

}
