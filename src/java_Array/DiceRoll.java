package java_Array;

import java.util.Random;
	public class DiceRoll {
	    public static void main(String[] args) {
	        int freq[] = new int[7]; 
	        Random r = new Random();
	        for (int i = 0; i < 100; i++) {
	            int number = r.nextInt(6) + 1;   
	            freq[number]++;  
	        }
	        for (int i = 1; i <= 6; i++) {
	            System.out.println("Number " + i + " appeared " + freq[i] + " times");
	        }
	    }
	}


