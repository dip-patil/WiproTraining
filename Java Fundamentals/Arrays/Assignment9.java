import java.util.Arrays;

public class Assignment9 {
    public static void main(String[] args) {
        int []arr = {3,3,2,2,4,5};
        int []marr=new int[arr.length];
        int evenIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                marr[evenIndex]=arr[i];
                evenIndex++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
                marr[evenIndex]=arr[i];
                evenIndex++;
            }
            
        }
    

        System.out.println(Arrays.toString(marr));

    }
}
