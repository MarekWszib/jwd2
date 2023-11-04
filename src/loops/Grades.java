package loops;

public class Grades {
    public static void main(String[] args) {
        char grade = 'R';

        switch (grade) {
            case 'A':
            case 'R':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }


    }
}
