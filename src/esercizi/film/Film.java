package esercizi.film;

public class Film {

    private static Integer idTot = 0;
    private Integer id;
    private String titolo;
    private Genere genere;
    private String regista;
    private Integer annoUscita;
    private Boolean isDisponibile;
    private Boolean isInVisione;

    public Film(String titolo,
                Genere genere,
                String regista,
                Integer annoUscita,
                Boolean isDisponibile) {
        this.id = idTot++;
        this.titolo = titolo;
        this.genere = genere;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.isDisponibile = isDisponibile;
        this.isInVisione = false;
    }

    public Integer getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public Integer getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public Boolean getDisponibile() {
        return isDisponibile;
    }

    public void setDisponibile(Boolean disponibile) {
        isDisponibile = disponibile;
    }

    public Boolean getInVisione() {
        return isInVisione;
    }

    public void setInVisione(Boolean inVisione) {
        isInVisione = inVisione;
    }

    // metodi
    public void visionaFilm() {
        if (isDisponibile) {
            isInVisione = true;
        }
        else System.out.println("IL FILM NON è DISPONIBILE");
    }

    public void terminaVisione() {
        if (isInVisione) {
            isInVisione = false;
        }
        else System.out.println("NON PUOI STOPPARE LA VISIONE DI UN FILM NON VISIONATO");
    }

    public void infoFilm() {
        String info = "titolo : " + titolo + "\n" +
                "anno di uscita : " + annoUscita + "\n" +
                "regista : " + regista + "\n" +
                "genere : " + genere.name() + "\n";
        System.out.println(info);
    }

}
