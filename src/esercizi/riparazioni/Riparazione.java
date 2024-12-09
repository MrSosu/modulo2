package esercizi.riparazioni;

public class Riparazione {

    private static Integer idTot = 0;
    private Integer id;
    private String indirizzo;
    private Priority priority;
    private Tecnico tecnico;
    private boolean completata;

    public Riparazione(String indirizzo, Priority priority) {
        this.id = ++idTot;
        this.indirizzo = indirizzo;
        this.priority = priority;
        this.completata = false;
    }

    public Riparazione(String indirizzo, Priority priority, Tecnico tecnico) {
        this.id = ++idTot;
        this.indirizzo = indirizzo;
        this.priority = priority;
        if (!tecnico.isInFerie()) {
            this.tecnico = tecnico;
        }
        this.completata = false;
    }

    public static Integer getIdTot() {
        return idTot;
    }

    public Integer getId() {
        return id;
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

    public void setPriorityByValue(int value) {
        this.priority = Priority.fromValue(value);
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        if (!tecnico.isInFerie()) {
            this.tecnico = tecnico;
        }
    }

    public boolean isCompletata() {
        return completata;
    }

    public void setCompletata(boolean completata) {
        this.completata = completata;
    }

    @Override
    public String toString() {
        return "Riparazione{" +
                "id=" + id +
                ", indirizzo='" + indirizzo + '\'' +
                ", priority=" + priority +
                ", tecnico=" + tecnico +
                ", completata=" + completata +
                '}';
    }
}
