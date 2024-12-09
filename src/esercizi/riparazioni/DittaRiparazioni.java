package esercizi.riparazioni;

import utils.ArrayUtils;

import java.util.Arrays;

public class DittaRiparazioni {

    private String nome;
    private Tecnico[] tecnici;
    private Riparazione[] riparazioni;

    public DittaRiparazioni(String nome) {
        this.nome = nome;
        this.tecnici = new Tecnico[1];
        this.riparazioni = new Riparazione[1];
    }

    public DittaRiparazioni(String nome, Tecnico[] tecnici, Riparazione[] riparazioni) {
        this.nome = nome;
        this.tecnici = tecnici;
        this.riparazioni = riparazioni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico[] getTecnici() {
        return tecnici;
    }

    public void setTecnici(Tecnico[] tecnici) {
        this.tecnici = tecnici;
    }

    public Riparazione[] getRiparazioni() {
        return riparazioni;
    }

    public void setRiparazioni(Riparazione[] riparazioni) {
        this.riparazioni = riparazioni;
    }

    public void addTecnico(Tecnico tecnico) {
        for (Tecnico t : tecnici) {
            if (t == null) continue;
            if (t.getNome().equals(tecnico.getNome())) {
                System.out.println("Esiste un altro maledetto con lo stesso nome");
                return;
            }
        }
        this.tecnici = ArrayUtils.addTecnico(this.tecnici, tecnico);
    }

    public void addRiparazione(Riparazione riparazione) {
        this.riparazioni = ArrayUtils.addRiparazione(this.riparazioni, riparazione);
    }

    public void addRiparazioneToTecnico(Riparazione riparazione, Tecnico tecnico) {
        if (tecnico.isInFerie()) {
            System.out.println("AOOOO lascialo perdeeee sta al mareeee");
            return;
        }
        riparazione.setTecnico(tecnico);
    }

    // metodo che ritorna le riparazioni in attesa
    public Riparazione[] riparazioniInAttesa() {
        Riparazione[] inAttesa = new Riparazione[1];
        for (Riparazione riparazione : this.riparazioni) {
            if (riparazione != null && riparazione.getTecnico() == null) {
                inAttesa = ArrayUtils.addRiparazione(inAttesa, riparazione);
            }
        }
        return inAttesa;
    }

    public Riparazione riparazioneMaxPriority() {
        Riparazione[] riparazioni = riparazioniInAttesa();
        int maxPriority = 0;
        Riparazione maxRiparazione = null;
        for (Riparazione riparazione : riparazioni) {
            if (riparazione == null) break;
            int myPriority = riparazione.getPriority().getValue();
            if (myPriority > maxPriority) {
                maxPriority = myPriority;
                maxRiparazione = riparazione;
            }
        }
        return maxRiparazione;
    }

    public void completaRiparazione(Riparazione riparazione) {
        if (riparazione.getTecnico() == null) {
            System.out.println("Non puoi marcare come completata una riparazione non assegnata");
            return;
        }
        riparazione.setCompletata(true);
    }

    public void crediceAlleFerie(Tecnico[] tecnici) {
        for (Tecnico tecnico : tecnici) {
            tecnico.setInFerie(true);
        }
    }

}
