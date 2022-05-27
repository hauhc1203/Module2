package bai1;

public class Validate {

    public static boolean checkName(String name){
        for (int i = 0; i <name.length() ; i++) {
            try {
                Integer.parseInt(Character.toString(name.charAt(i)));
                return false;
            }catch (Exception e){
            }
        }
        return true;
    }
}
