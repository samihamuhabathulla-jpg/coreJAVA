package worksheet.java;

import java.util.Scanner;
public class seconds {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no.of days in a week : ");
			int days = sc.nextInt();
			System.out.println("Total seconds in a week is " + 86400 * days);
		}

	}


