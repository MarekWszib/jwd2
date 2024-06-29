package laboratoria.lab18;

//        Napisz program o nazwie UserCollector zarządzający (przechowuje całą kolekcję, wyświetla wybrane pozycje)
//        obiektami typu User za pomocą unikalnych identyfikatorów.
//        Obiekty User powinny zawierać takie właściwości jak imię, nazwisko oraz wiek.

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> usersById = new HashMap<>();

        usersById.put(1, new User("Jan", "Kowalski", 9));
        usersById.put(2, new User("Anna", "Annowska", 22));
        usersById.put(3, new User("Adam", "Nowak", 50));
        usersById.put(4, new User("Damian", "Damianowski", 4));
        usersById.put(5, new User("Beata", "Beatowska", 45));
        usersById.put(6, new User("Żaneta", "Żanetowska", 45));

        System.out.println("User with id=3: " + usersById.get(3));
        System.out.println();

        System.out.println("All users:");
        for (Map.Entry<Integer, User> entry : usersById.entrySet()) {
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }

    }

}

class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
