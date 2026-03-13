package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteIOStreamChar {

    public static void main(String[] args) {

        char[] b = new char[128];

        try {
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);

            int count = 0;
            int read;
               while ((read = fr.read(b)) != -1) {

                fw.write(b, 0, read);
                count += read;
            }

            System.out.println("Total Count: " + count + " characters");

            fr.close();
            fw.close();

        } 
        catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found");
        } 
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}