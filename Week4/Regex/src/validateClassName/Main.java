package validateClassName;

public class Main {
    public final static String REGEX_CLASS_NAME="^[CAP]\\d{4}[GHIKLM]";
    public static void main(String[] args) {
        String name="C1234G";
        System.out.println(name.matches(REGEX_CLASS_NAME));
    }
}
