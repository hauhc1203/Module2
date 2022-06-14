package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceValidate {
    Pattern pattern;
    Matcher matcher;
    private static final String PRICE_REGEX="\\d+\\.?\\d*";
    public boolean validate(String input){
        pattern=Pattern.compile(PRICE_REGEX);
        matcher=pattern.matcher(input);
        return matcher.matches();
    }
}
