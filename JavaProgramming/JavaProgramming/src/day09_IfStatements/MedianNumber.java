package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 20,
                b = 55,
                c = 10;
        //if we have three different numbers,one MUST  be maximum,one MUST be minimum and one MUST be median



        //                     a= 15,  b= 10, c= 20    a =15, c= 10, b= 20
        boolean aIsMedian= (a > b && a < c) || (a > c && a < b);
        /*
        in order for a to be the median number
          1. if c is the maximum number & b is the minimum number, then a is the median number
          2. if b is the maximum number & c is the minimum number, then a is the median number
         */

        //                   b=15,  a = 20, c= 10,        b= 15, a = 10, c=20
        boolean bIsmedian = (b > c && b < a) || (b > a && b < c);
         /*
        in order of b to the median number:

        */


        boolean cIsmedian = !aIsMedian && !bIsmedian;

        if (aIsMedian){ // if a is the median number
            System.out.println( a+" is the median number");

        }
        if (bIsmedian){//if b is the median number
            System.out.println( b+" is the median number");
        }

        if (cIsmedian){//if c is the median number
            System.out.println( a+" is the median number");
        }




    }






}

