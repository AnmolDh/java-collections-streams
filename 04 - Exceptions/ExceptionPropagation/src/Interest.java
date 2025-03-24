public class Interest {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount or Rate cannot be negative.");
        }
        return ((amount * rate) * years)/100;
    }
}
