package Sorting;
import java.util.Arrays;

/*
We need two loops , one to count the number of pass and the second to search trough the array


 */

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {56, 4, 2, 16, 5, 0};

        System.out.println("Before sorting: "+ Arrays.toString(a));
    // 1st way
        for (int i = 0; i < a.length - 1; i++) {

            {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }}


            System.out.println("After sorting: "+ Arrays.toString(a));



    }
}