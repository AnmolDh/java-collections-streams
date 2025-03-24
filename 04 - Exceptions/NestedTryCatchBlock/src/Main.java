public class Main {
    public static void main(String[] args) {
        try{
            int[] arr = {12, 53, 11, 33};
            int idx = 2;
            int element = arr[idx];
            try {
                int divisor = 0;
                divisor = element / divisor;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}