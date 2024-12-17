package esempi.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Examples {

    public static void main(String[] args) {
        Set<String> parole = new HashSet<>();
        Set<String> paroleTree = new TreeSet<>();

        parole.add("Marco");
        paroleTree.add("Marco");
        parole.add("Java");
        paroleTree.add("Java");
        parole.add("Coding");
        paroleTree.add("Coding");

        System.out.println(parole);
        System.out.println(paroleTree);
    }

}
