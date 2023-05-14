public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci : a series of numbers which one number is the sum of the two previous number
        // 0 1 1 2 3 5 8 13 21
        int n1=1;
        int n2=2;
        int sum=0;
        System.out.println(n1+" "+n2);
        for(int i=2; i<9; i++)
        {
            sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }
   }
}