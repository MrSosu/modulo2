package esercizi.riparazioni;

public enum Priority {

    BASSA(1), MEDIA(2), ALTA(3), URGENTE(4);

    private int priority;

    Priority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
