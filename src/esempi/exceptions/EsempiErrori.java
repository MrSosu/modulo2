package esempi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsempiErrori {

    public static void metodoACaso(String s, Character c) throws FileNotFoundException {
        try {
            s = s.trim().replace(c,'Z');
        } catch (NullPointerException e) {
            System.out.println("A pollo me stai a passa una stringa vuota");
            Scanner input = new Scanner(System.in);
            System.out.println("Inseriscine un'altra");
            String newString = input.next();
            metodoACaso(newString, c);
        }
        finally {
            System.out.println("Questa parte verrà sempre eseguita");
        }
        robaSuFile(s);
    }

    public static void robaSuFile(String path) throws FileNotFoundException {
        File myFile = new File(path);
        Scanner scanner = new Scanner(myFile);
        System.out.println(scanner.next());
    }

    public static void main(String[] args) {
        String myString = null;
        try {
            metodoACaso(myString, 'm');
        } catch (FileNotFoundException e) {
            System.out.println("il file non esiste fagiano");
        }
    }

}
