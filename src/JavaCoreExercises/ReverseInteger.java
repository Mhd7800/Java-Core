package JavaCoreExercises;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReverseInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("write an integer : ");
        int a = sc.nextInt();

        int rev =0;

        while(a!=0){

            rev = rev*10+ a%10; // 0 +4

            a = a/10; //

        }
        System.out.println(rev);


    }
}