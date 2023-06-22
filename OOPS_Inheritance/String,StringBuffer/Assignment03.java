import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.substring(0, 2));
        }
    }

}
