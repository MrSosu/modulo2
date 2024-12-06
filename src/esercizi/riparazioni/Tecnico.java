package esercizi.riparazioni;

import java.util.Objects;

public class Tecnico {

    private String nome;
    private String cognome;
    private boolean isInFerie;

    public Tecnico(String nome) {
        this.nome = nome;
        this.isInFerie = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInFerie() {
        return isInFerie;
    }

    public void setInFerie(boolean inFerie) {
        isInFerie = inFerie;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Tecnico tecnico = (Tecnico) obj;
        return tecnico.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hashCode(this.getNome()));
        return Objects.hash(nome, cognome);
    }
}
