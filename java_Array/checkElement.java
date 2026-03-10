package java_Array;

public class checkElement {
	    public static boolean isPresent(int arr[], int key) {

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return true;   
	            }
	        }
	        return false; 
	    }
	    public static void main(String[] args) {

	        int arr1[] = {5, 1, 1, 9, 7, 2, 6, 10};
	        int key1 = 7;
	        System.out.println(isPresent(arr1, key1)); 
	        int arr2[] = {-1, 1, 5, 8};
	        int key2 = -2;
	        System.out.println(isPresent(arr2, key2));  
	    }
	}


