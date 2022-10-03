package week03_09_24_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result=false;
        int a=10;
        if (result&a++<12){

        }
        System.out.println("a = " + a);//11



        int b=10;
        // false it will look at this statement and increment
        if (result && b++<12);{


        }
        System.out.println("b = " +b);

    }
}
