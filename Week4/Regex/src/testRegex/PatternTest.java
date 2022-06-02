package testRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    private final static String END_STRING_REGEX="StackOverflow\\Z";

    public boolean validate(String input){
        Pattern pattern=Pattern.compile(END_STRING_REGEX);
        Matcher matcher=pattern.matcher(input);
        return matcher.find();
    }

}
