package worksheet.java;

import java.util.Scanner;
public class SalaryMedium {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Basic Salary : ");
			double basic_salary = sc.nextDouble();
			double hra = 0;
			double da = 0;
			double gross_salary;
			if(basic_salary <= 10000) {
				hra = basic_salary * 0.20;
				da = basic_salary * 0.80;
			}
			else if(basic_salary <= 20000) {
				hra = basic_salary * 0.25;
				da = basic_salary * 0.90;
			}
			else {
				hra = basic_salary * 0.30;
				da = basic_salary * 0.95;
			}
			gross_salary = basic_salary + hra + da;
			System.out.println("HRA is " + hra);
			System.out.println("DA is " + da);
			System.out.println("Gross Salary is " + gross_salary);
		}

	}


