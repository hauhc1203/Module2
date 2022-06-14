package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChoiceValidate {
    Pattern pattern;
    Matcher matcher;
    private final static String CHOICE_REGEX="[0-8]";

    public  boolean validate(String input){
        pattern=Pattern.compile(CHOICE_REGEX);
        matcher=pattern.matcher(input);
        return matcher.matches();
    }

}
