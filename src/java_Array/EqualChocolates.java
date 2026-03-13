package java_Array;

import java.util.Scanner;
	public class EqualChocolates {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of friends: ");
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        int sum = 0;
	        System.out.println("Enter chocolates each friend has:");
	        for (int i = 0; i < N; i++) {
	            arr[i] = sc.nextInt();
	            sum = sum + arr[i];
	        }
	        if (sum % N == 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	        sc.close();
	    }
	}


