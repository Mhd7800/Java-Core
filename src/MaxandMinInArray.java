public class MaxandMinInArray {
    public static void main(String[] args) {
        int[] a = new int[]{1,10, 2, 3,15};
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
        }
        System.out.println("largest element in the array: "+ largest);
    }
}
