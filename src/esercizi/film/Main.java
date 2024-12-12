package esercizi.film;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("Lo chiamavano Trinità", Genere.WESTERN, "E.B.Clucher", 1970, true);
        Film film2 = new Film("Pulp Fiction", Genere.THRILLER, "Quentin Tarantino", 1994, true);
        Film film3 = new Film("Povere Creature", Genere.HORROR, "Yorgos Lanthimos", 2023, false);
        Film film4 = new Film("Partenope", Genere.COMMEDIA, "Paolo Sorrentino", 2024, false);
        Film film5 = new Film("Blade Runner", Genere.CYBER_PUNK, "Ridley Scott", 1982, true);
        Film film6 = new Film("Saw l'Enigmista", Genere.SPLATTER, "James Wan", 2004, true);
        Film film7 = new Film("The Substance", Genere.SPLATTER, " Coralie Fargeat", 2024, false);
        Film film8 = new Film("Shrek", Genere.ANIMAZIONE, "Andrew Adamson e Vicky Jenson", 2001, true);

        Film[] arrayFilm = {film1,film2,film3,film4,film5,film6,film7,film8};

        infoPerGenere(arrayFilm, Genere.COMMEDIA);
        infoPerRegista(arrayFilm,"quentin tarantino");
        stampaPalinstesto(arrayFilm);

    }

    public static void infoPerGenere(Film[] arrayFilm, Genere genere) {
        for (Film f : arrayFilm) {
            if (f.getGenere().equals(genere)) {
                System.out.println("----------------\n");
                f.infoFilm();
                System.out.println("----------------\n");
            }
        }
    }

    public static void infoPerRegista(Film[] arrayFilm, String regista) {
        for (Film f : arrayFilm) {
            if (f.getRegista().equalsIgnoreCase(regista)) {
                System.out.println("----------------\n");
                f.infoFilm();
                System.out.println("----------------\n");
            }
        }
    }

    public static void stampaPalinstesto(Film[] arrayFilm) {
        for (Film f : arrayFilm) {
            System.out.println("----------------\n");
            f.infoFilm();
            System.out.println("----------------\n");
        }
    }

}
