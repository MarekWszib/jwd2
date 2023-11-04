package loops;

public class Demo {
    public static void main(String[] args) {
//        int a = 0;
//        if (a > 0) {
//            System.out.println("a jest większe od zera");
//        } else if (a < 0) {
//            System.out.println("a jest mniejsze od zera");
//        } else {
//            System.out.println(" a jest równe zero");
//        }

        int myScore = 34;
        int yourScore = 44;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println("Our best score: " + ourBestScore);

        if (myScore > yourScore) {
            ourBestScore = myScore;
            System.out.println("Our best score: " + ourBestScore);
        } else {
            ourBestScore = yourScore;
            System.out.println("Our best score: " + ourBestScore);
        }

    }
}
