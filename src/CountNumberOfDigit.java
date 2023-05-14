public class CountNumberOfDigit {

    public static void main(String[] args) {
        int num = 321;
        int counter=0;

        while(num!=0)
        {
            num = num/10;
            counter++;
        }

        System.out.println("number of digits is: "+ counter);

    }
}
