package enums;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(TshirtSize.S, "4F");
        System.out.println(tshirt1.size);
    }

}
