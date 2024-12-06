package esercizi.riparazioni;

public class Riparazione {

    private String indirizzo;
    private Priority priority;
    private Tecnico tecnico;
    private boolean isAssegnata;
    private boolean isTerminata;

    public Riparazione(String indirizzo, Priority priority) {
        this.indirizzo = indirizzo;
        this.priority = priority;
        this.tecnico = null;
        this.isAssegnata = false;
        this.isTerminata = false;
    }

    public Riparazione(String indirizzo, Priority priority, Tecnico tecnico) {
        this.indirizzo = indirizzo;
        this.priority = priority;
        this.tecnico = tecnico;
        this.isAssegnata = true;
        this.isTerminata = false;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        this.isAssegnata = true;
    }

    public boolean isAssegnata() {
        return isAssegnata;
    }

    public void setAssegnata(boolean assegnata) {
        isAssegnata = assegnata;
    }

    public boolean isTerminata() {
        return isTerminata;
    }

    public void setTerminata(boolean terminata) {
        isTerminata = terminata;
    }

    @Override
    public String toString() {
        return "Riparazione all'indirizzo: " + indirizzo;
    }
}
