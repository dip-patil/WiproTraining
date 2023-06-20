public class Assignment10 {
    public static void main(String[] args) {
        int []arr = {1,4,1,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1 || arr[i]==4)
            {
                count++;
            }
        }
        if(count==arr.length)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
