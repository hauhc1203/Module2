package validateTel;

public class Test {
    public final static String REGEX_TEL="\\(\\d{2}\\)\\-\\(0\\d{9}\\)";


    public static void main(String[] args) {
        String tel="(34)-(0123456789)";
        System.out.println(tel.matches(REGEX_TEL));
    }
}
