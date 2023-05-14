public class FindDuplicates {
    public static void main(String[] args) {
        String[] array = new String[]{"C","java","python","Ruby"};
        String temp="";
        //Find the duplicates elements in the array

        boolean flag = false;
        for (int i=0 ; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if (array[j]==array[i])
                {
                    temp=array[j];
                    flag=true;
                    System.out.println(temp+" is duplicated");
                }
            }

        }

        if (flag==false) System.out.println("Duplicated element not found");


    }
}
