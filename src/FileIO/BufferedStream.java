package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

    public static void main(String[] args) {

        try (BufferedReader buffInput = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter buffOutput = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;

            while ((line = buffInput.readLine()) != null) {

                buffOutput.write(line);
                buffOutput.newLine();
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {

            System.out.println("Exception: " + e);
        }
    }
}