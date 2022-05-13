public class TestStaticMethod {
    public static void main(String args[]) {
        staticMethod.change(); //calling change method

        //creating objects
        staticMethod s1 = new staticMethod(111, "Hoang");
        staticMethod s2 = new staticMethod(222, "Khanh");
        staticMethod s3 = new staticMethod(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
