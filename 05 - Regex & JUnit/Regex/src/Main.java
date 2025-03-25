import regex_extractions.*;
import regex_validations.*;

public class Main {
    public static void main(String[] args) {
        ValidateUsername.validate("user_123");

        ValidateLicensePlate.validate("HR0110");

        ValidateHexColor.validate("#FFA500");

        ExtractEmails.extract("Contact us at support@example.com and info@company.org");

        ExtractCapitalizedWords.extract("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");

//        ExtractDates.extract("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.");
    }
}