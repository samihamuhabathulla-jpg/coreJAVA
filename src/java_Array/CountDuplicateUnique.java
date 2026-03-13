package java_Array;

import java.util.Scanner;
	public class CountDuplicateUnique {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int duplicateCount = 0;
	        int uniqueCount = 0;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            if (count > 1) {
	                duplicateCount++;
	            } else {
	                uniqueCount++;
	            }
	        }
	        duplicateCount = duplicateCount / 2;

	        System.out.println("No of duplicate element: " + duplicateCount);
	        System.out.println("No of unique elements: " + uniqueCount);
	        sc.close();
	    }
	}


