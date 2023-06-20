import java.util.Arrays;

public class Assignment8 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 10, 2};

        int[] modifiedArray = new int[numbers.length];
        int index = 0;
        int zeroCount = 0;

        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] == 10) {
                zeroCount++;
            } else {
                modifiedArray[index] = numbers[i];
                index++;
            }
        }

        while (zeroCount > 0) {
            modifiedArray[index] = 0;
            index++;
            zeroCount--;
        }

        System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
    }
}
