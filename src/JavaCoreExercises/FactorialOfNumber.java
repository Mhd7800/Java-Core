package JavaCoreExercises;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int facorial=1;

        for (int i = num; i>=1;  i--)
        {
            facorial*= i;
        }

        System.out.println(facorial);
    }
}
