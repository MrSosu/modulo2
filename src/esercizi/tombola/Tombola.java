package esercizi.tombola;

import esercizi.riparazioni.Tecnico;

import java.util.Random;

public class Tombola {

    public static void tombola(int[][] cartella) {
        if (cartella.length != 3 || cartella[0].length != 5) {
            System.out.println("cartella non valida!");
            return;
        }
        Random random = new Random(); // oggetto per creare randomicità
        int[] numeriEstratti = new int[20]; // array di numeri estratti fino a quel momento
        int countEstratti = 0; // numero di numeri effettivamente estratti, a 20 termino il programma
        int[] primaRiga = cartella[0]; // prima riga della cartella
        int[] secondaRiga = cartella[1]; // seconda riga della cartella
        int[] terzaRiga = cartella[2]; // terza riga della cartella
        // conteggi dei numeri trovati per ogni riga
        int countPrimaRiga = 0;
        int countSecondaRiga = 0;
        int countTerzaRiga = 0;
        while (true) {
            int nextNumeroEstratto = random.nextInt(0,90) + 1; // estraggo il prossimo numero
            if (contains(numeriEstratti, nextNumeroEstratto)) { // se è già stato estratto
                continue; // estraine un altro
            }
            System.out.println("Numero estratto : " + nextNumeroEstratto);
            // inserisco nell'array dei numeri estratti il nuovo numero, aggiornando insieme il count
            numeriEstratti[countEstratti++] = nextNumeroEstratto;
            // vedo se il numero è contenuto nella cartella
            if (contains(primaRiga, nextNumeroEstratto)) {
                countPrimaRiga++;
                stampaPremio(countPrimaRiga);
            }
            else if (contains(secondaRiga, nextNumeroEstratto)) {
                countSecondaRiga++;
                stampaPremio(countSecondaRiga);
            }
            else if (contains(terzaRiga, nextNumeroEstratto)) {
                countTerzaRiga++;
                stampaPremio(countTerzaRiga);
            }
            if (countPrimaRiga == 5 && countSecondaRiga == 5 && countTerzaRiga == 5) {
                System.out.println("TOMBOLAAAAAAAAAAAAAAAA");
                return;
            }
            if (countEstratti == 20) {
                System.out.println("GIOCO TERMINATO, NON HAI FATTO TOMBOLA SFIGATELLO :(");
                return;
            }
        }
    }

    public static boolean contains(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return true;
        }
        return false;
    }

    public static void stampaPremio(int count) {
        switch (count) {
            case 2 : System.out.println("AMBO!");
                    break;
            case 3 : System.out.println("TERNO!");
                    break;
            case 4 : System.out.println("QUATERNA!");
                    break;
            case 5 : System.out.println("CINQUINA! (in faccia)");
                    break;
            default:
        }
    }

    public static void main(String[] args) {
        int[][] myCartellaSfigata = {{9, 13, 33, 69, 90}, {4, 21, 35, 52, 61}, {12, 28, 41, 73, 88}};
        tombola(myCartellaSfigata);
    }

}
