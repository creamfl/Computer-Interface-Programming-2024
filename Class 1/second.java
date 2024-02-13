import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class second {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Student\\IdeaProjects\\first\\src\\content.txt";
        int lines = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.readLine() != null) lines++;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of lines in the file: " + lines);
    }
}
