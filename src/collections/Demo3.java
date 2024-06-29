package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Map<String, String>  phones = new HashMap<>();
        phones.put("Tomek", "567 234 367");
        phones.put("Alicja", "234 7659 87");
        phones.put("Tomek", "999 999 999");
        phones.put("Barbara", "999 999 999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);
        System.out.println();

        System.out.println(phones.containsKey("Barbara"));
        System.out.println(phones.containsKey("Coco"));
        System.out.println();

        System.out.println("numer do Barbary: " + phones.get("Barbara"));
        System.out.println("numer do Coco: " + phones.get("Coco"));
        System.out.println();

        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }
        System.out.println();

        Collection<String> values = phones.values();
        System.out.println(values);
        System.out.println();

        phones.entrySet().stream()
                .forEach(es -> System.out.println(es.getKey() + " -> " + es. getValue()));
        System.out.println();

        for (Map.Entry entry : phones.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        for (Map.Entry entry : phones.entrySet()){
            entry.setValue("0");
        }
        System.out.println(phones);
        System.out.println();

    }
}
