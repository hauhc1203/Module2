package validate;

public class PasswordValidate {
    public final static String PASSWORD_VALIDATE ="[[^ÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểếễệỉịọỏốồổỗộớờởỡợụủứừđ\\s].]{8,15}";
    public static boolean validate(String input) {
        return input.matches(PASSWORD_VALIDATE);
    }
}
