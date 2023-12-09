package overloading;

public class PriceFormatter {
    String currency = "zł";

    private String formatPrice(int value) {
        return String.format("%d,00 %s", value, currency);
    }
    private String formatPrice(double value) {
        return String.format("%.2f %s", value, currency);
    }
    private String formatPrice(String value) {
        return formatPrice(Double.parseDouble(value));
    }

    public static void main(String[] args) {
        PriceFormatter pf = new PriceFormatter();
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(4.5d));
        System.out.println(pf.formatPrice("5.876"));

        pf.currency = "PLN";
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(4.5d));
        System.out.println(pf.formatPrice("5.876"));
    }
}
