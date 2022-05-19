package bt3;

public class TriangleClassifier {


   public static boolean isTriangle(int canh1,int canh2, int canh3){
       boolean tong2canh1=(canh1+canh2)>canh3;
       boolean tong2canh2=(canh3+canh2)>canh1;
       boolean tong2canh3=(canh1+canh3)>canh2;

        if(tong2canh1&&tong2canh3&&tong2canh2){
            return  true;
        }else  return  false;
   }

   public  static  String loaiTamgiac(int c1,int c2,int c3){
       String result="";
        if (isTriangle(c1,c2,c3)){
            boolean dkTamgiacvuong=c1*c1+c2*c2==c3*c3;
            boolean dkTamgiacvuong1=c1*c1+c3*c3==c2*c2;
            boolean dkTamgiacvuong2=c3*c3+c2*c2==c1*c1;




            if (c1==c2&&c2==c3) {
                result="tam giac deu";
            }else if(dkTamgiacvuong||dkTamgiacvuong1||dkTamgiacvuong2){
                result="tam giac vuong";
            }else result="tam giac thuong";

        }else {
            result="khong phai la tam giac";
        }

       return result;
   }
}
