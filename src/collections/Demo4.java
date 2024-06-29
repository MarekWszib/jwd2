package collections;

import modifiers.com.one.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("aaa");
        words.add("bbb");
        words.add("bbb");
        words.add("ccc");
        System.out.println();

        System.out.println(Collections.frequency(words,"aaa"));
        System.out.println(Collections.frequency(words,"bbb"));
        System.out.println(Collections.frequency(words,"c"));
        System.out.println();

        System.out.println(words);
        Collections.shuffle(words);
        System.out.println(words);
        Collections.shuffle(words);
        System.out.println(words);
        System.out.println();

    }
}
