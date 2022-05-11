import java.util.Scanner;

public class addValue {


    static int[] chenGiatri(int []arr,int value,int index){
        if(arr[index]==0){
            arr[index]=value;
        }else if (arr[arr.length-1]==0){
            for (int i=arr.length-1;i>index;i--){
                    arr[i]=arr[i-1];
            }
            arr[index]=value;
        }else {
            int arr1[]=new int[arr.length+1];
            for(int i=0;i<arr1.length;i++){
                if(i<index){
                    arr1[i]=arr[i];
                }else if(i>index){
                    arr1[i]=arr[i-1];
                }
            }
            arr1[index]=value;
            arr=arr1;
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,0,3,5,6,3,1,0};

        Scanner sc=new Scanner(System.in);
        int choice=-1;
       while (choice!=0){
           System.out.println("2. show mang");
           System.out.println("1. chen ");
           System.out.println("0. exit");
           choice=sc.nextInt();
           System.out.println("");;
           switch (choice){
               case 2:
                   for (int a:arr){
                       System.out.print(a+" ");
                   }
                   System.out.println("");
                   break;
               case 1:
                   System.out.println("Nhap vao gia tri muon chen");
                   int value= sc.nextInt();
                   System.out.println("Nhap vao vi tri ");
                   int index= sc.nextInt();
                   if(index<0||index>arr.length-1){
                       System.out.println("Khong chen duoc vao index da nhap");
                   }else {
                       arr=chenGiatri(arr,value,index);
                   }

                   break;
               case 0:
                   System.exit(0);
               default:
                   System.out.println("no choice");
           }
       }
    }
}
