package FileIO;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("Text.txt");
		w.write("Hey Buddy");
		w.write("I am Akkshee");
		w.close();
		System.out.println("File created");
	}
}