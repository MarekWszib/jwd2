package laboratoria.lab17;

//Napisz typ wyliczeniowy z kierunkami świata (także pośrednimi, np. “north east”).
// Typ powinien przechowywać informacje o skrótach (np. “NE”) oraz nazwach zarówno w języku angielskim oraz polskim.
// Zademonstruj na przykładzie działanie nowego typu.

public enum Direction {
    N("North", "północ"),
    NE("North East", "północny wschód"),
    E("West", "wschód"),
    SE("South East", " południowy wschód"),
    S("South", "południe"),
    SW("South West", "południowy zachód"),
    W("West", "zachód"),
    NW("North West", "północny zachód");

    private String nameEng;
    private String namePol;

    Direction(String nameEng, String namePol) {
        this.nameEng = nameEng;
        this.namePol = namePol;
    }

    public String getNameEng() {
        return nameEng;
    }

    public String getNamePol() {
        return namePol;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "nameEng='" + nameEng + '\'' +
                ", namePol='" + namePol + '\'' +
                '}';
    }
}
