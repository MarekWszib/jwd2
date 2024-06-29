package inner.istatic;

public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner1 = outer.instantiate();
        Outer.Inner inner2 = new Outer.Inner(); // klasa statyczna, mozna utworzy ć bez koniecznosci tworzenia klasy zewnetrznej

        Outer.MyEnum meEnum = Outer.MyEnum.ONE;

    }
}

class Outer {
    static class Inner{

    }
    public Inner instantiate(){
        return new Inner();
    }

    // interfajsy i enumy są domyslnie statyczne, nie trzeba tworzyc instancji klasy outer

    interface MyInterface {};

    enum MyEnum {ONE};

}