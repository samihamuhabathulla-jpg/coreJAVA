package FileIO;

import java.nio.file.*;
import java.io.IOException;

public class SoftLink {

    public static void main(String[] args) {

        Path originalFile = Paths.get("original.txt");
        Path softLink = Paths.get("softlink.txt");

        try {

            Files.write(originalFile, "Hello Java".getBytes());
            Files.createSymbolicLink(softLink, originalFile);

            System.out.println("Original file created: " + originalFile);
            System.out.println("Soft link created: " + softLink);

        } catch (IOException e) {
            System.out.println(e);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
    }
}