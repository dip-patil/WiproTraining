import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        int [][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int [][] rev = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
            rev[i][j] = arr[arr.length-1-i][arr[i].length-1-j];

            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(rev[i][j]);
            }
            System.out.println();
        }


        

    }
}
