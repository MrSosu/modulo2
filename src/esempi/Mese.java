package esempi;

public enum Mese {

    GENNAIO(1, "Inverno"), FEBBRAIO(2, "Inverno"),
    MARZO(3, "Inverno-primavera"), APRILE(4, "Primavera"),
    MAGGIO(5, "Primavera"), GIUGNO(6, "Primavera-estate"),
    LUGLIO(7, "Estate"), AGOSTO(8, "Estate"),
    SETTEMBRE(9, "Estate-Autunno"), OTTOBRE(10, "Autunno"),
    NOVEMBRE(11, "Autunno"), DICEMBRE(12, "Autunno-inverno");

    private int numMese;
    private String stagione;

    Mese(int numMese, String stagione) {
        this.numMese = numMese;
        this.stagione = stagione;
    }

    public int getNumMese() {
        return numMese;
    }

    public String getStagione() {
        return stagione;
    }
}
