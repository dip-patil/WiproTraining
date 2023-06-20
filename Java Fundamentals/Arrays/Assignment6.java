public class Assignment6 {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,4};
        int n =arr.length;
        int i=1,j=1;
        while(i<n)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j]=arr[i];
                j++;
            }
            i++;
        }
        for(int a=0;a<j;a++)
        {
            System.out.println(arr[a]);
        } 
    }
}
