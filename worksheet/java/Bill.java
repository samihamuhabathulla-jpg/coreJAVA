package worksheet.java;

import java.util.Scanner;
	public class Bill {
          public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter hours browsed : ");
			int hours = sc.nextInt();
			System.out.println("Enter minutes browsed : ");
			int minutes = sc.nextInt();
			int total_bill = 0;
			if(hours > 7) {
				System.out.println("Browsing time exceeded");
			}
			else if(hours >= 5) {
				total_bill = 200;
				System.out.println("Total bill is " + total_bill);
			}
			else {
				total_bill = (hours * 50) + (minutes * 1);
				System.out.println("Total bill is " + total_bill);
			}
		}

	}


