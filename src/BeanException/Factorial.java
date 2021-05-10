package BeanException;

public class Factorial {
    public static void main(String... args) {

       // System.out.println(factorial(0));
        System.out.println(exponential(3));
        System.out.println(exponentialForSquareNumbers(4));
        System.out.println(positiveExponentialForNonSquare(3));
    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else return (n * factorial(n - 1));
    }

    public static double exponentialForSquareNumbers(double num) {
        double e = 0;
        double d = 0;
        for (int counter = 1; counter <= num; counter++) {
            d += Math.pow(counter, 2) / factorial(counter);
        }
        return d;
    }

    public static double exponential(double num) {
        return 1 + positiveExponentialForNonSquare(num);
    }
    public static double positiveExponentialForNonSquare(double num) {
        double e = 0;
        double d = 0;
        for (int counter = 1; counter <= num; counter++) {
            e += 1.0 / factorial(counter);
        }
        return e;
    }
public  static  double exponentialForSquare(double num){
        return 1+exponentialForSquareNumbers(num);
}
}