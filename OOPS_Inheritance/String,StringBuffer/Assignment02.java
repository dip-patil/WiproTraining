
import java.util.Scanner;

public class Assignment02 {
	
	static String append(String str1, String str2) {
		String outStr = "";
		if (str1.charAt(str1.length()-1) == str2.charAt(0))
			outStr = str1.substring(0, str1.length()-1) + str2;
		else
			outStr = str1 +" " + str2;
		
		return outStr.toLowerCase();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
	
		System.out.println(append(str1, str2));
	}

}
