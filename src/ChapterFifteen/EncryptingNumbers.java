package ChapterFifteen;

import java.util.Scanner;

public class EncryptingNumbers {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
        int tem=6542;
        int k=tem;
        int m=(k/1000+7)%10;
        int n=(((k%1000)/100)+7)%10;
        int v=((k%1000%100/10)+7)%10;
        int u=((k%1000%100%10)+7)%10;


//        System.out.print(m);
//        System.out.print(n);
//        System.out.print(v);
//        System.out.print(u);
//    v*=1000;
//    m*=100;
//    u*=10;
    //int em=v+m+u+n;
    String  resultingNumber=n+""+m+""+u+""+v;

        System.out.println(n+""+m+""+u+""+v);
        //System.out.println(resultingNumber);
       // System.out.println(em);

    }
}
