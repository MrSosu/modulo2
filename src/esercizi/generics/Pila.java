package esercizi.generics;

/*
CODA o QUEUE ---> FIFO, First In First Out
PILA o STACK ---> LIFO, Last in First Out
 */
public class Pila<T> {

    private static class Elemento<T> {

        T value;
        Elemento<T> precedente;

        public Elemento(T value) {
            this.value = value;
            this.precedente = null;
        }

    }

    private Elemento<T> coda;

    // aggiunge un nuovo elemento alla pila
    public void push(T value) {
        Elemento<T> oldCoda = coda;
        this.coda = new Elemento<>(value);
        this.coda.precedente = oldCoda;
    }

    // rimuove la "cima" della pila e ritorna il valore associato
    public T pop() {
        if (coda == null) {
            System.out.println("Empty stack");
            return null;
        }
        Elemento<T> oldCoda = coda;
        this.coda = oldCoda.precedente;
        return oldCoda.value;
    }

    // ritorna il valore della "cima" della pila
    public T peek() {
        if (coda == null) {
            System.out.println("Empty stack");
            return null;
        }
        return coda.value;
    }

}
