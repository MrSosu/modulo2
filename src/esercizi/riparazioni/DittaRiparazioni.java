package esercizi.riparazioni;

public class DittaRiparazioni {

    private Tecnico[] tecnici;
    private Riparazione[] riparazioni;
    private int numTecniciTot;
    private int indexTecnici;
    private int indexRiparazioni;

    public DittaRiparazioni(int numTecniciTot, int numRiparazioniTot) {
        this.numTecniciTot = numTecniciTot;
        this.riparazioni = new Riparazione[numRiparazioniTot];
        this.tecnici = new Tecnico[numTecniciTot];
        this.indexTecnici = 0;
        this.indexRiparazioni = 0;
    }

    /**
     * Questo metodo aggiunge una riparazione al sistema.
     * @param riparazione la riparazione da aggiungere
     */
    public void addRiparazione(Riparazione riparazione) {
        riparazioni[indexRiparazioni] = riparazione;
        indexRiparazioni++;
    }

    /**
     * Questo metodo ritorna tutte le prenotazioni che sono in attesa,
     * cioè che sono in attesa di essere assegnate.
     * @return la lista delle prenotazioni in attesa.
     */
    public Riparazione[] getRiparazioniInAttesa() {
        Riparazione[] riparazioniInAttesa = new Riparazione[0];
        for (Riparazione riparazione : riparazioni) {
            if (riparazione == null) continue;
            if (riparazione.isAssegnata() && !riparazione.isTerminata()) { // se la riparazione non è terminata è in attesa
                Riparazione[] newRiparazioni = new Riparazione[riparazioniInAttesa.length + 1];
                for (int i = 0; i < newRiparazioni.length; i++) {
                    newRiparazioni[i] = riparazioni[i];
                }
                newRiparazioni[riparazioniInAttesa.length] = riparazione;
                riparazioniInAttesa = newRiparazioni;
            }
        }
        return riparazioniInAttesa;
    }

    /**
     * Questo metodo ritorna la riparazione con un livello di priorità
     * più alto per una riparazione che non sia stata terminata.
     * @return la riparazione non terminata con priorità più alta
     */
    public Riparazione getRiparazioneMaxPriority() {
        if (riparazioni.length == 0) {
            System.out.println("Non hai nessuna riparazione!");
            return null;
        }
        Riparazione riparazioneMax = riparazioni[0];
        for (int i = 1; i < riparazioni.length; i++) {
            if (riparazioni[i] == null) continue;
            if (!riparazioni[i].isTerminata() &&
                    riparazioni[i].getPriority().getPriority() > riparazioneMax.getPriority().getPriority()) {
                riparazioneMax = riparazioni[i];
            }
        }
        return riparazioneMax;
    }

    /**
     * In questo metodo assegnamo una riparazione ad un tecnico
     * @param riparazione a cui aggiungere il tecnico
     * @param tecnico il tecnico da aggiungere.
     */
    public void assegnaRiparazione(Riparazione riparazione, Tecnico tecnico) {
        if (tecnico.isInFerie()) {
            System.out.println("Non puoi assegnare una riparazione ad un tecnico in ferie!");
            return;
        }
        riparazione.setAssegnata(true);
        riparazione.setTecnico(tecnico);
    }

    /**
     * Questo metodo conclude una riparazione.
     * @param riparazione la riparazione terminata.
     */
    public void concludiRiparazione(Riparazione riparazione) {
        if (!riparazione.isAssegnata()) {
            System.out.println("Non puoi terminare una riparazione nemmeno assegnata!");
            return;
        }
        if (riparazione.isTerminata()) {
            System.out.println("Non puoi terminare una riparazione già terminata!");
            return;
        }
        riparazione.setTerminata(true);
    }

    /**
     * Questo metodo aggiunge un tecnico alla ditta.
     * @param tecnico il tecnico da aggiungere
     */
    public void addTecnico(Tecnico tecnico) {
        for (Tecnico t : tecnici) {
            if (t == null) continue;
            if (t.getNome().equals(tecnico.getNome())) {
                System.out.println("Esiste già un tecnico con questo nome!");
                return;
            }
        }
        tecnici[indexTecnici] = tecnico;
        indexTecnici++;
    }

    /**
     * Questo metodo prende in input una lista di tecnici e li mette in ferie.
     * @param tecniciInput I tecnici che vanno in ferie.
     */
    public void ferieTecnici(Tecnico[] tecniciInput) {
        for (Tecnico tecnico : tecniciInput) {
            for (Tecnico tecnico1 : tecnici) {
                if (tecnico.equals(tecnico1)) {
                    tecnico1.setInFerie(true);
                }
            }
        }
    }

}
