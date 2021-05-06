package StringPractices;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder km = new StringBuilder("kingsley");

//    }
//        public static void stringPatterns(String input){
        for (int count = km.length() - 1; count >= 0; count--) {
            System.out.printf("%c ", km.charAt(count));
        }

    }
}

