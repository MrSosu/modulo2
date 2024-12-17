package esercizi.carsharing.entities.veicolo;

public class Monopattino extends Veicolo {

    private Double livelloBatteria;

    public Monopattino(Double prezzo) {
        super(prezzo);
        this.livelloBatteria = 1d;
    }

    @Override
    public Boolean needCasco() {
        return true;
    }

    public Double getLivelloBatteria() {
        return livelloBatteria;
    }

    public void setLivelloBatteria(Double livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

}
