package datatypes;

public class Laboratorium4v2 {
    public static void main(String[] args) {
        //Zadanie 1:
        String firstName;
        String lastName;
        short age;
        char gender;
        long personalID;

        firstName = "Adam";
        lastName = "Kowalski";
        age = 40;
        gender = 'm';
        personalID = 987654321L;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("PersonalId: " + personalID);

        //Zadanie 2:
        char c = 169;
        String s = " ";
        String row1 = s + s + s + c;
        String row2 = s + s + c + s + c;
        String row3 = s + c + s + s + s + c;
        String row4 = c + s + c + s + c + s + c;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);

        System.out.println(2+3*5);
    }
}
