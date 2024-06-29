package laboratoria.lab22;

import java.util.ArrayList;
import java.util.List;

//  Zakładając, że klasa Person posiada właściwości name (String) oraz age (int).
//  Napisz program, który przyjmie listę obiektów klasy Person i wykona następujące operacje przy użyciu strumieni:
//  - znajdzie wszystkie osoby, które mają więcej niż 18 lat,
//  - zamieni obiekty Person na ich imiona,
//  - zbierze imiona do listy.

public class PersonOperations {
    public static void main(String[] args) {
        List<Person> people = providePeople();

        List<String> namesOfPeopleOver18 = people.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .toList();

        System.out.println(namesOfPeopleOver18);
    }

    private static List<Person> providePeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", 20));
        people.add(new Person("Ola", 7));
        people.add(new Person("Antek", 4));
        people.add(new Person("Marek", 39));
        people.add(new Person("Lena", 18));
        return people;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
