package JavaCoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfElmtsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int odd=0;
        int even=0;
        int sum=0;
        System.out.println("Enter the lenght of the array");
        n=sc.nextInt();
        int [] elements = new int[n];

        for (int i=0; i<n; i++)
        {
            elements[i] = sc.nextInt();
            if(elements[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            sum+=elements[i];
        }
        int [] oddNumbers = new int[odd];
        int [] evenNumbers = new int[even];

        int k=0,j=0;
        for (int i=0; i<n; i++)
        {
            if (elements[i]%2!=0 && k<odd){
                oddNumbers[k]=elements[i];
                k++;
        }}

        for (int i=0; i<n; i++)
        {
            if(elements[i]%2==0 && j<even){
                evenNumbers[j]=elements[i];
                j++;
        }}

        System.out.println("The sum of the array is: "+ sum+"\n"+ "Odd numbers: "+odd+ " Even numbers: "+even);

        System.out.println("evens are :");
        for (Integer a : evenNumbers)
        {
            System.out.print(a);
        }

        System.out.println("odds are :");
        for (Integer b : oddNumbers)
        {
            System.out.print(b);
        }

    }
}
