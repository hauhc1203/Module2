public class veHinh {
    public static void main(String[] args) {
        //hcn
        for (int i=0;i<4;i++){
            for (int j=0;j<8;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("");
        //tam giac vuong o goc duoi ben trai
        for (int i=0;i<8;i++){
            for (int j=0;j<i;j++){
               if(j<=i){
                   System.out.print(" *");
               }
            }
            System.out.println("");
        }

        System.out.println("");
        //tam giac vuong o goc tren ben trai
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if(j>i){
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }


        System.out.println("");
        //tam giac vuong o goc duoi ben phai
        for (int i=0;i<8;i++){
            for (int j=7;j>0;j--){
                if(j<i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //tam giac vuong o goc tren ben phai

        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if(j>i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //tam giac can
        for (int i=0;i<8;i++){
            for (int j=7;j>0;j--){
                if(j<i){
                    System.out.print(" *");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
