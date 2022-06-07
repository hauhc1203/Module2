package validate;

public class ValidateUserName {
    public final static String User_name="[\\w]{8,15}";
    public static boolean validate(String input) {
        return input.matches(User_name);
    }

}
