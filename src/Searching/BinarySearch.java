package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr = new int[]{1,3,6,15,8,0};
        int[] arr = {1,3,6,15,18,20}; //only sorted array
        int key=1;
        int lower=0;
        int higher=arr.length-1;
        int middle = (lower+higher)/2;
        
        //case 1 -> key=middle
        //case 2 -> key<middle -->> higher = middle-1
        //case 3 -> key>middle -->> lower = middle+1
        boolean flag = false;
        while(lower<=higher) {

            if (key == arr[middle]) {
                System.out.println("element found at index: "+ middle );
                flag=true;
                break;
            }
            else if (key<arr[middle]){
                higher=middle-1;
            }
            else {
                lower= middle+1;
            }
            middle = (lower+higher)/2;
        }
        if (!flag)
        {
            System.out.println("Element not found");
        }

    }
}
