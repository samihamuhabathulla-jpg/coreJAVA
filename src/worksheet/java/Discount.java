package worksheet.java;

import java.util.Scanner;
public class Discount {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter price : ");
			double price = sc.nextDouble();
			System.out.println("Enter quantity : ");
			int quantity = sc.nextInt();
			double purchase_amount = price*quantity;
			double discount_amount;
			double paid_amount;
			if(purchase_amount > 1000) {
				discount_amount = purchase_amount*0.10;
			}
			else {
				discount_amount = purchase_amount*0.05;
			}
			paid_amount = purchase_amount - discount_amount;
			System.out.println("Purchase Amount is " + purchase_amount);
			System.out.println("Discount Amount is " + discount_amount);
			System.out.println("Paid Amount is " + paid_amount);
		}

	}


