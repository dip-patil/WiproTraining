import java.util.Arrays;

public class Assignment5 {
    public static void main(String[] args) {
        int arr[] = {45,67,89,133,455,57};
        Arrays.sort(arr);
        System.out.println("Smallest 2:"+ arr[0]+" "+arr[1]);
        System.out.println("Largest 2:"+ arr[arr.length-1]+" "+arr[arr.length-2]);
    }
}
