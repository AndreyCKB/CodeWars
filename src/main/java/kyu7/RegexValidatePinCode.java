package kyu7;
//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//If the function is passed a valid PIN string, return true, else return false.
//
//eg:
//
//Solution.validatePin("1234") === true
//Solution.validatePin("12345") === false
//Solution.validatePin("a234") === false
import java.util.regex.Pattern;

public class RegexValidatePinCode {

    public static boolean validatePin(String pin) {
        // Your code here...
        String pin4="\\d{4}";
        String pin6="\\d{6}";
        return (Pattern.matches(pin4, pin) || Pattern.matches(pin6, pin));
    }
}
