package Java_String;
	import java.util.Scanner;

	public class LogSanitizer {

	    public static String sanitizeLog(String log) {
	    	
	        log = log.replaceAll("Password=[^;]*", "Password=************");

	        log = log.replaceAll("\\b\\d+\\.\\d+\\.\\d+\\.\\d+\\b", "xxx.xxx.xxx.xxx");

	        return log;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Log Entry:");
	        String input = sc.nextLine();

	        String result = sanitizeLog(input);

	        System.out.println("Sanitized Log:");
	        System.out.println(result);

	        sc.close();
	    }
	}


