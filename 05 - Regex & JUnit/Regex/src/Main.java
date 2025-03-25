import regex_extractions.*;
import regex_replace_modify.CensorBadWords;
import regex_replace_modify.SpacesToSingleSpace;
import regex_validations.*;

public class Main {
    public static void main(String[] args) {
//        ValidateUsername.validate("user_123");
//
//        ValidateLicensePlate.validate("HR0110");
//
//        ValidateHexColor.validate("#FFA500");
//
//        ExtractEmails.extract("Contact us at support@example.com and info@company.org");
//
//        ExtractCapitalizedWords.extract("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");
//
//        ExtractDates.extract("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.");

//        ExtractLinks.extract("Visit https://www.google.com and http://example.org for more info.");

//        SpacesToSingleSpace.replace("This  is an example  with multiple spaces.");

        CensorBadWords.replace("This is a damn bad example with some stupid words.");
    }
}