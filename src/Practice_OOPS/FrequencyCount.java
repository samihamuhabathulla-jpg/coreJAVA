package Practice_OOPS;

public class FrequencyCount {
	    public static void main(String[] args) {
	        int my_record[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};
	        int n = my_record.length;
	        boolean visited[] = new boolean[n];  
	        for (int i = 0; i < n; i++) {
	            if (visited[i] == true) {
	                continue;  
	            }
	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (my_record[i] == my_record[j]) {
	                    count++;
	                    visited[j] = true; 
	                }
	            }
	            System.out.println(my_record[i] + " occurs " + count + " times");
	        }
	    }
	}


