package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NameSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Wojtek");
        mySet.add("Agata");
        mySet.add("Wojtek");
        mySet.add("Tomek");

        System.out.println(mySet);

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-------------");

        mySet.add("Anna");
        mySet.add("Anna");
        mySet.add("Anna");
        mySet.add("Wojtek");

        iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element: "+ element + ", hashCode: " + element.hashCode());
        }

    }
}
