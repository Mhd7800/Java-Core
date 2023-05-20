package JavaCoreExercises;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        int original_num =a;
        int rev=0;

        while(a!=0)
        {
            rev = rev*10 + a%10;
            a = a/10;
        }

        if (original_num==rev)
        {
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not a palindrome");
        }





    }
}
