//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		if (rev.equals(str))
			System.out.print("String is Palindrome!");
		else
			System.out.print("String is not Palindrome!");
	}

}
