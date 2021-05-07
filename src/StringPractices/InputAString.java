package StringPractices;

public class InputAString {
    public static void main(String... args){
        System.out.println("Learning java is\"fun\" ");
        char c=(char)0XAB0041;
        char d=(char)0XAB057;
        char e=(char)65.25;
//        char c = 'A';
        int a= (int)c;
        float f = 1000.34f;
        int i = (int)f;
        double b = 1000.34;
        int h = (int)d;
        int g = 97;
        char j = (char)i;
        char x = 'a';
        char y = 'c';
        System.out.println("   welcome to this java tutorial   ".trim());
      //  System.out.println("welcome to this java tutorial");
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(1+" the light of God");
        int value =Integer.parseInt("123");
        Double value1 =Double.parseDouble("123");
        System.out.println(value);
        System.out.println(value1);
        String s1="Here is man that took the plant daughter";
        for(int counter=s1.length()-1;counter>=0;counter--){
            System.out.print(s1.charAt(counter));
        }
    }

}
