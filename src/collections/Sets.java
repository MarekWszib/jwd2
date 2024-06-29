package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add("kobra");
        words.add("kobra");
        words.add("kobra");
        words.add("żmija");
        words.add("żmija");
        words.add("anakonda");
        words.add("anakonda");

        System.out.println(words);
        System.out.println(((TreeSet<String>) words).descendingSet());
    }
}
