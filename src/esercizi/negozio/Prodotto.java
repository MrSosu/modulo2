package esercizi.negozio;

import java.util.UUID;

public class Prodotto {

    private static Integer idTot = 0;
    private Integer id;
    private String codiceProdotto;
    private String nome;
    private Double price;
    private Integer quantity;
    private TipoProdotto tipoProdotto;

    public Prodotto(String nome, Double price, TipoProdotto tipoProdotto) {
        this.id = idTot++;
        this.codiceProdotto = UUID.randomUUID().toString();
        this.nome = nome;
        this.price = price;
        this.quantity = 0;
        this.tipoProdotto = tipoProdotto;
    }

    public Integer getId() {
        return id;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }



}
