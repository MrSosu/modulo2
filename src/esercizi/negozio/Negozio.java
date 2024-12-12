package esercizi.negozio;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String nome;
    private static List<Prodotto> products = new ArrayList<>();

    public Negozio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Prodotto> getProducts() {
        return products;
    }

    public static void setProducts(List<Prodotto> newProducts) {
        products = newProducts;
    }

    public void addProdotto(Prodotto prodotto, Integer quantity) {
        if (products.contains(prodotto)) {
            prodotto.setQuantity(prodotto.getQuantity() + quantity);
        }
        else {
            prodotto.setQuantity(quantity);
            products.add(prodotto);
        }
    }

    public void removeProdotto(Prodotto prodotto) {
        products.remove(prodotto);
    }

    public void stampaDisponibilita() {
        for (Prodotto p : products) {
            System.out.println("----------");
            System.out.println("Prodotto: " + p.getNome() + "\n" +
                    "Quantità: " + p.getQuantity());
            System.out.println("----------");
        }
    }

    // questo metodo ritorna true se il prodotto con quantità quantity è disponibile
    public static boolean isPresentProdotto(Prodotto prodotto, Integer quantity) {
        // controllo se il prodotto è presente in negozio
        if (!products.contains(prodotto)) {
            System.out.println("NCE STA");
            return false;
        }
        // controllo se la quantità è abbastanza
        if (prodotto.getQuantity() < quantity) {
            System.out.println("NCE NE STA ENOUGH");
            return false;
        }
        return true;
    }

    public static Double ammontareRata(Double prezzoTot, Integer numeroMesi) {
        return prezzoTot / numeroMesi;
    }

}
