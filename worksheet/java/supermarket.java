package worksheet.java;

import java.util.Scanner;
public class supermarket {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter price per item : ");
			double price = sc.nextDouble();
			System.out.println("Enter quantity purchased : ");
			int quantity = sc.nextInt();
			double total = price * quantity;
			if(quantity > 500) {
				double discount = total * 0.15;
				total = total - discount;
			}
			System.out.println("Total expenses is " + total);
		}

	}


