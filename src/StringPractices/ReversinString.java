package StringPractices;

public class ReversinString {
        public static String reverseString(String str){
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(reverseString("Kingsley"));
    }

    }

