package practice_java;

import java.util.Scanner;

public class ReadSomeInput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Hi "+name+" Welcome to the trainig program...");
		
		sc.close();
	}

}
