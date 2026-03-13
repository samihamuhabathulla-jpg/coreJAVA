package worksheet.java;

import java.util.Scanner;
public class sumOfDigits {
	public static void main(String[]args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int add = 0;
			while(n>0) {
				add+=n%10;
				  n/=10;
				}
				System.out.println("The sum of the digits is "+add);
			}
	}


