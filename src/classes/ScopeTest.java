package classes;

public class ScopeTest {
    int test = 10;

    void printTest(){
        int test = 20;
        System.out.println(test);
        System.out.println(this.test);
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.printTest();
    }
}
