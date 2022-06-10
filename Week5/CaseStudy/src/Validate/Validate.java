package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private final static String  TEN_MAY="\\w{6,15}";
    Pattern pattern;

    Matcher matcher;


    public boolean tenMay(String tenM){
        pattern=Pattern.compile(TEN_MAY);
        matcher=pattern.matcher(tenM);
        return matcher.matches();
    }

}
