package lab6;

import java.util.StringTokenizer;

//Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.
public class DateChanger {
    public static void main(String[] args) {
        String date = "22/4/2017";
        String day, month, year;
        StringTokenizer st = new StringTokenizer(date, "/");
        day = st.nextToken();
        month = st.nextToken();
        year = st.nextToken();

        System.out.println("date: " + date);
        System.out.println("day: " + day);
        System.out.println("month: " + month);
        System.out.println("year: " + year);
    }
}