package Java_String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
	public static boolean validateEmail(String email) {
		String regex ="^[A-Za-z][A-Za-z0-9._-]*[A-Za-z0-9]@([A-Za-z0-9]+(-[A-Za-z0-9]+)*\\.)+[A-Za-z]{2,}$";
		return Pattern.matches(regex,email);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email:");
		String email = sc.nextLine();
		
		if(validateEmail(email)) {
			System.out.println("Valid Corporate Email");
		}else {
			System.out.println("Invalid Email");
		}
		sc.close();
	}
}
