package testRegex;

public class Main {
    public static void main(String[] args) {
        String input="StackOverflow\\n";
        PatternTest patternTest=new PatternTest();
        System.out.println(patternTest.validate(input));
    }
}
