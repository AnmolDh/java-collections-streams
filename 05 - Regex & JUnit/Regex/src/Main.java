import regex_extractions.*;
import regex_validations.*;

public class Main {
    public static void main(String[] args) {
        ValidateUsername.validate("user_123");

        ValidateLicensePlate.validate("HR0110");

        ValidateHexColor.validate("#FFA500");

        ExtractEmails.extract("Contact us at support@example.com and info@company.org");
    }
}