public class Main {
    public static void main(String[] args) {
        String s1 = new String("a");
        String s2 = new String("a");
        String s3 = "b";
        String s4 = "b";
        String s5 = "a";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);
    }

}
