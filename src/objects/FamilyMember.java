package objects;

public class FamilyMember {
    static String surname = "Nowak";
    String name;
    int age;

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Stefan";
        dad.age = 36;

        System.out.println("Nazwa rodu to: " + dad.surname);
        System.out.println("Nazwa rodu to: " + FamilyMember.surname);

        System.out.println("\nname: " + dad.name + ", age: " + dad.age);

    }
}
