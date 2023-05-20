package JavaCoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number :");
        int a = sc.nextInt();
        List<Integer> arrList = new ArrayList<>();
        int temp;
        int count=0;
        // checking a number whether it is prime or not , a prime number is a number which is only be divided by 1 and itself
        // (e.g. 2,3,5,7,11,13,17,19)
        for (int i =1; i<=a; i++)
        {
            temp=a%i;
           if (temp==0) count++;

        }

        if(count==2)
            System.out.println("Prime");
        else System.out.println("Not Prime");




    }
}
