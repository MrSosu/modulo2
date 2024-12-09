package esercizi.riparazioni;

public class Tecnico {

    private String nome;
    private boolean inFerie;

    public Tecnico(String nome) {
        this.nome = nome;
        this.inFerie = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInFerie() {
        return inFerie;
    }

    public void setInFerie(boolean inFerie) {
        this.inFerie = inFerie;
    }
}
