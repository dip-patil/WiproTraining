

import java.util.Scanner;

public class Assignment05 {

	static String trimFirstLast(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(trimFirstLast(str));
	}

}
