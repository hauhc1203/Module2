import java.util.Scanner;

public class gopArr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tao mang 1");
        System.out.println("nhap vao kick thuoc mang");
        int size1=scanner.nextInt();
        int arr1[]=new int[size1];
        for (int i=0;i<size1;i++){
            System.out.print("arr1["+i+"]= ");
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Tao mang 2");
        System.out.println("nhap vao kick thuoc mang");
        int size2=scanner.nextInt();
        int arr2[]=new int[size2];
        for (int i=0;i<size2;i++){
            System.out.print ("arr2["+i+"]= ");
            arr2[i]=scanner.nextInt();
        }
        int []arr3=new int[arr1.length+arr2.length];

        boolean check=false;
        int choice=-1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Show arr1");
            System.out.println("2. Show arr2");
            System.out.println("3. Gop mang");
            System.out.println("4. Show arr da duoc gop");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("mang 1");
                    for (int a:arr1){
                        System.out.print(a+" ");
                    }
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("mang 2");
                    for (int a:arr2){
                        System.out.print(a+" ");
                    }
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.arraycopy(arr1,0,arr3,0,arr1.length);
                    System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
                    check=true;
                    break;
                case 4:
                    if (check){
                        System.out.println("mang 3");
                        for (int a:arr3){
                            System.out.print(a+" ");
                        }

                    }else {
                        System.out.println("Ban phai gop mang truoc");
                    }
                    System.out.println("");
                    System.out.println("--------------------------------------");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
