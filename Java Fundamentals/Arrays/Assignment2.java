public class Assignment2 {
    public static void main(String args[])
    {
        int[] array={5,3,7,8,9,1};
        int min1=array[0];
        int max1=array[0];
        for(int i:array)
        {
            if(min1>=i)
            {
                min1=i;
            }
             if(max1<=i)
            {
                max1=i;
            }
        }
         
        
        System.out.println(min1);
        System.out.println(max1);
    }
}
