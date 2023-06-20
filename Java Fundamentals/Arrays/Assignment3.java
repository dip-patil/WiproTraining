public class Assignment3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,89};
        int k= Integer.parseInt(args[0]);
        int left =0,right=arr.length-1;
        boolean flag=false;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]==k)
            {
                System.out.println(mid);
                flag=true;
                break;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(flag==false)
        {
            System.out.println(-1);
        }
    }
}
