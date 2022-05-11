import java.util.Scanner;

public class demSVquaMon {
    static int c=0;

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("arr["+i+"]: ");
            array[i]=scanner.nextInt();
            if (array[i]>=5){
                c++;
            }
        }
        System.out.println("so sinh vien qua mon la: "+c);
    }
}
