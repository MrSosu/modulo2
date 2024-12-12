package esercizi.negozio;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private static Integer idTot = 0;
    private Integer id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private Integer puntiRegalo;

    public Cliente(String nome, String cognome, LocalDate dataNascita) {
        this.id = idTot++;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.puntiRegalo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getPuntiRegalo() {
        return puntiRegalo;
    }

    public void setPuntiRegalo(Integer puntiRegalo) {
        this.puntiRegalo = puntiRegalo;
    }

    public void addPuntiRegalo(Integer puntiRegalo) {
        this.puntiRegalo += puntiRegalo;
    }

    public void subPuntiRegalo(Integer puntiRegalo) {
        this.puntiRegalo -= puntiRegalo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return cliente.id.equals(this.id);
    }

    public Double acquistaProdotto(Prodotto prodotto, Integer quantita) {
        if (!Negozio.isPresentProdotto(prodotto, quantita)) {
            return 0.0;
        }
        prodotto.setQuantity(prodotto.getQuantity() - quantita);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Premi 1 per pagare tutto insieme, 2 per pagare a rate");
        int nextValue = scanner.nextInt();
        if (nextValue == 1) {
            return prodotto.getPrice()*quantita;
        } else if (nextValue == 2) {
            System.out.println("In quanti mesi vuoi pagare? minimo 2 max 12");
            int numMesi = scanner.nextInt();
            if (numMesi < 2 || numMesi > 12) {
                System.out.println("Ma che sei scemo mo paghi tutto insieme e chupa");
            }
            return Negozio.ammontareRata(prodotto.getPrice()*quantita, numMesi);
        } else {
            System.out.println("Ma che sei scemo mo paghi tutto insieme e chupa");
            return prodotto.getPrice()*quantita;
        }

    }

    public Double acquistaProdotti(List<Prodotto> products, List<Integer> quantities) {
        if (products.size() != quantities.size()) {
            System.out.println("INPUT ERRATO! ARRAY DI PRODOTTI E QUANTITA' HANNO DIVERSA LUNGHEZZA");
            return 0.0;
        }
        for (int i = 0; i < products.size(); i++) {
            if (!Negozio.isPresentProdotto(products.get(i), quantities.get(i))) {
                return 0.0;
            }
        }
        double prezzoTot = 0.0;
        for (int i = 0; i < products.size(); i++) {
            prezzoTot += acquistaProdotto(products.get(i), quantities.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Premi 1 per pagare tutto insieme, 2 per pagare a rate");
        int nextValue = scanner.nextInt();
        if (nextValue == 1) {
            return prezzoTot;
        } else if (nextValue == 2) {
            System.out.println("In quanti mesi vuoi pagare? minimo 2 max 12");
            int numMesi = scanner.nextInt();
            if (numMesi < 2 || numMesi > 12) {
                System.out.println("Ma che sei scemo mo paghi tutto insieme e chupa");
            }
            return Negozio.ammontareRata(prezzoTot, numMesi);
        } else {
            System.out.println("Ma che sei scemo mo paghi tutto insieme e chupa");
            return prezzoTot;
        }
    }

}
