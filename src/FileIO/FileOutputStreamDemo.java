package FileIO;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[]args) {
		String data = "Welcome to Java Portal!!HAve a Happy Learning";
		try {
			FileOutputStream output =new FileOutputStream("Output.txt");
			byte[]array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
