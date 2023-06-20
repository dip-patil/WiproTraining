public class Assignment1 {
    public static void main(String args[]) {
        int[] arr = { 5, 2, 6, 7, 4, 11, 21, 23 };
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(sum / arr.length);

    }
}