import custom_exceptions.InvalidAgeException;
import validators.AgeValidator;

public class Main {
    public static void main(String[] args) {
        try {
            AgeValidator.validate(17);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}