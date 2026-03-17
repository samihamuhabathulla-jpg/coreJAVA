package worksheet.java;

import java.util.Scanner;

public class bloodEligibility {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			System.out.println("Enter weight : ");
			int weight = sc.nextInt();
			if((age>18 && age<55) && (weight>45)) {
				System.out.println("Eligible");
			}
			else {
				System.out.println("Not Eligible");
			}

		}
	}


