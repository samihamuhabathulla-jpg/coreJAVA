package worksheet.java;

import java.util.Scanner;
public class Calander {
	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter month number : ");
				int month = sc.nextInt();
				if(month < 1 || month > 12) {
					System.out.println("Invalid");
					break;
				}
				System.out.println("Enter starting day : ");
				int startDay = sc.nextInt();
				int days = 0;
				if(month == 2) {
					System.out.println("Enter number of days : ");
					days = sc.nextInt();
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11) {
					days = 30;
				}
				else {
					days = 31;
				}
				System.out.println("Mon Tue Wed Thu Fri Sat Sun");
				for(int i = 1; i < startDay; i++) {
					System.out.print("    ");
				}
				for(int i = 1; i <= days; i++) {
					System.out.printf("%-4d", i);
					if((i + startDay - 1) % 7 == 0) {
						System.out.println();
					}
				}
				System.out.println();
		}
		}
	}
	


