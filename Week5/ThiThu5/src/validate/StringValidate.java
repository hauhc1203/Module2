package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidate {
    Pattern pattern;
    Matcher matcher;
    private static final String STRING_REGEX="[\\w\\s]+";


    public boolean validate(String input){
        pattern=Pattern.compile(STRING_REGEX);
        matcher=pattern.matcher(input);
        return matcher.matches();
    }
}
