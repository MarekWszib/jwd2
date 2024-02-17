package exceptions;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample example = new StackTraceExample();
        example.method1();
    }

    public void method1() {
        method2();
    }

    private void method2() {
        method3();
    }

    private void method3() {
        throw new RuntimeException("Bum!!!:)");
    }

}
