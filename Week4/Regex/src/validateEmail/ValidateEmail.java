package validateEmail;

public class ValidateEmail {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };


    public static void main(String[] args) {
        emailExample=new EmailExample();
        for (String s:validEmail
        ) {
            System.out.println(   emailExample.validate(s));
        }
        for (String s:invalidEmail
        ) {
            System.out.println(   emailExample.validate(s));
        }
    }


}
