import methods.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method.method2(1, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}