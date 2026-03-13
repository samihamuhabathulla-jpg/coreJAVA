package worksheet.java;

import java.util.Scanner;

public class do_while_loop {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of i : ");
			int i = sc.nextInt();
			int sum = 0;
			int n = 1;
			do {
				sum = sum + n;
				n++;
			} while(n <= i);
			System.out.println("Sum of series is " + sum);
		}

	}


