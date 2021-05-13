package StringPractices;

public class SeparatingNumbers {


    public static int separator(int a, int b) {
        return a / b;
    }

    public static int separatorRemainder(int a, int k) {
        return a % k;
    }

    public static int separatingAllDigits(int a) {
        int n = 0;
        for (int counter = 0; counter < 4; counter++) {
            n = a % 10000;

        }
        return n;
    }

    public static String displaySeparatedDigits(int a, int b) {
        return separator(a, b)+" "+separatorRemainder(a,b);
    }

//            return separatorRemainder(a,b);
//        }
public static String displayMethod(int  value){
        int unit=0;
        String newValue=" ";
        while (value>0){
           unit=separatorRemainder( value,10);
           newValue=unit+"   "+newValue;
           value=  separator(value, 10);


        }
    return newValue;
    }
        public static void main(String[] args) {
            System.out.println(displayMethod(1234));
        }
    }




