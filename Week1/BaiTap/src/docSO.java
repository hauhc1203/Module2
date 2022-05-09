import java.util.Scanner;



public class docSO {

    static String docSo(int num){
        String result="" ;
        if(num/100>0){
            switch (num/100){
                case 1:
                    result+="one hundred ";
                    break;
                case 2:
                    result+="two hundred ";
                    break;
                case 3:
                    result+="three hundred ";
                    break;
                case 4:
                    result+="four hundred ";
                    break;
                case 5:
                    result+="five hundred ";
                    break;
                case 6:
                    result+="six hundred ";
                    break;
                case 7:
                    result+="seven hundred ";
                    break;
                case 9:
                    result+="nine hundred ";
                    break;
                case 8:
                    result+="eight hundred ";
                    break;
                default:
                    result+="out of ability ";
            }

        }
        if(num/100<10){
            if (num/100>0){
                result+=" and ";
            }
            int num1=num%100;
            if (num1>0){
                switch (num1/10){
                    case 1:
                        switch (num1%10){
                            case 0:
                                result+=" ten";
                                break;
                            case 1:
                                result+=" eleven ";
                                break;
                            case 2:
                                result+=" twelve ";
                                break;
                            case 3:
                                result+=" thirteen ";
                                break;
                            case 4:
                                result+=" fourteen ";
                                break;
                            case 5:
                                result+=" fifteen ";
                                break;

                            case 6:
                                result+=" sixteen";
                                break;
                            case 7:
                                result+=" seventeen";
                                break;
                            case 8:
                                result+=" eighteen ";
                                break;
                            case 9:
                                result+=" nineteen ";
                                break;
                        }
                        break;
                    case 2:
                        result+="twenty";
                        break;
                    case 3:
                        result+="thirty";
                        break;
                    case 4:
                        result+="fourty";
                        break;
                    case 5:
                        result+="fifty";
                        break;
                    case 6:
                        result+="sixty";
                        break;
                    case 7:
                        result+="seventy";
                        break;
                    case 8:
                        result+="eighty";
                        break;
                    case 9:
                        result+="ninety";
                        break;

                }


                if (num1/10!=1){
                    switch (num1%10){
                        case 1:
                            result+=" one";
                            break;
                        case 2:
                            result+=" two";
                            break;
                        case 3:
                            result+=" three";
                            break;
                        case 4:
                            result+=" four";
                            break;
                        case 5:
                            result+=" five";
                            break;
                        case 6:
                            result+=" six";
                            break;
                        case 7:
                            result+=" seven";
                            break;
                        case 8:
                            result+=" eight";
                            break;
                        case 9:
                            result+=" nine";
                            break;

                    }
                }
            }
        }



        return result;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen");
        int num=s.nextInt();
        if (num==0){
            System.out.println("zero");
        }else {
            System.out.println( docSo(num));
        }

    }
}
