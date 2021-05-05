package StringPractices;

import java.util.Arrays;
import java.util.Locale;

public class StringPractices {

    public static void main(String[] args) {
        String a="John";
        String b="John";
        String v= new String("John");
        char[] charArray={'a','6','w','k','J','K','Y','Z'};
        String y=new String(charArray);
        String k= new String(charArray,3,4);
        String[] Hy={"kingsley","Jesus","KIng"};
        //String k= new String(StringArray,3,2);
        System.out.println(a==v);
        System.out.println(a.equals(v));
        System.out.println(a+" "+b);
        String x=v;
        x=v.intern();
        System.out.println(x);
        System.out.println(a);
        System.out.println(x==a);
        System.out.println(k.toLowerCase());
        System.out.println(a.charAt(2));
        System.out.println();
        //getting a copy into characters
        char[] result  =new  char[5];
        a.getChars(0,4,result,0);
        System.out.println(Arrays.toString(result));
        // looping through to display the reverse of the string
        for(int i=0;i<a.length()-1;i++){
            System.out.println(a.charAt(i));
        }
    }
}
