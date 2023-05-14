public class CountSumOfDigit {
    public static void main(String[] args) {
        int num= 1234;
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
            //System.out.println("temp:"+temp+"sum:"+sum+"num:"+num+"\n"); //just to see what is going on
        }

        System.out.println("Number of digit is :"+ sum);

    }
}
