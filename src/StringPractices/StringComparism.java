package StringPractices;

import java.util.Arrays;

public class StringComparism {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="goodbye";
        String s3="hello";
        String s4="23";
        System.out.println(s4.compareTo(s1));
        System.out.println(s3.compareTo(s1));
        System.out.println(s4);
        System.out.println(s1.regionMatches(0,s2,0,6));
        System.out.println(s1.length());
    int y=5;
    int[] objArr={1,2,3,4};
    modifyContent(y,objArr);
        //System.out.println(y);
       // System.out.println(Arrays.toString(objArr));
    }

static void modifyContent(int x,int[] arr){
        x++;
        arr[0]++;
}
}
