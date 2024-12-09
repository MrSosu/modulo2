package esercizi.riparazioni;

public enum Priority {

    BASSA(1), MEDIA(2), ALTA(3), URGENTE(4);

    private int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Priority fromValue(int value) {
        for (Priority p : Priority.values()) {
            if (p.value == value) {
                return p;
            }
        }
        return null;
    }

}
