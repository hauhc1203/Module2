package validate;

public class ValidateUserName {
    public final static String User_name="[\\w]*";
    public static boolean validate(String input) {
        return input.matches(User_name);
    }

}
