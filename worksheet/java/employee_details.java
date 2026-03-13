package worksheet.java;

import java.util.Scanner;
public class employee_details {
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String name;
	        double wage;
	        int days;
	        double total;

	        System.out.print("Enter Employee Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Wage per Day: ");
	        wage = sc.nextDouble();

	        System.out.print("Enter Number of Days Worked: ");
	        days = sc.nextInt();

	        if (days > 0) {
	            total = wage * days;
	            System.out.println("Total Salary of " + name + " is: " + total);
	        } else {
	            System.out.println("Invalid number of days");
	        }

	        sc.close();
	    }
	}



