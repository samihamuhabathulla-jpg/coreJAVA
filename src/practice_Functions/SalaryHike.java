package practice_Functions;

import java.util.Scanner;

public class SalaryHike {
	   public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Old Salary : ");
			int old_salary = sc.nextInt();
			System.out.println("Enter the hike in percentage : ");
			int hike = sc.nextInt();
			System.out.println("The Employer's new salary with hike is "+calculateHike(old_salary,hike));
			
		}
	   
		public static float calculateHike(int oldSalary, int hike) {
			float ans = oldSalary + (oldSalary*hike/100);
			return ans;
		}

	}


