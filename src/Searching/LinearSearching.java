package Searching;
/*
We are searching from the first index to the last index,


 */
public class LinearSearching {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,19,4,5};
        int a= 5;
        boolean flag = false;

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]==a)
            {
                flag=true;
                System.out.println(a+" found at index: "+i);
                break;
            }
        }

        if (flag==false)
            System.out.println("Not found");
    }
}
