package validateName;

public class ValidateName {
    public final static String VN_NAME_REGEX="([A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểếễệỉịọỏốồổỗộớờởỡợụủứừđ]+\\s?)+";
    public static boolean validate(String input) {
        return input.matches(VN_NAME_REGEX);
    }


    public static void main(String[] args) {
        String name="Hoàng Công Hậu ";

        System.out.println(validate(name));

    }

}
