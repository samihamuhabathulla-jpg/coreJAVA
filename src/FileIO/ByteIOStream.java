package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteIOStream {

    public static void main(String[] args) {

        byte[] b = new byte[128];
        int count = 0;

        try (FileInputStream fs = new FileInputStream("Input.txt");
             FileOutputStream fo = new FileOutputStream("Output.txt")) {

            System.out.println("Bytes available: " + fs.available());

            int read;

            while ((read = fs.read(b)) != -1) {
                fo.write(b, 0, read);
                count += read;
            }

            System.out.println("Total Count: " + count);

        } 
        catch (FileNotFoundException f) {
            System.out.println("File not found " + f);
        } 
        catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}