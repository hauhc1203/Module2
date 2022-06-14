package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MSPValidate {
    Pattern pattern;
    Matcher matcher;
    private static final String MSP_REGEX="\\w{4}";
    public boolean validate(String input){
        pattern=Pattern.compile(MSP_REGEX);
        matcher=pattern.matcher(input);
        return matcher.matches();
    }
}
