package laboratoria.lab17;

//Napisz typ wyliczeniowy z kierunkami świata (także pośrednimi, np. “north east”).
// Typ powinien przechowywać informacje o skrótach (np. “NE”) oraz nazwach zarówno w języku angielskim oraz polskim.
// Zademonstruj na przykładzie działanie nowego typu.

public enum Direction {
    N("north", "północ"),
    NE("north east", "północny wschód"),
    E("west", "wschód"),
    SE("south east", " południowy wschód"),
    S("south", "południe"),
    SW("southe west", "południowy zachów"),
    W("west", "zachód"),
    NW("north west", "północny zachód");

    private String engName;
    private String polName;

    Direction(String engName, String polName) {
        this.engName = engName;
        this.polName = polName;
    }

    public String getEngName() {
        return engName;
    }

    public String getPolName() {
        return polName;
    }

    public static void main(String[] args) {
        System.out.println(Direction.NE.getEngName());
        System.out.println(Direction.W.getPolName());
    }
}
