public class Assignment7 {
    public static void main(String[] args) {
        int [] arr ={10,3,6,1,2,7,9};
        boolean exclude=false;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==6)
            {
                exclude=true;
            }
            else if(arr[i]==7 && exclude)
            {
                exclude=false;
                continue;
            }

            if(!exclude)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
        
        
    }
}
