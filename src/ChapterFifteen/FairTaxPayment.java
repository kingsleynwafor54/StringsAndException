package ChapterFifteen;

import java.util.Scanner;

public class FairTaxPayment {
    public double fairTaxPayment(int house,int food,int clothing,int transport,int education){
        return house(house)+food(food)+clothing(clothing)+transport(transport)+education(education);
    }
public static double house(int house){
        return house*0.3 ;
}
public static double food(int food){
        return food*0.3;
}
public static double clothing(int clothing){
        return clothing*0.3;
}
public static double transport(int transport){
        return transport*0.3;
}
public static double education(int education){
        return education*0.3;
}


    public static void main(String[] args) {
        FairTaxPayment fairTax=new FairTaxPayment();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your income");
        int income=scanner.nextInt();
        System.out.println("Enter Your expenses on your house");
        int house =scanner.nextInt();
        System.out.println("Enter your expenses on your food");
        int food=scanner.nextInt();
        System.out.println("Enter your expenses on your clothing");
        int clothing=scanner.nextInt();
        System.out.println("Enter your expenses on transport");
        int transport=scanner.nextInt();
        System.out.println("Enter your expenses on education");
        int education=scanner.nextInt();

        double fairExpenseTax=fairTax.fairTaxPayment(house,food,clothing,transport,education);
        System.out.println("Your fairTax value is $"+fairExpenseTax);

        double incomeLeft=income-fairExpenseTax;
        System.out.println("Your income left is:  $"+incomeLeft);
    }
}
