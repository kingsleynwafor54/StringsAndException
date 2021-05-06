package StringPractices;

public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Hello how are you");
        System.out.printf("Content--> %s%n Length of the string is %d%n | Capacity is %d%n",sb,sb.length(),sb.capacity());

sb.ensureCapacity(75);
        System.out.printf("Content--> %s%n Length of the string is %d%n | Capacity is %d%n|After the capacity %d%n",sb,sb.length(),sb.capacity(),sb.capacity());

    }
}
