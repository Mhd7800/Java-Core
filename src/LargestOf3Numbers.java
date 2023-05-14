import java.util.ArrayList;
import java.util.Comparator;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //First way -- the simplest
//        if (a>b && a>c) System.out.println(a+" is largest");
//        if (b>a && b>c) System.out.println(b+" is largest");
//        if (c>b && c>a) System.out.println(c+" is largest");


        //Ternary operator
        int largest1 = a>b?a:b;
        int largest2 = largest1>c?largest1:c;

        System.out.println(largest2 + " is the largest number");





    }
}
