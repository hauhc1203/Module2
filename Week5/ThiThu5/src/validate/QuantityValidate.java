package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantityValidate {
    Pattern pattern;
    Matcher matcher;
    private static final String SL_REGEX="\\d*";
    public boolean validate(String input){
        pattern=Pattern.compile(SL_REGEX);
        matcher=pattern.matcher(input);
        return matcher.matches();
    }
}
