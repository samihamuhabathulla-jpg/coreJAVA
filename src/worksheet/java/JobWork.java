package worksheet.java;

import java.util.Scanner;

public class JobWork {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of pages : ");
			int pages = sc.nextInt();
			System.out.println("Enter number of copies : ");
			int copies = sc.nextInt();
			int typing_charge = pages*3;
			int printing_charge;
			if(copies == 1) {
				printing_charge = pages*1;
			}
			else {
				printing_charge = (pages*1) + (pages*(copies - 1)*3);
			}
			int total_bill = typing_charge + printing_charge;
			System.out.println("Total bill is " + total_bill);
		}

	}


