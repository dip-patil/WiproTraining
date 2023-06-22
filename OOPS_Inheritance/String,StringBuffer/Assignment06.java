import java.util.Scanner;

public class Assignment06 {
    static String alternateStringConcate(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str2.concat(str1).concat(str2);
        } else {
            return str1.concat(str2).concat(str1);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the 2nd string: ");
        String str2 = scan.nextLine();
        System.out.println(alternateStringConcate(str1, str2));

    }
}
