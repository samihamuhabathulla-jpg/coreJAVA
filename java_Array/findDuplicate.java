package java_Array;

public class findDuplicate {
	    public static void main(String[] args) {
	        int arr[] = {1, 3, 4, 2, 5, 3, 6, 2};
	        System.out.println("Duplicate elements are:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    break;   // to avoid printing same duplicate again
	                }
	            }
	        }
	    }
	}


