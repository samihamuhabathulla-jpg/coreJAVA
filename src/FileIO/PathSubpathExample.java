package FileIO;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathSubpathExample {

    public static void main(String[] args) {

        FileSystem fs = FileSystems.getDefault();

        Path path = fs.getPath("C:", "Users", "Public", "Documents", "file.txt");

        System.out.println("Full Path: " + path);

        Path sub = path.subpath(1, 3);

        System.out.println("Subpath: " + sub);
    }
}			 

