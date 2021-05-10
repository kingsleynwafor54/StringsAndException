package BeanException;

import java.util.Scanner;

public class Triangle
        {
            Scanner input = new Scanner( System.in );
            public boolean checkSides(int side1,int side2,int side3)
            {
                boolean isRightTriangle=false;
                int side1Square = side1 * side1;
                int side2Square = side2 * side2;
                int side3Square = side3 * side3;

                if ( ( side1Square + side2Square ) == side3Square )
                    isRightTriangle = true;
                else if ( ( side1Square + side3Square ) == side2Square )
                    isRightTriangle = true;
                else if ( ( side2Square + side3Square ) == side1Square )
                    isRightTriangle = true;

                if ( isRightTriangle )
                    System.out.println( "These are the sides of a right triangle." );
                else
                    System.out.println( "These do not form a right triangle." );
           return isRightTriangle;

            }

            public static void main(String[] args) {
                Triangle triangle=new Triangle();
                System.out.println( triangle.checkSides(3,4,5));
            }
        }



