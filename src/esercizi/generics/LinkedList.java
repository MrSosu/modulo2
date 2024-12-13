package esercizi.generics;

public class LinkedList<T> {

    // scrivo una classe annidata per rappresentare il concetto di elemento della mia LinkedList
    private static class Elemento<T> {

        T value; // il valore dell'elemento corrente, di tipo T
        Elemento<T> next; // l'elemento successivo nella lista

        // costruttore dell'elemento
        Elemento(T value) {
            this.value = value;
            this.next = null;
        }

    }

    private Elemento<T> testa;

    // metodi di linkedlist
    public void addFirst(T value) {
        Elemento<T> newTesta = new Elemento<>(value); // creo il nuovo elemento con il valore passato in input di tipo T
        newTesta.next = testa; // gli setto come prossimo elemento nella lista la vecchia testa
        testa = newTesta; // setto come testa il nuovo elemento
    }

    public T removeFirst() {
        if (testa == null) { // se la coda è vuota lancio eccezione
            System.out.println("la lista è vuota non c'è nulla da tornare!");
            return null;
        }
        T oldTestaValue = testa.value; // mi salvo il vecchio valore della testa per ritornarlo
        testa = testa.next; // la nuova testa diventa il prossimo elemento della vecchia testa
        return oldTestaValue; // ritorno il valore precedentemente salvato
    }

}
