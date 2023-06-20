import java.util.Arrays;

public class Assignment11 {
    public static void main(String[] args) {
        int a1[] ={10,20,30};
        int a2[] ={20,30,40};
        int mid = a1.length/2;
        int m[] = new int[2];
        m[0] = a1[mid];
        m[1] = a2[mid];
        System.out.println(Arrays.toString(m));


    }
}
