import java.util.Scanner;

public class Assignment07 {
    static String removeFirstLastLetter(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        System.out.println(removeFirstLastLetter(str));
    }
}
