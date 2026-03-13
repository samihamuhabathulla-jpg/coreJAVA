package FileIO;
import java.nio.file.*;
import java.util.*;

public class LongestWord {

	    public static void main(String[] args) throws Exception {

	        Path path = Paths.get("Text.txt");

	        List<String> lines = Files.readAllLines(path);

	        String longestWord = "";

	        for(String line : lines){

	            String[] words = line.split("\\s+");

	            for(String word : words){
	                if(word.length() > longestWord.length()){
	                    longestWord = word;
	                }
	            }
	        }

	        System.out.println("Longest word: " + longestWord);
	        System.out.println("Length: " + longestWord.length());
	    }
	}

