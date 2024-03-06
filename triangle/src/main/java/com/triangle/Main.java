package com.triangle;


public class Main {
   /*  public static void main(String[] args) {
        System.out.println(checkTriangle(50, 50, 5));
    } */

   
    public static String checkTriangle(int a, int b, int c) {
        if ( !(a >= 1 && a <= 200) ) {
            return "Value of a is not in the range of permitted values.";
        }
        if ( !(b >= 1 && b <= 200) ) {
            return "Value of b is not in the range of permitted values.";
        }
        if ( !(c >= 1 && c <= 200) ) {
            return "Value of c is not in the range of permitted values.";
        }


        if ( (b + c > a ) && (a + c > b) && (b + a > c)) {          
            if (a == b && b == c && a == c) {
                return "Equilateral";
            } else if (a == b || b == c || a == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else{
            return "NotATriangle";
        }

    }


}