package classes;

public class RangeLister {

    int[] makeRange(int lower, int upper) {
        int[] range = new int[upper - lower + 1];

        for (int i = 0; i < range.length; i++) {
            range[i] = lower + i;
        }

        return range;
    }

    public static void main(String[] args) {
        int[] range;
        RangeLister rangeLister = new RangeLister();
        range = rangeLister.makeRange(4, 13);

        System.out.print("Tablica: \n[ ");
        for (int i = 0; i < range.length; i++) {
            System.out.printf("%d ", range[i]);
        }
        System.out.println("]");
    }
}
