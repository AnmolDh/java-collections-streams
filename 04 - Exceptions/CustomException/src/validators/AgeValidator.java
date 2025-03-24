package validators;

import custom_exceptions.InvalidAgeException;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        }
        System.out.println(age + " is a valid age, Access Granted!");
    }
}
