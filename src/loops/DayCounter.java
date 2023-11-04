package loops;

public class DayCounter {
    public static void main(String[] args) {
        int monthIn = 1;
        int yearIn = 2016;

        if (args.length > 0) {
            monthIn = Integer.parseInt(args[0]);
        }
        if (args.length > 0) {
            yearIn = Integer.parseInt(args[1]);
        }

        System.out.println(monthIn + "/" + yearIn + " ma " + countDays(monthIn, yearIn) + " dni.");
    }

    private static int countDays(int monthIn, int yearIn) {
        int count = -1;

        switch (monthIn) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                count = isLeapYear(yearIn) ? 29 : 28;
        }

        return count;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
