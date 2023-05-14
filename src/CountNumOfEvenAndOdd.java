public class CountNumOfEvenAndOdd {
    public static void main(String[] args) {

        int num = 105;
        int odd=0;
        int even=0;

        while (num>0)
        {
            int temp = num%10;
            if(temp%2==0)
            {
                even++;
            }else odd++;

            num=num/10;
        }

        System.out.println("Number of even: "+ even +" and number of odd is: "+odd);
    }
}
